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
 * @date 2017/7/13 14:07
 */
public class Thread1 extends Thread {

    private int count = 5;

    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name + "运行  count= " + count--);
            try {
                sleep((int)Math.random() * 10 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] a){
        Thread1 t1 = new Thread1("A");
        Thread1 t2 = new Thread1("B");

        t1.start();
        t2.start();
    }
}
