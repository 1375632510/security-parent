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
    * 权限
    */
@ApiModel(value="com-kris-server-entity-Permission")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "kris_permission")
public class Permission implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    @ApiModelProperty(value="编号")
    private String id;

    /**
     * 所属上级
     */
    @TableField(value = "pid")
    @ApiModelProperty(value="所属上级")
    private String pid;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="名称")
    private String name;

    /**
     * 类型(1:菜单,2:按钮)
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="类型(1:菜单,2:按钮)")
    private Integer type;

    /**
     * 权限值
     */
    @TableField(value = "permission_value")
    @ApiModelProperty(value="权限值")
    private String permissionValue;

    /**
     * 访问路径
     */
    @TableField(value = "`path`")
    @ApiModelProperty(value="访问路径")
    private String path;

    /**
     * 组件路径
     */
    @TableField(value = "component")
    @ApiModelProperty(value="组件路径")
    private String component;

    /**
     * 图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="图标")
    private String icon;

    /**
     * 状态(0:禁止,1:正常)
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态(0:禁止,1:正常)")
    private Integer status;

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
