package cn.tedu.mapper;

import cn.tedu.entity.Cart;

public interface CartMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cart
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int deleteByPrimaryKey(Integer cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cart
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int insert(Cart record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cart
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int insertSelective(Cart record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cart
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	Cart selectByPrimaryKey(Integer cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cart
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int updateByPrimaryKeySelective(Cart record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cart
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int updateByPrimaryKey(Cart record);
}