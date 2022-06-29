package pattern.factory.simplefactory;

/**
 * <p>
 * 简单工厂类
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public class CpuFactory {

    public static Cpu createCpu(Class classType) {
        if (classType.getName().equals(ACpu.class.getName())) {
            return new ACpu();
        } else if (classType.getName().equals(BCpu.class.getName())) {
            return new BCpu();
        }
        return null;
    }
}
