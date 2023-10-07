  package fall23;

public class Sanju5 {
    public void sum(int a, int b) {
        int s = 0;
        for (int i = a; i <= b; i++) {
            s += i;
        }
        System.out.println("The value of s " + s);
    }

    public static int total(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }

    // Method overloading -> same function name with different parameters
    public void addition(int a, int b) {
        int c = a + b;
        System.out.println("The value of a and b is " + c);
    }

    public void addition(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("The value of a, b, and c is " + d);
    }

    public static void main(String[] args) {
        Sanju5 z = new Sanju5();
        z.sum(10, 20);
        z.addition(10, 20, 40);
        System.out.println("Sum from 1 to 10 is " + total(1, 10));
        System.out.println("Sum from 20 to 30 is " + total(20, 30));
        System.out.println("Sum from 35 to 45 is " + total(35, 45));
    }
}

