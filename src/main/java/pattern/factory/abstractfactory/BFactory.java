package pattern.factory.abstractfactory;

/**
 * <p>
 * 具体工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class BFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new BCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new BMainBoard();
    }
}
