package com.wen.factory.abstractfactory;

/**
 * <p>
 * 抽象工厂测试
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory aFactory = new AFactory();
        Cpu aCpu = aFactory.createCpu();
        aCpu.calculate();
        MainBoard aMainBoard = aFactory.createMainBoard();
        aMainBoard.installCpu();
    }
}
