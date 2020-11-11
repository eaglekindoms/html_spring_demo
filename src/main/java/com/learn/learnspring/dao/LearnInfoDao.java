package com.learn.learnspring.dao;

import com.learn.learnspring.entity.LearnInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LearnInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(LearnInfo record);

    int insertSelective(LearnInfo record);

    LearnInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LearnInfo record);

    int updateByPrimaryKey(LearnInfo record);
}