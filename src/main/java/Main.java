
public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
<<<<<<< HEAD
            System.out.println("Hello " + String.join(" ", args));
=======
            String result = "Hello ";

            for (String name : args) {
                result += name + " ";
            }

            // remove last space
            result = result.substring(0, result.length() - 1);

            System.out.println(result);
>>>>>>> 5a276dfbd365bc1aad11e24052d36231107fde27
        }

    }
}