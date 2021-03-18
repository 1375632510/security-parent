package com.kris.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kris.server.entity.Role;
import com.kris.server.mapper.RoleMapper;
import com.kris.server.service.RoleService;
/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService{

}
