package com.boot.security.server.service.impl;

import com.boot.security.server.dao.TProductKindDao;
import com.boot.security.server.model.TProductKind;
import com.boot.security.server.service.TProductKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TProductKindServiceImpl extends BaseServiceImpl<TProductKind> implements TProductKindService {

    @Autowired
    private TProductKindDao tProductKindDao;

    @Override
    public void deleteById(Long id) {
        tProductKindDao.deleteByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Map<String,Object> map = new HashMap<>();
        TProductKind productKind = new TProductKind();
        productKind.setUpdateTime(null);
        productKind.setId(id);
        TProductKind tProductKind = tProductKindDao.selectOne(productKind);

        List<TProductKind> tProductKindList = tProductKindDao.selectAll();

        map.put("tProductKind",tProductKind);
        map.put("tProductKindList",tProductKindList);

        return map;
    }

    @Override
    public void updateById(TProductKind tProductKind) {
        Example example = new Example(TProductKind.class);
        example.createCriteria().andEqualTo("id",tProductKind.getId());
        tProductKindDao.updateByExampleSelective(tProductKind,example);
    }


}
