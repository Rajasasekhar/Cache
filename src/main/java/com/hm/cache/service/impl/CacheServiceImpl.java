package com.hm.cache.service.impl;

import com.hm.cache.service.CacheService;
import com.hm.utils.cache.TokenCache;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class CacheServiceImpl implements CacheService {
    @Override
    public void storeToken(String token, String userId) {
        TokenCache.put(token,userId);
    }

    @Override
    @Cacheable(value = "tokens", key = "#token")
    public String getUserId(String token) {
        return TokenCache.get(token);
    }

    @Override
    @CacheEvict(value = "tokens", key = "#token")
    public void invalidateToken(String token) {
        TokenCache.invalidate(token);
    }
}
