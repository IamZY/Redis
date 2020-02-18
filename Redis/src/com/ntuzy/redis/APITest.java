package com.ntuzy.redis;

import redis.clients.jedis.Jedis;

/**
 * @Author IamZY
 * @create 2020/2/18 21:02
 */
public class APITest {
    public static void main(String[] args){
        Jedis jedis = new Jedis("192.168.52.100",6379);

        jedis.set("k10","v10");
        jedis.set("k11","v11");
        jedis.set("k12","v12");

        String v10 = jedis.get("k10");
        System.out.println(v10);
    }
}
