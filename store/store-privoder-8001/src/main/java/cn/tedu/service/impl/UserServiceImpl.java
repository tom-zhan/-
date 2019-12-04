package cn.tedu.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import cn.tedu.entity.User;
import cn.tedu.mapper.UserMapper;
import cn.tedu.service.UserService;
import cn.tedu.service.exception.SQLException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean addUser(User user) throws SQLException{
		User result=userMapper.findByUsername(user.getUsername());
		if(result!=null) {
			throw new SQLException("�û��Ѿ�����");
		}
		String salt=getSalt();
		user.setSalt(salt);
		String password=setPasswordEncryption(user.getPassword(),salt);
		user.setPassword(password);
		user.setIsDelete(0);
		user.setModifiedUser(user.getUsername());
		Date now=new Date();
		user.setModifiedTime(now);
		user.setCreatedUser(user.getUsername());
		user.setCreatedTime(now);;
		Integer rows=userMapper.insert(user);
		if(rows!=1) {
			throw new SQLException("����û��쳣");
		}
		return true;
	}
	@Override
	public User userLogin(User user) throws SQLException{
		User result=userMapper.findByUsername(user.getUsername());
		String password=setPasswordEncryption(user.getPassword(),result.getSalt());
		if(!password.equals(result.getPassword())) {
			System.out.println("�������");
			throw new SQLException("������������µ�¼");
		}
		return result;
	}
	@Override
	public User changePassword(String oldPassword,String newPassword,Integer uid)throws SQLException {
		User result=userMapper.selectByPrimaryKey(uid);
		String password=setPasswordEncryption(oldPassword,result.getSalt());
		if(!password.equals(result.getPassword())) {
			throw new SQLException("ԭ�������");
		}
		String changePassword=setPasswordEncryption(newPassword,result.getSalt());
		Integer rows=userMapper.changePassword(changePassword, uid);
		if(rows!=1) {
			throw new SQLException("�޸��������,���ݿ�����ʧ��,���Ժ�����");
		}
		return userMapper.selectByPrimaryKey(uid);
	}
	@Override
	public User infoUser(Integer uid) {
		return userMapper.selectByPrimaryKey(uid);
	}
	@Override
	public void changeUser(User user) throws SQLException{
		User result=userMapper.selectByPrimaryKey(user.getUid());
		if(result==null) {
			throw new SQLException("�û�������");
		}
		user.setModifiedTime(new Date());
		user.setModifiedUser(result.getUsername());
		userMapper.updateByPrimaryKeySelective(user);
	}
	@Override
	public void changeAvatar(String avatar, Integer uid) {
		User result=userMapper.selectByPrimaryKey(uid);
		if(result==null) {
			throw new SQLException("�û�������");
		}
		userMapper.changeAvatar(avatar, uid);
	}
	/**
	 * ���������
	 * @return
	 */
	public String getSalt() {
		// ���������
		String salt = UUID.randomUUID().toString().toUpperCase();
		return salt;
	}

	public String setPasswordEncryption(String password,String salt) {
		String result = salt + password + salt;
		for (int i = 0; i < 5; i++) {
			result = DigestUtils
					.md5DigestAsHex(result.getBytes()).toUpperCase();
		}
		return result;
	}
}
