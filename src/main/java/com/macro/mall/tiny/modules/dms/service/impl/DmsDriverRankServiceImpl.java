package com.macro.mall.tiny.modules.dms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.macro.mall.tiny.modules.dms.model.DmsDriverRank;
import com.macro.mall.tiny.modules.dms.mapper.DmsDriverRankMapper;
import com.macro.mall.tiny.modules.dms.service.DmsDriverRankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuxiangmei
 * @since 2020-11-13
 */
@Service
public class DmsDriverRankServiceImpl extends ServiceImpl<DmsDriverRankMapper, DmsDriverRank> implements DmsDriverRankService {

    @Override
    public List<DmsDriverRank> listAll() {
        QueryWrapper<DmsDriverRank> wrapper = new QueryWrapper<>();
        wrapper.lambda().orderByAsc(DmsDriverRank::getRankId);
        return list(wrapper);
    }

    @Override
    public boolean create(DmsDriverRank dmsDriverRank) {
        return save(dmsDriverRank);
    }

    @Override
    public boolean update(Integer id, DmsDriverRank dmsDriverRank) {
        dmsDriverRank.setRankId(id);
        boolean success = updateById(dmsDriverRank);
        return success;
    }

    @Override
    public boolean delete(Long id) {
        return removeById(id);
    }
}
