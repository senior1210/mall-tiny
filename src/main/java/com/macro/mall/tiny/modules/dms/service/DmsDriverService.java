package com.macro.mall.tiny.modules.dms.service;

import com.macro.mall.tiny.modules.dms.model.DmsDriver;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author macro
 * @since 2020-11-12
 */
public interface DmsDriverService extends IService<DmsDriver> {
    public boolean create(DmsDriver dmsDriver);
    public boolean update(Long id,DmsDriver dmsDriver);
    public Page<DmsDriver> list(Long rankId, Long acceptModelId , Long realNmaeId, Long verifyStatusId, Long minPayPoints, Long maxPayPoints, String phoneKeyword, String nameKeyword, Long minRegTime,Long maxRegTime, Integer pageSize, Integer pageNum);
}
