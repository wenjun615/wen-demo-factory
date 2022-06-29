package pattern.factory.factorymethod;

/**
 * <p>
 * 测试类
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        CpuFactory factory = new ACpuFactory();
        Cpu cpu = factory.createCpu();
        cpu.calculate();
    }
}
