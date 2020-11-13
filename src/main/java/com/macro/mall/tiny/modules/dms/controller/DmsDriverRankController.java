package com.macro.mall.tiny.modules.dms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.dms.model.DmsDriverRank;
import com.macro.mall.tiny.modules.dms.service.DmsDriverRankService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuxiangmei
 * @since 2020-11-13
 */
@Controller
@Api(tags = "DmsDriverRankController", description = "司机等级管理")
@RequestMapping("/dmsDriverRank")
public class DmsDriverRankController {
    @Autowired
    private DmsDriverRankService dmsDriverRankService;

    @ApiOperation("查询所有司机等级")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DmsDriverRank>> listAll() {
        List<DmsDriverRank> resourceList = dmsDriverRankService.listAll();
        return CommonResult.success(resourceList);
    }

    @ApiOperation("添加司机等级")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody DmsDriverRank dmsDriverRank) {
        boolean success = dmsDriverRankService.create(dmsDriverRank);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改司机等级")
    @RequestMapping(value = "/update/{rankId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Integer id,
                               @RequestBody DmsDriverRank dmsDriverRank) {
        dmsDriverRank.setRankId(id);
        boolean success = dmsDriverRankService.updateById(dmsDriverRank);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据ID删除司机等级")
    @RequestMapping(value = "/delete/{rankId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        boolean success = dmsDriverRankService.removeById(id);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }
}

