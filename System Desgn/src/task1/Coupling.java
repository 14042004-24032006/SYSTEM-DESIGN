package task1;

// 1. Content Coupling (worst)
class ContentCoupledModule {
    public int data = 10;
}

class AccessingModule {
    public void change(ContentCoupledModule m) {
        m.data = 99; // Directly modifying internal content
        System.out.println("Content Coupling: Modified internal data to " + m.data);
    }
}

// 2. Common Coupling
class Common {
    public static int sharedValue = 42;
}

class CommonCoupled1 {
    void update() {
        Common.sharedValue = 100;
        System.out.println("Common Coupling: Value updated to " + Common.sharedValue);
    }
}

// 3. Control Coupling
class ControlCoupled {
    void execute(boolean flag) {
        if (flag)
            System.out.println("Control Coupling: Execute print");
        else
            System.out.println("Control Coupling: Skip print");
    }
}

// 4. Stamp Coupling
class StampData {
    int x = 5;
    int y = 10;
}

class StampCoupled {
    void display(StampData data) {
        System.out.println("Stamp Coupling: x=" + data.x);
    }
}

// 5. Data Coupling
class DataCoupled {
    void add(int a, int b) {
        System.out.println("Data Coupling: Sum is " + (a + b));
    }
}

// 6. No Coupling
class IndependentModule {
    void show() {
        System.out.println("No Coupling: This module works independently.");
    }
}

public class Coupling {
    public static void main(String[] args) {
        System.out.println("=== Coupling Types ===\n");

        new AccessingModule().change(new ContentCoupledModule());
        System.out.println();

        new CommonCoupled1().update();
        System.out.println();

        new ControlCoupled().execute(true);
        System.out.println();

        new StampCoupled().display(new StampData());
        System.out.println();

        new DataCoupled().add(5, 10);
        System.out.println();

        new IndependentModule().show();
    }
}
