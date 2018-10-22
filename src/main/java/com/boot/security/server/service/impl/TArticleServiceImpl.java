package com.boot.security.server.service.impl;

import com.boot.security.server.dao.TArticleContentDao;
import com.boot.security.server.dao.TArticleDao;
import com.boot.security.server.dao.TArticleclassificationDao;
import com.boot.security.server.model.TArticle;
import com.boot.security.server.model.TArticleContent;
import com.boot.security.server.model.TArticleclassification;
import com.boot.security.server.service.TArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private TArticleContentDao tArticleContentDao;

    @Autowired
    private TArticleclassificationDao tArticleclassificationDao;

    @Override
    public void save(TArticle tArticle) {
        TArticleContent tArticleContent = new TArticleContent();
        tArticleContent.setContent(tArticle.getContent());
        tArticleContentDao.save(tArticleContent);
        Integer contentId = tArticleContentDao.getMaxId();

        tArticle.setContentId(contentId);
        tArticleDao.save(tArticle);
    }

    @Override
    public Map<String,Object> getById(Integer id) {

        Map<String,Object> map = new HashMap<>();

        TArticle tArticle = tArticleDao.getById(Integer.valueOf(id).longValue());
        TArticleContent tArticleContent = null;
        List<TArticleclassification> tArticleclassificationList =null;

        if(tArticle != null){
            tArticleContent = tArticleContentDao.getById(Integer.valueOf(tArticle.getContentId()).longValue());
            tArticleclassificationList = tArticleclassificationDao.getList();
        }


        map.put("tArticle",tArticle);
        map.put("tArticleContent",tArticleContent);
        map.put("tArticleclassificationList",tArticleclassificationList);

        return map;
    }

    @Override
    public void update(TArticle tArticle) {

        tArticleDao.update(tArticle);

        TArticleContent tArticleContent = new TArticleContent();
        tArticleContent.setId(Integer.valueOf(tArticle.getContentId()).longValue());
        tArticleContent.setContent(tArticle.getContent());
        tArticleContentDao.update(tArticleContent);

    }
}