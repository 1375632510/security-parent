package com.kris.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kris.server.entity.UserRole;
import com.kris.server.mapper.UserRoleMapper;
import com.kris.server.service.UserRoleService;
/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService{

}
