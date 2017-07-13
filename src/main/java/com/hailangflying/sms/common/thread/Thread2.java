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
 *
 * 如果一个类继承Thread，则不适合资源共享。但是如果实现了Runable接口的话，则很容易的实现资源共享。

 实现Runnable接口比继承Thread类所具有的优势：

 1）：适合多个相同的程序代码的线程去处理同一个资源

 2）：可以避免java中的单继承的限制

 3）：增加程序的健壮性，代码可以被多个线程共享，代码和数据独立

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
    // 这里要注意每个线程都是用同一个实例化对象，如果不是同一个，效果就和上面的一样了！
    // 提醒一下大家：main方法其实也是一个线程。在java中所有的线程都是同时启动的，至于什么时候，哪个先执行，完全看谁先得到CPU的资源。
    // 在java中，每次程序运行至少启动2个线程。一个是main线程，一个是垃圾收集线程。因为每当使用java命令执行一个类的时候，实际上都会启动一个jvm，每一个jvm实际上就是在操作系统中启动了一个进程。



}
