package com.wen.factory.abstractfactory;

/**
 * <p>
 * A 类型主板
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class AMainBoard implements MainBoard {

    @Override
    public void installCpu() {
        System.out.println("this is A mainBoard");
    }
}
