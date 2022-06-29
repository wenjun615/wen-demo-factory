package pattern.factory.abstractfactory;

/**
 * <p>
 * 具体产品
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class AMainBoard implements MainBoard {

    @Override
    public void installCpu() {
        System.out.println("this is A mainBoard");
    }
}
