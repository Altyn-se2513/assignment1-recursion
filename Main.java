import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Assignment #1. Recursion");
        System.out.println("Choose task number (1-10):");

        int task = scanner.nextInt();

        if (task == 1) {
            int n = scanner.nextInt();
            printDigits(n);
        } else if (task == 2) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            readArray(arr, 0);
            double average = (double) sumArray(arr, 0) / n;
            System.out.println(average);
        } else if (task == 3) {
            int n = scanner.nextInt();
            if (n >= 2 && isPrime(n, 2)) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }
        } else if (task == 4) {
            int n = scanner.nextInt();
            System.out.println(factorial(n));
        } else if (task == 5) {
            int n = scanner.nextInt();
            System.out.println(fibonacci(n));
        } else if (task == 6) {
            int a = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(power(a, n));
        } else if (task == 7) {
            int n = scanner.nextInt();
            reverseOutput(n);
        } else if (task == 8) {
            String s = scanner.next();
            if (containsOnlyDigits(s, 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else if (task == 9) {
            String s = scanner.next();
            System.out.println(countCharacters(s));
        } else if (task == 10) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(gcd(a, b));
        } else {
            System.out.println("Invalid task number");
        }
    }

    // Task 1
    public static void printDigits(int n) {
        if (n < 0) {
            n = -n;
        }

        if (n < 10) {
            System.out.println(n);
            return;
        }

        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    public static void readArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        arr[index] = scanner.nextInt();
        readArray(arr, index + 1);
    }

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }

        return arr[index] + sumArray(arr, index + 1);
    }

    // Task 3
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) {
            return false;
        }

        if (divisor * divisor > n) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return isPrime(n, divisor + 1);
    }

    // Task 4
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Task 5
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }

    // Task 7
    public static void reverseOutput(int n) {
        if (n == 0) {
            return;
        }

        int value = scanner.nextInt();
        reverseOutput(n - 1);
        System.out.print(value);

        if (n > 1) {
            System.out.print(" ");
        }
    }

    // Task 8
    public static boolean containsOnlyDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }

        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }

        return containsOnlyDigits(s, index + 1);
    }

    // Task 9
    public static int countCharacters(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        return 1 + countCharacters(s.substring(1));
    }

    // Task 10
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}