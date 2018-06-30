package com.hjy.dao;

import com.hjy.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getList();

    int checkUsername(String username);

    User selectLogin(@Param("username") String username, @Param("password")String password);

    int deleteByUserIds(@Param("userIdList")List<String> userIdList);


}