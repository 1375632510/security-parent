package com.kris.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kris.server.entity.RolePermission;
import com.kris.server.mapper.RolePermissionMapper;
import com.kris.server.service.RolePermissionService;
/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService{

}
