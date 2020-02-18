package com.ntuzy.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author IamZY
 * @create 2020/2/18 21:24
 */
public class TestPool {
    public static void main(String[] args){
        JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
        Jedis jedis = null;

        try
        {
            jedis = jedisPool.getResource();
            jedis.set("k18","v183");

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JedisPoolUtil.release(jedisPool, jedis);
        }

    }
}
