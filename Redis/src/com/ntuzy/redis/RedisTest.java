package com.ntuzy.redis;

import redis.clients.jedis.Jedis;

/**
 * @Author IamZY
 * @create 2020/2/18 20:52
 */
public class RedisTest {
    public static void main(String[] args){
        Jedis jedis = new Jedis("192.168.52.100",6379);
        System.out.println(jedis.ping());
    }
}
