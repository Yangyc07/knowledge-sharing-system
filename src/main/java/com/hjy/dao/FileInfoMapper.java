package com.hjy.dao;

import com.hjy.entity.FileInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;


public interface FileInfoMapper {
    int deleteByPrimaryKey(String fileHash);

    int insert(FileInfo record); //2

    int insertSelective(FileInfo record);

    FileInfo selectByPrimaryKey(String fileHash);

    int updateByPrimaryKeySelective(FileInfo record);

    int updateByPrimaryKey(FileInfo record);


    int insertFile(@Param("userId")Long userId, FileInfo fileInfo,  @Param("date")Date date);
}