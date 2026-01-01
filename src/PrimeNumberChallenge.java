public class PrimeNumberChallenge {

    public static void main(String[] args) {

        int primeNumberCounter = 0;

        for (int i = 0 ; i <= 1000; i++) {

        if (isPrime(i)) {

            System.out.println(i + " is prime");
            primeNumberCounter ++;
            if (primeNumberCounter == 3){
                System.out.println("Found 3 - Exiting for loop");
                break;
            }
        }



        }



    }

    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
           if ( wholeNumber % divisor == 0) {
               return false;
           }
        }
        return true;
    }
}
