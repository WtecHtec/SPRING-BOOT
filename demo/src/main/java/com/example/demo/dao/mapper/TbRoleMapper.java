package com.example.demo.dao.mapper;

import com.example.demo.dao.pojo.TbRole;
import java.util.List;

public interface TbRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
	 * @mbg.generated  Sat Sep 08 15:31:37 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
	 * @mbg.generated  Sat Sep 08 15:31:37 CST 2018
	 */
	int insert(TbRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
	 * @mbg.generated  Sat Sep 08 15:31:37 CST 2018
	 */
	TbRole selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
	 * @mbg.generated  Sat Sep 08 15:31:37 CST 2018
	 */
	List<TbRole> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_role
	 * @mbg.generated  Sat Sep 08 15:31:37 CST 2018
	 */
	int updateByPrimaryKey(TbRole record);
}