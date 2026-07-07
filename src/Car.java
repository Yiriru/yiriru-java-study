class Car {
    int speed = 0;
    Tire frontLeftTire = new Tire(TirePosition.FRONT_LEFT);
    Tire frontRightTire = new Tire(TirePosition.FRONT_RIGHT);
    Tire backLeftTire = new Tire(TirePosition.BACK_LEFT);
    Tire backRightTire = new Tire(TirePosition.BACK_RIGHT);

    void accelerate() {
        speed += 10;
        syncTiresWithSpeed();
    }

    void brake() {
        speed = Math.max(0, speed - 10);
        syncTiresWithSpeed();
    }

    private void syncTiresWithSpeed() {
        if (speed > 0) {
            rollAllTires();
        } else {
            stopAllTires();
        }
    }

    private void rollAllTires() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }

    private void stopAllTires() {
        frontLeftTire.stop();
        frontRightTire.stop();
        backLeftTire.stop();
        backRightTire.stop();
    }
}
