package com.wen.factory.factorymethod;

/**
 * <p>
 * CPU 抽象工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public interface AbstractCpuFactory {

    /**
     * 创建 CPU
     *
     * @return CPU
     */
    Cpu createCpu();
}
