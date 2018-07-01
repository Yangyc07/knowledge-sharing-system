package com.hjy.dao;

import com.hjy.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> getList();

    User selectLogin(String username, String md5Password);

    int checkUsername(String username);

    void deleteByUserIds(List<String> userList);
}