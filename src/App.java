public class App {
    public static void main(String[] args) throws Exception {
        Print print = new Print();

        print.log("Hello, World!");
        print.error("Something did not go well.");

        Car car = new Car();
        Accel accel = new Accel(car);
        Brake brake = new Brake(car);

        Util.println(String.valueOf(car.speed));
        car.startEngine();
        accel.press();
        Util.println(String.valueOf(car.speed));
        brake.press();
        Util.println(String.valueOf(car.speed));
        Util.println(String.valueOf(car.frontLeftTire.isRolling));
        Util.println(String.valueOf(car.frontRightTire.isRolling));
    }
}
