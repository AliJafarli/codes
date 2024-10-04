import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("BMW", "black", 3.2));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 5;
            System.out.println("upgraded car: " + car);
        });
        System.out.println(ourCars);
    }
}
