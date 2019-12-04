package cn.tedu.service;

import java.util.List;

import cn.tedu.entity.Goods;

public interface GoodsService {
	/**
	 * ģ����ѯ����
	 * @param title
	 * @param page
	 * @return
	 */
	public List<Goods> findByTitleList(String title,Integer page);

	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	public Goods findById(String id);
}
