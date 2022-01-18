package Lab_fibonacci;

public class Fibonaccitest {
    public static void main(String[] args) {
        int numberone = 1, numbertwo = 1;
        int result;

        do {
            result = numberone+numbertwo;
            System.out.println(result);
            numberone = numbertwo;
            numbertwo = result;

            } while (result<500) ;
    }
}
