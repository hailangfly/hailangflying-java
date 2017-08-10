package com.hailangflying.sms.common.redis;


import org.redisson.Config;
import org.redisson.Redisson;

import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author lijh
 * @version V1.0
 * @date 2017/8/9 11:27
 */
public class RedisExample {


    public static void main(String[] ars){
        Config config = new Config();
        config.setConnectionPoolSize(10);
        config.addAddress("127.0.0.1:6379");
        Redisson redisson = Redisson.create(config);
        System.out.println("连接redis");
        ConcurrentMap<String,Object> map = redisson.getMap("FirstMap");
        map.put("czy","男");
        map.put("yinan","男");
        map.put("pengfei","女");

        ConcurrentMap resultMap = redisson.getMap("FirstMap");
        System.out.println("resultMap="+resultMap.keySet());

        Set myset = redisson.getSet("MySet");
        myset.add("czy");
        myset.add("pengfei");

        Set resultSet = redisson.getSet("MySet");
        System.out.println("resultSet="+resultSet.size());




        Queue myQueue = redisson.getQueue("FirstQueue");
        myQueue.add("wuguowei");
        myQueue.add("lili");
        myQueue.add("zhangsan");
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());


        Queue resultQueue = redisson.getQueue("FirstQueue");
        System.out.println("resultQueue===="+resultQueue);

        redisson.shutdown();




    }
}
