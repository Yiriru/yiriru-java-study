class Tire {
    TirePosition position;
    boolean isRolling = false;

    Tire(TirePosition position) {
        this.position = position;
    }

    void roll() {
        isRolling = true;
        Util.println("굴러간다");
    }

    void stop() {
        isRolling = false;
        Util.println("멈춘다");
    }
}
