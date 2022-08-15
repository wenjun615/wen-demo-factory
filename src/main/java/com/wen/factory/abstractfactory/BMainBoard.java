package com.wen.factory.abstractfactory;

/**
 * <p>
 * B 类型主板
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class BMainBoard implements MainBoard {

    @Override
    public void installCpu() {
        System.out.println("this is B mainBoard");
    }
}
