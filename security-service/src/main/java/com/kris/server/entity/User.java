package com.kris.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
/**
    * 用户表
    */
@ApiModel(value="com-kris-server-entity-User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "kris_user")
public class User implements Serializable {
    /**
     * 会员id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="会员id")
    private String id;

    /**
     * 微信openid
     */
    @TableField(value = "username")
    @ApiModelProperty(value="微信openid")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    @ApiModelProperty(value="昵称")
    private String nickName;

    /**
     * 用户头像
     */
    @TableField(value = "salt")
    @ApiModelProperty(value="用户头像")
    private String salt;

    /**
     * 用户签名
     */
    @TableField(value = "token")
    @ApiModelProperty(value="用户签名")
    private String token;

    /**
     * 逻辑删除 1（true）已删除， 0（false）未删除
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value="逻辑删除 1（true）已删除， 0（false）未删除")
    private Integer isDeleted;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
