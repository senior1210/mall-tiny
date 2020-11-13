package com.macro.mall.tiny.modules.dms.service;

import com.macro.mall.tiny.modules.dms.model.DmsDriverRank;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxiangmei
 * @since 2020-11-13
 */
public interface DmsDriverRankService extends IService<DmsDriverRank> {

    List<DmsDriverRank> listAll();
    /**
     * 创建司机等级
     */
    boolean create(DmsDriverRank dmsDriverRank);

    /**
     * 修改资源
     */
    boolean update(Integer id, DmsDriverRank umsResource);

    /**
     * 删除资源
     */
    boolean delete(Long id);
}
