package cn.tedu.mapper;

import cn.tedu.entity.Goods;

public interface GoodsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int insert(Goods record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int insertSelective(Goods record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	Goods selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int updateByPrimaryKeySelective(Goods record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int updateByPrimaryKey(Goods record);
}