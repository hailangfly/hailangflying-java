package com.hailangflying.sms.common.vo;

import java.io.Serializable;
import java.util.List;

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
 * @date 2017/7/7 17:10
 */
public class UserVo implements Serializable{

    private String name;

    private int age;

    private int sex;

    private List<String> stringList ;


    public UserVo() {
        super();
       this.sex = this.getAge();
    }


    public UserVo(String name, int age, int sex, List<String> stringList) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stringList = stringList;
        this.sex = getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", stringList=" + stringList +
                '}';
    }
}
