package com.wen.factory.abstractfactory;

/**
 * <p>
 * A 类型工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class AFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new ACpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AMainBoard();
    }
}
