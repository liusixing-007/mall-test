package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberMapper extends Mapper<UmsMember> {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);
}