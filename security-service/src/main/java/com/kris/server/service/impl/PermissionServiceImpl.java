package com.kris.server.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kris.server.mapper.PermissionMapper;
import com.kris.server.entity.Permission;
import com.kris.server.service.PermissionService;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Service
@RequiredArgsConstructor
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

    @Override
    public List<Permission> queryAllMenu() {
        return null;
    }

    @Override
    public List<Permission> selectAllMenu(String roleId) {
        return null;
    }

    @Override
    public void saveRolePermissionRealtionShip(String roleId, String[] permissionId) {

    }

    @Override
    public void removeChildById(String id) {

    }

    @Override
    public List<String> selectPermissionValueByUserId(String id) {
        return null;
    }

    @Override
    public List<ObjectMapper> selectPermissionByUserId(String id) {
        return null;
    }

    @Override
    public List<Permission> queryAllMenuGuli() {
        return null;
    }

    @Override
    public void removeChildByIdGuli(String id) {

    }

    @Override
    public void saveRolePermissionRealtionShipGuli(String roleId, String[] permissionId) {

    }
}
