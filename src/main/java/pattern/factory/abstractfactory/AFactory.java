package pattern.factory.abstractfactory;

/**
 * <p>
 * 具体工厂
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class AFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new ACpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AMainBoard();
    }
}
