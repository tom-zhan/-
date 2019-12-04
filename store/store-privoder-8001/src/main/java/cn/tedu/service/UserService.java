package cn.tedu.service;

import cn.tedu.entity.User;

/**
 * �û���־ò�
 */
public interface UserService {
	
	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);
	
	/**
	 * �û���¼
	 * @param user
	 * @return
	 */
	public User userLogin(User user);
	/**
	 * �޸��û�����
	 * @param user
	 * @return
	 */
	public User changePassword(String oldPassword,String newPassword,Integer uid);
	
	/**
	 * ����uid��ѯ�û���Ϣ
	 */
	public User infoUser(Integer uid);
	
	/**
	 * �޸��û���Ϣ
	 * @param user
	 */
	public void changeUser(User user);
	/**
	 * �ϴ�ͷ��
	 * @param avatar
	 * @param uid
	 */
	public void changeAvatar(String avatar,Integer uid);
}
