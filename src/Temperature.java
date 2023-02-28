import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        //declaration of variable
        int tempC;
        double tempF;
        String trash;
        boolean done = false;
        // create new scanner
        Scanner in = new Scanner(System.in);
        // start loop
        do {
            {
                System.out.println("Enter temperature in C degrees:");
                if (in.hasNextInt()) {
                    tempC = in.nextInt();
                    in.nextLine();// clear the buffer
                    tempF = (tempC * 1.8) + 32;
                    System.out.println("Your temperature in F degrees is " + tempF);
                } else {
                    trash = in.nextLine();
                    System.out.println("Must enter a valid number");
                }

            }
        }while (!done) ;
    }
}














































