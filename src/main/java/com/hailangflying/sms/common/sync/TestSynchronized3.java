package com.hailangflying.sms.common.sync;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *synchronized  可以锁对象   也可以锁类（抽象概念，即synchronized修饰的静态变量或静态方法时称之为类所拥有的锁）
 * synchronized修饰的类方法或者锁非静态代码块时   两者的锁是互不干扰的
 * @author lijh
 * @version V1.0
 * @date 2017/7/13 15:16
 */
public class TestSynchronized3
{
    public /*static*/ synchronized void test1()
    {
        int i = 5;
        while( i-- > 0)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ie)
            {
            }
        }
    }

    public static synchronized void test2()
    {
        int i = 5;
        while( i-- > 0)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ie)
            {
            }
        }
    }

    public static void main(String[] args)
    {
        final TestSynchronized3 myt2 = new TestSynchronized3();
        Thread test1 = new Thread(  new Runnable() {  public void run() {  myt2.test1();  }  }, "test1"  );
        Thread test2 = new Thread(  new Runnable() {  public void run() { TestSynchronized3.test2();   }  }, "test2"  );
        test1.start();
        test2.start();
//         TestRunnable tr=new TestRunnable();
//         Thread test3=new Thread(tr);
//         test3.start();
    }

    //上面代码synchronized同时修饰静态方法和实例方法，但是运行结果是交替进行的，这证明了类锁和对象锁是两个不一样的锁，控制着不同的区域，它们是互不干扰的。
    //同样，线程获得对象锁的同时，也可以获得该类锁，即同时获得两个锁，这是允许的。


    // 到这里，对synchronized的用法已经有了一定的了解。这时有一个疑问，既然有了synchronized修饰方法的同步方式，
    // 为什么还需要synchronized修饰同步代码块的方式呢？而这个问题也是synchronized的缺陷所在

    //synchronized的缺陷：当某个线程进入同步方法获得对象锁，那么其他线程访问这里对象的同步方法时，必须等待或者阻塞，
    // 这对高并发的系统是致命的，这很容易导致系统的崩溃。如果某个线程在同步方法里面发生了死循环，那么它就永远不会释放这个对象锁，那么其他线程就要永远的等待。这是一个致命的问题。
    //一个类的对象锁和另一个类的对象锁是没有关联的，当一个线程获得A类的对象锁时，它同时也可以获得B类的对象锁。

}
