package cn.tedu.service;

import java.util.List;

import cn.tedu.entity.Address;

/**
 * �ջ��ַ
 *
 */
public interface AddressService {
	/**
	 * ����û��ջ��ַ
	 * @param address
	 */
	public void addAddress(Address address);
	
	/**
	 * ��ѯ�û��ջ��ַ
	 */
	public List<Address> findByUid(Integer uid);
	
	/**
	 * �޸�Ĭ���ջ��ַ
	 * @param uid
	 * @param aid
	 */
	public void changeDefault(Integer uid,Integer aid);
}
