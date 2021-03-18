package com.kris.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kris.server.mapper.UserMapper;
import com.kris.server.entity.User;
import com.kris.server.service.UserService;
/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
