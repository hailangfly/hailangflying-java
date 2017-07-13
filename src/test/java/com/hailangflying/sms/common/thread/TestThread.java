package com.hailangflying.sms.common.thread;

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
 * @date 2017/7/13 9:32
 */
public class TestThread {

    public static void main(String[] a) throws InterruptedException {
        ThreadDemo t1 = new ThreadDemo();
        t1.t1();
        t1.start();

        new Thread(t1).start();

        Thread.sleep(10000);



    }
}
