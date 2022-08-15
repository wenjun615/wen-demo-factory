package com.wen.factory.factorymethod;

/**
 * <p>
 * B 类型 CPU 工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class BCpuFactory implements CpuAbstractFactory {

    @Override
    public Cpu createCpu() {
        return new BCpu();
    }
}
