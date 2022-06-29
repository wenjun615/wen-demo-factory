package pattern.factory.factorymethod;

/**
 * <p>
 * 具体工厂实现
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class BCpuFactory implements CpuFactory {

    @Override
    public Cpu createCpu() {
        return new BCpu();
    }
}
