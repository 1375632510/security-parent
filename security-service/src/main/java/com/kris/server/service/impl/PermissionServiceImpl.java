package com.kris.server.service.impl;

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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService{

}
