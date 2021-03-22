package com.kris.server.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: chenyu
 * @Date: 2021/3/22
 */
public interface IndexService {

    /**
     * 根据用户名获取用户登录信息
     * @param username
     * @return
     */
    Map<String, Object> getUserInfo(String username);

    /**
     * 根据用户名获取动态菜单
     * @param username
     * @return
     */
    List<ObjectMapper> getMenu(String username);
}
