public class Sum3And5Challenge {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {

            boolean isDivisible = (i % 3 == 0 && i % 5 == 0);


            if (isDivisible) {
                sum += i;
                System.out.println("Number is " + i);
                count ++;

            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum of the numbers is " + sum );
    }
}
