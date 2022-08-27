package com.wen.factory.factorymethod;

/**
 * <p>
 * A 类型 CPU 工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class ACpuFactory implements AbstractCpuFactory {

    @Override
    public Cpu createCpu() {
        return new ACpu();
    }
}
