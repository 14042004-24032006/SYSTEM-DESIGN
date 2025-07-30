package task1;

public class LibCohesion {

    // 1. Coincidental Cohesion (Worst)
    public void coincidentalTasks() {
        System.out.println("Coincidental Cohesion:");
        System.out.println("- Save File");
        System.out.println("- Print Receipt");
        System.out.println("- Send Email");
    }

    // 2. Logical Cohesion
    public void logicalProcess(int option) {
        System.out.println("Logical Cohesion:");
        switch (option) {
            case 1 -> System.out.println("- Print Document");
            case 2 -> System.out.println("- Scan Document");
            case 3 -> System.out.println("- Fax Document");
            default -> System.out.println("- Invalid Option");
        }
    }

    // 3. Procedural Cohesion
    public void proceduralHandle() {
        System.out.println("Procedural Cohesion:");
        System.out.println("- Enter Username");
        System.out.println("- Validate User");
        System.out.println("- Load Dashboard");
    }

    // 4. Sequential Cohesion
    public String readData() {
        return "raw data";
    }

    public String processData(String data) {
        return data.toUpperCase();
    }

    public void saveData(String data) {
        System.out.println("Sequential Cohesion: Saving -> " + data);
    }

    // 5. Functional Cohesion (Best)
    public int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        LibCohesion demo = new LibCohesion();

        demo.coincidentalTasks();
        System.out.println();

        demo.logicalProcess(2);
        System.out.println();

        demo.proceduralHandle();
        System.out.println();

        String data = demo.readData();
        String processed = demo.processData(data);
        demo.saveData(processed);
        System.out.println();

        int area = demo.calculateArea(5, 4);
        System.out.println("Functional Cohesion: Area = " + area);
    }
}
