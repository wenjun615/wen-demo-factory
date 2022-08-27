package com.wen.factory.factorymethod;

/**
 * <p>
 * 工厂方法测试
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        AbstractCpuFactory aCpuFactory = new ACpuFactory();
        Cpu cpu = aCpuFactory.createCpu();
        cpu.calculate();
    }
}
