public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int result = multiply(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + result);
    }

    public static int multiply(int a, int b) {
        int result = 0;

        while (b != 0) {
            if ((b & 1) != 0) {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }

        return result;
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
