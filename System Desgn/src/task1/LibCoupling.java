package task1;

// 1. Content Coupled Module
class ContentCoupledModule {
    public int data = 10;
}

// 2. Common Coupling Shared Class
class Common {
    public static int sharedValue = 42;
}

// 4. Stamp Coupling Data Class
class StampData {
    int x = 5;
    int y = 10;
}

// Main Class Demonstrating Coupling
public class LibCoupling {

    // 1. Content Coupling (Worst: directly modifying internal field)
    public void contentCoupling(ContentCoupledModule m) {
        m.data = 99;
        System.out.println("Content Coupling: Data changed to " + m.data);
    }

    // 2. Common Coupling (shared global data)
    public void commonCoupling() {
        Common.sharedValue = 100;
        System.out.println("Common Coupling: sharedValue updated to " + Common.sharedValue);
    }

    // 3. Control Coupling (flag controls internal logic)
    public void controlCoupling(boolean flag) {
        if (flag)
            System.out.println("Control Coupling: Action executed");
        else
            System.out.println("Control Coupling: Action skipped");
    }

    // 4. Stamp Coupling (passing full object but using part of it)
    public void stampCoupling(StampData data) {
        System.out.println("Stamp Coupling: Showing x = " + data.x);
    }

    // 5. Data Coupling (pure data passed)
    public void dataCoupling(int a, int b) {
        System.out.println("Data Coupling: Sum = " + (a + b));
    }

    // 6. No Coupling (no interaction with external code)
    public void noCoupling() {
        System.out.println("No Coupling: Independent logic");
    }

    public static void main(String[] args) {
        LibCoupling demo = new LibCoupling();

        demo.contentCoupling(new ContentCoupledModule());
        System.out.println();

        demo.commonCoupling();
        System.out.println();

        demo.controlCoupling(true);
        System.out.println();

        demo.stampCoupling(new StampData());
        System.out.println();

        demo.dataCoupling(7, 3);
        System.out.println();

        demo.noCoupling();
    }
}
