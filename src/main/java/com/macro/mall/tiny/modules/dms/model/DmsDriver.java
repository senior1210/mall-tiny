package com.macro.mall.tiny.modules.dms.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @author macro
 * @since 2020-11-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dms_driver")
@ApiModel(value="DmsDriver对象", description="")
public class DmsDriver implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "司机id")
    @TableId(value = "driver_id", type = IdType.AUTO)
    private Long driverId;

    @ApiModelProperty(value = "司机名称")
    private String driverName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "司机级别")
    private Boolean userRank;

    @ApiModelProperty(value = "城市id")
    private Integer cityId;

    @ApiModelProperty(value = "渠道")
    private String channel;

    @ApiModelProperty(value = "平台")
    private String platform;

    @ApiModelProperty(value = "推送CID")
    @TableField("pushCID")
    private String pushCID;

    @ApiModelProperty(value = "推送token")
    @TableField("pushToken")
    private String pushToken;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "酒店")
    private Integer wineshopId;

    @ApiModelProperty(value = "司机状态")
    private Boolean acceptModel;

    @ApiModelProperty(value = "邀请码")
    private String inviteCode;

    private Integer parentId;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "问题")
    private String question;

    @ApiModelProperty(value = "答案")
    private String answer;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "性别")
    private Boolean sex;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "可用资金")
    private BigDecimal driverMoney;

    @ApiModelProperty(value = "保证金")
    private BigDecimal cautionMoney;

    @ApiModelProperty(value = "冻结资金")
    private BigDecimal frozenMoney;

    @ApiModelProperty(value = "积分值")
    private Integer payPoints;

    @ApiModelProperty(value = "等级值")
    private Integer rankPoints;

    @ApiModelProperty(value = "地址id")
    private Integer addressId;

    @ApiModelProperty(value = "注册时间")
    private Integer regTime;

    @ApiModelProperty(value = "注册纬度")
    private BigDecimal regLat;

    @ApiModelProperty(value = "注册经度")
    private BigDecimal regLng;

    private Integer lastLogin;

    private Double lastLat;

    private Double lastLng;

    private Date lastTime;

    private String lastIp;

    private Integer lastLockMsgid;

    private Integer visitCount;

    private Integer isSpecial;

    private String ecSalt;

    private String salt;

    private Integer flag;

    private String alias;

    private String msn;

    private String qq;

    private String officePhone;

    private String homePhone;

    private String mobilePhone;

    private Integer isValidated;

    private BigDecimal creditLine;

    private String passwdQuestion;

    private String passwdAnswer;

    @ApiModelProperty(value = "实名")
    private Boolean realname;

    @ApiModelProperty(value = "审核状态")
    private Integer verifyStatus;


}
