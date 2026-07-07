class Accel {
    Car car;

    Accel(Car car) {
        this.car = car;
    }

    void press() {
        car.accelerate();
    }
}
