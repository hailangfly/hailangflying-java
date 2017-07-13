package com.hailangflying.sms.common.thread;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *多线程学习 实现runnable，资源能共享
 * 多线程需要资源进行共享时可实现
 * @author lijh
 * @version V1.0
 * @date 2017/7/13 14:13
 */

public class Thread2 implements Runnable{

    //
    private int count = 5;

    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "====" + name + "运行  count= " + count--);
                try {
                    Thread.sleep((int) Math.random() * 10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        //}
    }



    public static void main(String[] args) {
        Thread2 mTh = new Thread2("xxx");
        new Thread(mTh, "C").start();//同一个mTh，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常
        new Thread(mTh, "D").start();
        new Thread(mTh, "E").start();
    }
}
