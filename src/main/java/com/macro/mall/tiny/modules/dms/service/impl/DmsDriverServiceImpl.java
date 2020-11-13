package com.macro.mall.tiny.modules.dms.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.dms.model.DmsDriver;
import com.macro.mall.tiny.modules.dms.mapper.DmsDriverMapper;
import com.macro.mall.tiny.modules.dms.service.DmsDriverService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author macro
 * @since 2020-11-12
 */
@Service
public class DmsDriverServiceImpl extends ServiceImpl<DmsDriverMapper, DmsDriver> implements DmsDriverService {

    @Override
    public boolean create(DmsDriver dmsDriver) {
        return false;
    }

    @Override
    public boolean update(Long id, DmsDriver dmsDriver) {
        return false;
    }

    @Override
    public Page<DmsDriver> list(Long rankId, Long acceptModelId, Long realNmaeId, Long verifyStatusId, Long minPayPoints, Long maxPayPoints, String phoneKeyword, String nameKeyword, Long minRegTime, Long maxRegTime, Integer pageSize, Integer pageNum) {
        Page<DmsDriver> page = new Page<>(pageNum,pageSize);
        QueryWrapper<DmsDriver> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<DmsDriver> lambda = wrapper.lambda();
        if(rankId!=null){
            lambda.eq(DmsDriver::getUserRank,rankId);
        }
        if(acceptModelId!=null){
            lambda.eq(DmsDriver::getAcceptModel,acceptModelId);
        }
        if(realNmaeId!=null){
            lambda.eq(DmsDriver::getRealname,realNmaeId);
        }
        if(verifyStatusId!=null){
            lambda.eq(DmsDriver::getVerifyStatus,verifyStatusId);
        }
        if(minPayPoints!=null){
            lambda.ge(DmsDriver::getPayPoints,minPayPoints);
        }
        if(maxPayPoints!=null){
            lambda.le(DmsDriver::getPayPoints,maxPayPoints);
        }
        if(minRegTime!=null){
            lambda.ge(DmsDriver::getRegTime,minRegTime);
        }
        if(maxRegTime!=null){
            lambda.le(DmsDriver::getRegTime,maxRegTime);
        }
        if(StrUtil.isNotEmpty(phoneKeyword)){
            lambda.like(DmsDriver::getMobilePhone,phoneKeyword);
        }
        if(StrUtil.isNotEmpty(nameKeyword)){
            lambda.like(DmsDriver::getName,nameKeyword);
        }
        return page(page,wrapper);
    }


}
