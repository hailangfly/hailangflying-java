package com.hailangflying.sms.common.service.provider.impl;

import com.hailangflying.sms.common.service.Sell;

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
 * @date 2017/6/16 11:47
 */
public class Vendor implements Sell{
    @Override
    public void sell() {
        System.out.println("调用了---sell");
    }

    @Override
    public void add() {
        System.out.println("调用了---add");
    }
}
