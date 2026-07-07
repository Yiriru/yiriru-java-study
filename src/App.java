import java.io.OutputStream;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {
        Print print = new Print();

        print.log("Hello, World!");
        print.error("Something did not go well.");

        Tire frontlefttire = new Tire();
        Tire frontrighttire = new Tire();
        Tire backlefttire = new Tire();
        Tire backrighttire = new Tire();

        Accel accel = new Accel(frontlefttire, frontrighttire);
        Brake brake = new Brake(frontlefttire, frontrighttire, backlefttire, backrighttire);

        accel.press();

        brake.press();

        System.out.println(accel.frontlefttire.isRolling);
        System.out.println(accel.frontrighttire.isRolling);


    }
}

class Tire {

    Boolean isRolling = false;
    void roll() {
        isRolling = true;
        Util.println("Guleoganda");
    }

    void stop() {
        isRolling = false;
        Util.println("Un-Guleoganda");
    }
}

class Accel {
    Tire frontlefttire;
    Tire frontrighttire;
    
    Accel(Tire tire1, Tire tire2) {
        frontlefttire = tire1;
        frontrighttire = tire2;
    }

    void press() {
        frontlefttire.roll();
        frontrighttire.roll();

        if (!frontlefttire.isRolling) {
            Util.println("ERROR: Accel pressed, but tire 1 is not rolling!");
        }

        if (!frontrighttire.isRolling) {
            Util.println("ERROR: Accel pressed, but tire 2 is not rolling!");
        }

    }

}

class Brake {
    Tire frontlefttire;
    Tire frontrighttire;
    Tire backlefttire;
    Tire backrighttire;
    
    Brake(Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
        frontlefttire = tire1;
        frontrighttire = tire2;
        backlefttire = tire3;
        backrighttire = tire4;
    }

    void press() {
        frontlefttire.stop();
        frontrighttire.stop();
        backlefttire.stop();
        backrighttire.stop();

        if (frontlefttire.isRolling) {
            Util.println("ERROR: Brake pressed, but tire 1 is still rolling!");
        }

        if (frontrighttire.isRolling) {
            Util.println("ERROR: Brake pressed, but tire 2 is still rolling!");
        }

        if (backlefttire.isRolling) {
            Util.println("ERROR: Brake pressed, but tire 3 is still rolling!");
        }

        if (backrighttire.isRolling) {
            Util.println("ERROR: Brake pressed, but tire 4 is still rolling!");
        }

    }

}