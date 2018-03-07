import com.xiaoma.design.pattern.factory.Car;
import com.xiaoma.design.pattern.factory.SimpleFactory.CarSimpleFactory;
import com.xiaoma.design.pattern.factory.abstractfactory.AbstractFactory;
import com.xiaoma.design.pattern.factory.abstractfactory.BestBenzFactory;
import com.xiaoma.design.pattern.factory.factorymethod.BenzFactory;
import com.xiaoma.design.pattern.factory.factorymethod.CarFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void simpleFactoryTest() {
        CarSimpleFactory factory = new CarSimpleFactory();
        Car car = factory.getCar("Benz");
        car.getCar();
    }

    @Test
    public void factoryMethodTest() {
        CarFactory factory = new BenzFactory();
        Car car = factory.createCar("Benz");
        car.getCar();
    }

    @Test
    public void abstractFactoryTest() {
        AbstractFactory factory = new BestBenzFactory();
        factory.buyCar().getCar();
        factory.buyInsurance().getInsurance();
    }
}
