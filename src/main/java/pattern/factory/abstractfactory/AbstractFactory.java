package pattern.factory.abstractfactory;

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
     * 创建 CPU 产品
     *
     * @return CPU 产品
     */
    Cpu createCpu();

    /**
     * 创建主板产品
     *
     * @return 主板产品
     */
    MainBoard createMainBoard();
}
