package pattern.factory.factorymethod;

/**
 * <p>
 * 具体产品实现
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class ACpu implements Cpu {

    @Override
    public void calculate() {
        System.out.println("this is A cpu");
    }
}
