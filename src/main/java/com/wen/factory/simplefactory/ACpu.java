package com.wen.factory.simplefactory;

/**
 * <p>
 * A 类型 CPU
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class ACpu implements Cpu {

    @Override
    public void calculate() {
        System.out.println("this is A cpu");
    }
}
