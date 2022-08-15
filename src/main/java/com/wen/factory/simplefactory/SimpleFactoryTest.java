package com.wen.factory.simplefactory;

/**
 * <p>
 * 简单工厂测试
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Cpu cpu = CpuFactory.createCpu(ACpu.class);
        cpu.calculate();
    }
}
