package com.macro.mall.tiny.modules.dms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.dms.model.DmsDriver;
import com.macro.mall.tiny.modules.dms.service.DmsDriverService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  司机管理
 * </p>
 *
 * @author macro
 * @since 2020-11-13
 */
@Controller
@Api(tags = "DmsDriverController", description = "司机管理")
@RequestMapping("/driver")
public class DmsDriverController {
    @Autowired
    private DmsDriverService driverService;
    @ApiOperation("分页模糊查询司机")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsDriver>> list(@RequestParam(required = false) Long rankId,
                                                    @RequestParam(required = false) Long acceptModelId,
                                                    @RequestParam(required = false) Long realNmaeId,
                                                    @RequestParam(required = false) Long verifyStatusId,
                                                    @RequestParam(required = false) Long minPayPoints,
                                                    @RequestParam(required = false) Long maxPayPoints,
                                                    @RequestParam(required = false) String phoneKeyword,
                                                    @RequestParam(required = false) String nameKeyword,
                                                    @RequestParam(required = false) Long minRegTime,
                                                    @RequestParam(required = false) Long maxRegTime,
                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<DmsDriver> resourceList = driverService.list(rankId,acceptModelId, realNmaeId,verifyStatusId,minPayPoints,maxPayPoints,phoneKeyword,nameKeyword,minRegTime ,maxRegTime,pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(resourceList));
    }
}

