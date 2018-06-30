package com.hjy.dao;

import com.hjy.entity.Course;
import com.hjy.entity.Major;
import com.hjy.entity.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MajorMapper {
    int deleteByPrimaryKey(String majorId);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(String majorId);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);

    List<Major> getList();

    int deleteByMajorIds(@Param("majorIdList")List<String> majorIdList);

}