package com.shawn13aby.iot.connector;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Shawn Fu (shawn13aby@gmail.com)
 * created on 2022/2/22
 */
@Component
public class RedisConnector {

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();

        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName("192.168.214.2");
        redisStandaloneConfiguration.setPort(6379);
        redisStandaloneConfiguration.setDatabase(1);
        redisStandaloneConfiguration.setPassword("password");

        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration);
        jedisConnectionFactory.afterPropertiesSet();

        template.setConnectionFactory(jedisConnectionFactory);
        return template;
    }

}