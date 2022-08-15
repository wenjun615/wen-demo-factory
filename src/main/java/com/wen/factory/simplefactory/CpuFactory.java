package com.wen.factory.simplefactory;

/**
 * <p>
 * CPU 工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class CpuFactory {

    public static Cpu createCpu(Class clazz) {
        if (clazz.getName().equals(ACpu.class.getName())) {
            return new ACpu();
        } else if (clazz.getName().equals(BCpu.class.getName())) {
            return new BCpu();
        }
        return null;
    }
}
