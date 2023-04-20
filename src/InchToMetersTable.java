public class InchToMetersTable {
    public static void main(String[] args) {
        double inch;
        double meters;
        int counter;


        counter = 0;
        for (inch = 1; inch <= 144; inch++) {
            meters = inch * 39.37;
            System.out.println(inch + " inch is equal to " + meters + " meters");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter=0;
            }
        }

    }
}
