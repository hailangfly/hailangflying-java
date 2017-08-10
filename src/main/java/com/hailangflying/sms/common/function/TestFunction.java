package com.hailangflying.sms.common.function;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * <p>从java8 说起函数式编程</p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author lijh
 * @version V1.0
 * @date 2017/8/9 16:03
 */
public class TestFunction {


    @Test
    public void t_a(){
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));


        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
        for(BigDecimal price : prices) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);

    }


    /**
     * 使用函数式代码的好处：

     减少了可变量(Immutable Variable)的声明
     能够更好的利用并行(Parallelism)
     代码更加简洁和可读
     */
    @Test
    public void t_b(){
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));

        final BigDecimal totalOfDiscountedPrices =
                prices.stream().filter(price -> price.compareTo(BigDecimal.valueOf(20))>0).map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO,BigDecimal :: add);


        Runnable r = () -> System.out.println("hello world");

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
        r.run();
    }


    /**
     * 函数式接口就是仅声明了一个方法的接口，比如我们熟悉的Runnable，Callable，Comparable等都可以作为函数式接口。当然，在Java 8中，新添加了一类函数式接口，如Function，Predicate，Consumer，Supplier等。
     *
     */


    @Test
    public void t_c(){
        Runnable r = () -> {
            for (int i=0;i<10;i++) {
                for (int j=0;j<10;j++) {
                    System.out.println("i="+i+":::j="+j);
                }
            }
        };


        r.run();

        List<Integer> integers = Arrays.asList(0,0,0,2,3,9,4,1,0,2,3,9,4,5,6);
        integers.sort(Integer::compare);
        System.out.println(integers);

    }



}


