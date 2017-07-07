package com.hailangflying.sms.common.service.provider.impl;

import com.hailangflying.sms.common.service.Sell;

import java.lang.reflect.Proxy;

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
 * @date 2017/6/16 11:49
 */
public class BusinessAgent implements Sell {

    private Vendor vendor ;

    @Override
    public void sell() {
        Class<Vendor> cl = (Class<Vendor>) Proxy.getProxyClass(ClassLoader.getSystemClassLoader(),Sell.class);

        vendor.sell();
    }

    @Override
    public void add() {
        vendor.add();
    }



    public  static  void main(String[] ar){
        BusinessAgent businessAgent = new BusinessAgent();
        businessAgent.sell();
    }

}
