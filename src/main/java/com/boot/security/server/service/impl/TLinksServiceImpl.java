package com.boot.security.server.service.impl;

import com.boot.security.server.dao.TLinksDao;
import com.boot.security.server.model.TLinks;
import com.boot.security.server.service.TLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class TLinksServiceImpl  extends BaseServiceImpl<TLinks> implements TLinksService{

    @Autowired
    private TLinksDao tLinksDao;

    @Override
    public void updateById(TLinks tLinks) {
        Example example = new Example(TLinks.class);
        example.createCriteria().andEqualTo("id",tLinks.getId());
        tLinksDao.updateByExampleSelective(tLinks,example);
    }
}
