package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.TLinks;

@Mapper
public interface TLinksDao extends tk.mybatis.mapper.common.Mapper<TLinks>{

    @Select("select * from t_links t where t.id = #{id}")
    TLinks getById(Long id);

    int update(TLinks tLinks);

    int count(@Param("params") Map<String, Object> params);

    List<TLinks> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
