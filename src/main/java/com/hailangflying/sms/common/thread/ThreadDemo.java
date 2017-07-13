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
 * @date 2017/7/13 9:29
 */
public class ThreadDemo extends Thread {

     int num = 10;
    public void t1(){
        for(int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName() + "====" +i);
        }


    }


    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 10; i++) {

                num += 1;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "====i变量的值" + i + "===num变量的值：" + num);
            }
        }



    }
}
