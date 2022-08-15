package com.wen.factory.abstractfactory;

/**
 * <p>
 * B 类型 CPU
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class BCpu implements Cpu {

    @Override
    public void calculate() {
        System.out.println("this is B cpu");
    }
}
