package com.macro.mall.tiny.modules.dms.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuxiangmei
 * @since 2020-11-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dms_driver_rank")
@ApiModel(value="DmsDriverRank对象", description="")
public class DmsDriverRank implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "等级ID")
    @TableId(value = "rank_id", type = IdType.AUTO)
    private Integer rankId;

    @ApiModelProperty(value = "等级名称")
    private String rankName;

    @ApiModelProperty(value = "积分下限")
    private Integer minPoints;

    @ApiModelProperty(value = "积分上限")
    private Integer maxPoints;

    @ApiModelProperty(value = "初始折扣率")
    private Integer discount;

    @ApiModelProperty(value = "显示价格")
    private Boolean showPrice;

    @ApiModelProperty(value = "特殊司机组")
    private Boolean specialRank;


}
