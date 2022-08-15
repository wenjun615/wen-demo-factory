package com.wen.factory.abstractfactory;

/**
 * <p>
 * 抽象工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public interface AbstractFactory {

    /**
     * 创建 CPU
     *
     * @return CPU
     */
    Cpu createCpu();

    /**
     * 创建主板
     *
     * @return 主板
     */
    MainBoard createMainBoard();
}
