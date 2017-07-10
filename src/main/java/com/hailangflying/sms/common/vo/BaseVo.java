package com.hailangflying.sms.common.vo;

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
 * @date 2017/7/10 14:23
 */
public class BaseVo {
    /**
     * 标记 id
     */
    private String textId;


    public BaseVo(){
        //进入父类无参构造，初始化对象
        System.out.println("调用父类BaseVo()无参构造======="+getTextId());
    }

    public BaseVo(String textId){
        this.textId = textId;
        System.out.println("调用父类BaseVo(textId)有参构造======="+textId+"===="+getTextId());
    }


    public String getTextId() {
        System.out.println("调用父类BaseVo的getTextId()======="+textId+"====");
        return textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }
}
