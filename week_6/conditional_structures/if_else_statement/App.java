public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean suspended = true;

        if (suspended) {
            System.out.println("stay at home");
        } else {
            // Step 1
            walkLRT();

            // Step 2
            rideLRT();

            // Step 3
            walk();
        }

    }

    static void walkLRT() {
        System.out.println("Walk from home to LRT station");
        System.out.println("");
    }



    static void rideLRT() {
        System.out.println("Ride at Cubao station");
        System.out.println("Exit at Legarda station");
    }


    static void walk() {
        System.out.println("Walk for 5 mins");
    }
}
