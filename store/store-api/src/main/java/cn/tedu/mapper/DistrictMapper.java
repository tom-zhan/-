package cn.tedu.mapper;

import cn.tedu.entity.District;

public interface DistrictMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_dict_district
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_dict_district
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int insert(District record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_dict_district
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int insertSelective(District record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_dict_district
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	District selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_dict_district
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int updateByPrimaryKeySelective(District record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_dict_district
	 * @mbg.generated  Sat Nov 30 19:42:58 CST 2019
	 */
	int updateByPrimaryKey(District record);
}