package com.hm.utils.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TokenCache {

    private static final Map<String, String> cache=new ConcurrentHashMap<>();

    public static void put(String token, String userId){
        cache.put(token,userId);
    }

    public static String get(String token){
        return cache.get(token);
    }
    public static void invalidate(String token){
        cache.remove(token);
    }
}
