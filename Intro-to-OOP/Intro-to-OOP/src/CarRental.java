import java.util.Scanner;

public class CarRental {

    public void rentCar() {


        for (int i = 0; i < 4; i++) {

            System.out.println("Programmed by .");

            double standardCompact = 30.50;
            double couponCompact = ((30.50) - (30.50 * 0.07));
            double standardFullSize = 40.50;
            double couponFullSize = ((40.50) - (40.50 * 0.07));


            Scanner input = new Scanner(System.in);
            System.out.print("Rent a Car? [Y or N]: ");

            String response = input.next().toUpperCase();

            if (response.equals("N")) {
                System.out.println("You entered no. Bye. ");
            } else if (response.equals("Y")) {
                System.out.print("Compact or Full-Size? [C or F]: ");


                response = input.next().toUpperCase();
                if (response.equals("C")) {
                    System.out.println("You selected Compact. ");

                    //case1
                    System.out.print("Have coupon? [Y or N]: ");
                    response = input.next().toUpperCase();
                    if (response.equals("N")) {
                        System.out.println("Price is" + " " + standardCompact + " " + "per     day.");
                    } else if (response.equals("Y")) {
                        System.out.println("Price is" + " " + couponCompact + " " + "per day.");
                    }

                } else if (response.equals("F")) {
                    System.out.println("You have selected Full-Size. ");


                    System.out.print("Have coupon? [Y or N]: ");
                    response = input.next().toUpperCase();
                    if (response.equals("N")) {
                        System.out.println("Price is" + " " + standardFullSize + " " + "per day.");
                    } else if (response.equals("Y")) {
                        System.out.println("Price is" + " " + couponFullSize + " " + "per day.");
                    }
                }
            }
        }
    }
}
