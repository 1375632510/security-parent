package com.kris.server.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kris.server.service.IndexService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: chenyu
 * @Date: 2021/3/22
 */
@Service
@RequiredArgsConstructor
public class IndexServiceImpl implements IndexService {

    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public Map<String, Object> getUserInfo(String username) {
        return null;
    }

    @Override
    public List<ObjectMapper> getMenu(String username) {
        return null;
    }
}
