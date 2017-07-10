package com.hailangflying.sms.common.service;

import com.hailangflying.sms.common.vo.UserVo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
 * @date 2017/6/16 11:50
 */
public class Test {


    public static void main(String[] args) throws InterruptedException {

        List<UserVo> userVos = new ArrayList<>();
        /**
         * 1.如果父类有有参构造(无无参构造时)，子类要写构造方法时必须要显示调用父类的有参构造，
         * 2.如果父类有有参构造、也有无参构造时，子类写有参可调用父类有参和无参或者不显示写super();则默认调用父类的无参构造
         */
        UserVo userVo = new UserVo();
        System.out.println("-------------"+userVo.staticInteger);
        System.out.println("-------------"+userVo.userVo);
        String[] str = {"t0001","t0002","t0003","t0004","t0005"};
        userVo.setStringList(Arrays.asList(str));
        userVo.setAge(10);
        userVo.setName("张三");
      //  userVo.staticInteger = 10;
        userVos.add(userVo);

        System.out.println(userVo.toString());

        userVo = new UserVo("王五",20,2,Arrays.asList(new String[]{"01","02"}),"textId0001");
        System.out.println(userVo.toString());

        userVos.add(userVo);

        List<String> st =  userVos.stream().map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(st);

        List<UserVo> st1 =  userVos.stream().filter(use -> use.getName().equals("王五") || use.getName().equals("张三")).collect(Collectors.toList());


        System.out.println(st1);
        System.out.println(st1);

        Thread.sleep(Long.MAX_VALUE);
    }
}
