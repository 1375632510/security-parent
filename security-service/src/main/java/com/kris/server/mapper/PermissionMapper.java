package com.kris.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kris.server.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

    /**
     *
     * @param id
     * @return
     */
    List<String> selectPermissionValueByUserId(@Param("id") String id);

    /**
     * @return
     */
    List<String> selectAllPermissionValue();

    /**
     *
     * @param userId
     * @return
     */
    List<Permission> selectPermissionByUserId(String userId);
}
