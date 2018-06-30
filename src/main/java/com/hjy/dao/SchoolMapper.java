package com.hjy.dao;

import com.hjy.entity.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(String schoolId);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(String schoolId);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

	List<School> getList();

    int deleteBySchoolIds(@Param("schoolIdList")List<String> schoolIdList);
}