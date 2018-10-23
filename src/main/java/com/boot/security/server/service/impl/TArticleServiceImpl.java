package com.boot.security.server.service.impl;

import com.boot.security.server.dao.TArticleDao;
import com.boot.security.server.dao.TArticleclassificationDao;
import com.boot.security.server.model.TArticle;
import com.boot.security.server.model.TArticleclassification;
import com.boot.security.server.service.TArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jax.zou
 * @create 2018-10-21 15:06
 * @desc 文章管理业务实现类
 **/
@Service
public class TArticleServiceImpl implements TArticleService {

    @Autowired
    private TArticleDao tArticleDao;

    @Autowired
    private TArticleclassificationDao tArticleclassificationDao;

    @Override
    public void save(TArticle tArticle) {
        if(tArticle.getStatus() == null){
            tArticle.setStatus("off");
        }
        if(tArticle.getIsNew() == null){
            tArticle.setIsNew("off");
        }
        if(tArticle.getIsRecommend() == null){
            tArticle.setIsRecommend("off");
        }
        Date date = new Date();
        tArticle.setCreateTime(date);
        tArticle.setUpdateTime(date);
        tArticleDao.insertSelective(tArticle);
    }

    @Override
    public Map<String,Object> getById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        TArticle tArticle = tArticleDao.getById(Integer.valueOf(id).longValue());
        List<TArticleclassification> tArticleclassifications = tArticleclassificationDao.getList();
        map.put("tArticle",tArticle);
        map.put("tArticleclassifications",tArticleclassifications);
        return map;
    }

    @Override
    public void update(TArticle tArticle) {
        if(tArticle.getStatus() == null){
            tArticle.setStatus("off");
        }
        if(tArticle.getIsNew() == null){
            tArticle.setIsNew("off");
        }
        if(tArticle.getIsRecommend() == null){
            tArticle.setIsRecommend("off");
        }
        tArticle.setUpdateTime(new Date());
        Example example = new Example(TArticle.class);
        example.createCriteria().andEqualTo("id",tArticle.getId());
        tArticleDao.updateByExample(tArticle,example);
    }
}