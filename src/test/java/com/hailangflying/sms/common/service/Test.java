package com.hailangflying.sms.common.service;

import com.hailangflying.sms.common.vo.UserVo;

import java.util.ArrayList;
import java.util.Arrays;
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


    public static void main(String[] args){

        List<UserVo> userVos = new ArrayList<>();
        UserVo userVo = new UserVo();
        String[] str = {"t0001","t0002","t0003","t0004","t0005"};
        userVo.setStringList(Arrays.asList(str));
        userVo.setAge(10);
        userVo.setName("张三");

        userVos.add(userVo);

        System.out.println(userVo.toString());

        userVo = new UserVo("王五",20,2,Arrays.asList(new String[]{"01","02"}));
        System.out.println(userVo.toString());

        userVos.add(userVo);

        List<String> st =  userVos.stream().map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(st);

        List<UserVo> st1 =  userVos.stream().filter(use -> use.getName().equals("王五") || use.getName().equals("张三")).collect(Collectors.toList());


        System.out.println(st1);
        System.out.println(st1);
    }
}
