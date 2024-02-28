package com.hm.cache.service;

public interface CacheService {

    public void storeToken(String token,String userId);

    public String getUserId(String token);

    public void invalidateToken(String token);
}
