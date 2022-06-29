package pattern.factory.abstractfactory;

/**
 * <p>
 * 测试类
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new AFactory();
        Cpu cpu = factory.createCpu();
        MainBoard mainboard = factory.createMainBoard();
        cpu.calculate();
        mainboard.installCpu();
    }
}
