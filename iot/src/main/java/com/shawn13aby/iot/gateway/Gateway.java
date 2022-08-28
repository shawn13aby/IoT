package com.shawn13aby.iot.gateway;

import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;

/**
 * @author Shawn Fu (shawn13aby@gmail.com)
 * created on 2022/2/22
 */
@RedisHash("Gateway")
@AllArgsConstructor
public class Gateway implements Serializable {
    public enum Status {
        STANDBY, ACTIVE,
    }

    private String id;
    private Status status;
}
