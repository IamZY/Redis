package com.ntuzy.redis;

import redis.clients.jedis.Jedis;

/**
 * @Author IamZY
 * @create 2020/2/18 21:21
 */
public class TestMS {
    public static void main(String[] args) throws InterruptedException
    {
        Jedis jedis_M = new Jedis("192.168.52.100",6379);
        Jedis jedis_S = new Jedis("192.168.52.100",6380);

        jedis_S.slaveof("192.168.52.100",6379);

        jedis_M.set("k6","v6");
        Thread.sleep(500);
        System.out.println(jedis_S.get("k6"));
    }
}
