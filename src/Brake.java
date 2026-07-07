class Brake {
    Car car;

    Brake(Car car) {
        this.car = car;
    }

    void press() {
        car.brake();
    }
}
