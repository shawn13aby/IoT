package com.shawn13aby.iot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import javax.annotation.Resource;

@Slf4j
@SpringBootApplication
public class IotApplication implements CommandLineRunner {
    private RedisTemplate redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(IotApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(redisTemplate.getClientList().get(0).toString());
    }

    @Resource
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

}
