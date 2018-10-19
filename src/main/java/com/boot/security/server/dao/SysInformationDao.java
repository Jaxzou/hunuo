package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.SysInformation;

@Mapper
public interface SysInformationDao {

    @Select("select * from sys_information t where t.information_id = #{id}")
    SysInformation getById(Long id);

    int update(SysInformation sysInformation);

}
