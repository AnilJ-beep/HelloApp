public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.print("Hello ");
            
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
            }

            System.out.println(); // move to next line
        } else {
            System.out.println("Hello World");
        }

    }
}