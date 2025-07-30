package task1;

public class Cohesion{

    // 1. Coincidental Cohesion (worst)
    static class Coincidental {
        void doAllTasks() {
            System.out.println("Coincidental Cohesion:");
            System.out.println("- Save file");
            System.out.println("- Add numbers");
            System.out.println("- Print student name");
            System.out.println("- Send email");
        }
    }

    // 2. Logical Cohesion
    static class Logical {
        void handleTask(int option) {
            System.out.println("Logical Cohesion:");
            switch (option) {
                case 1 -> System.out.println("- Print Document");
                case 2 -> System.out.println("- Scan Document");
                case 3 -> System.out.println("- Fax Document");
            }
        }
    }

    // 3. Procedural Cohesion
    static class Procedural {
        void processLogin() {
            System.out.println("Procedural Cohesion:");
            System.out.println("- Enter username");
            System.out.println("- Validate user");
            System.out.println("- Load dashboard");
        }
    }

    // 4. Sequential Cohesion
    static class Sequential {
        String readData() {
            return "student data";
        }

        String processData(String data) {
            return data.toUpperCase();
        }

        void displayData(String data) {
            System.out.println("Sequential Cohesion:");
            System.out.println("- Displaying: " + data);
        }
    }

    // 5. Functional Cohesion (best)
    static class Functional {
        int calculateArea(int length, int width) {
            return length * width;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Cohesion Types ===\n");

        new Coincidental().doAllTasks();
        System.out.println();

        new Logical().handleTask(1);
        System.out.println();

        new Procedural().processLogin();
        System.out.println();

        Sequential sq = new Sequential();
        String data = sq.readData();
        String result = sq.processData(data);
        sq.displayData(result);
        System.out.println();

        Functional fc = new Functional();
        System.out.println("Functional Cohesion:");
        System.out.println("- Area: " + fc.calculateArea(5, 10));
    }
}
