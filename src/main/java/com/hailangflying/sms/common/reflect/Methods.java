package com.hailangflying.sms.common.reflect;

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
 * @date 2017/8/8 17:41
 */
public class Methods {

    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s ",element);
        }

        System.out.println();
    }



    public static void main(String[] ars){

        Integer[] intArray = {1,2,3,4,5,6,7};
        Double[] douArray= {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] chaArray = {'Y','Z','Q','R','S','T','U','V','W'};


        System.out.println("------------");
        printArray(intArray);
        System.out.println("------------");
        printArray(douArray);
        System.out.println("------------");
        printArray(chaArray);


    }
}
