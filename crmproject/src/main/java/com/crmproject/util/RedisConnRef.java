package com.crmproject.util;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

//Mybatis二级缓存中间类 注入connectionFactory
public class RedisConnRef {

    public void setConnectionFactory(JedisConnectionFactory connectionFactory) {
        RedisCache.setJedisConnectionFactory(connectionFactory);
    }
}
