package com.kris.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kris.server.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}