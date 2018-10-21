package com.boot.security.server.service.impl;

import com.boot.security.server.dao.TArticleContentDao;
import com.boot.security.server.dao.TArticleDao;
import com.boot.security.server.model.TArticle;
import com.boot.security.server.model.TArticleContent;
import com.boot.security.server.service.TArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public void save(TArticle tArticle) {
        TArticleContent tArticleContent = new TArticleContent();
        tArticleContent.setContent(tArticle.getContent());
        tArticleContentDao.save(tArticleContent);
        Integer contentId = tArticleContentDao.getMaxId();

        tArticle.setContentId(contentId);
        tArticleDao.save(tArticle);
    }
}