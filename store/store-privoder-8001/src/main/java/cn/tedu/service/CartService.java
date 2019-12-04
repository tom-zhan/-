package cn.tedu.service;

import java.util.List;

import cn.tedu.entity.Cart;
import cn.tedu.entity.vo.CartAndGoodsVO;

public interface CartService {

	/**
	 * �����Ʒ����
	 * @param cart
	 */
	public void addCatr(Cart cart);
	
	/**
	 * ��ѯ�û����й��ﳵ����
	 */
	public List<Cart> findByUid(Integer uid);
	
	/**
     * ���ݹ��ﳵid��ѯ���ﳵ����
     */
	public List<CartAndGoodsVO> findBycids(Integer[] cids);
}
