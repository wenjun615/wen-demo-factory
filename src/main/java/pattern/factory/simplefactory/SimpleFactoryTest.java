package pattern.factory.simplefactory;

/**
 * <p>
 * 测试类——调用工厂创建对象的客户端代码
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Cpu cpu = CpuFactory.createCpu(BCpu.class);
        cpu.calculate();
    }
}
