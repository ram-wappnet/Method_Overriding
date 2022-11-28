
class Bank {
    double GetTotalBallance() {
        return 0;
    }
}

// Creating child classes.
class SBI extends Bank {
    double GetTotalBallance() {
        return 100000;
    }
}

class ICICI extends Bank {
    double GetTotalBallance() {
        return 150000;
    }
}

// Test class to create objects and call the methods

public class MethodOverridingDemo {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        System.out.println("SBI Rate of Interest: " + s.GetTotalBallance());
        System.out.println("ICICI Rate of Interest: " + i.GetTotalBallance());

    }
}
