package com.hjy.dao;

import com.hjy.entity.Course;
import com.hjy.entity.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {

    int deleteByPrimaryKey(String courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    List<Course> getList();

	void deleteByCourseIds(@Param("courseIdList")List<String> courseIdList);

	List<Course> getListByMajorName(String majorName);
}