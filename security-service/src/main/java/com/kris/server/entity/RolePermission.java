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
    * 角色权限
    */
@ApiModel(value="com-kris-server-entity-RolePermission")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "kris_role_permission")
public class RolePermission implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private String id;

    @TableField(value = "role_id")
    @ApiModelProperty(value="")
    private String roleId;

    @TableField(value = "permission_id")
    @ApiModelProperty(value="")
    private String permissionId;

    /**
     * 逻辑删除 1（true）已删除， 0（false）未删除
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value="逻辑删除 1（true）已删除， 0（false）未删除")
    private Byte isDeleted;

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
