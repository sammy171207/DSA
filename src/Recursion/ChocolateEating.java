package Recursion;

public class ChocolateEating {
    static int eatingFest(int sachinChocolate, int ankushChocolate) {
        if (sachinChocolate == ankushChocolate || sachinChocolate == 0 || ankushChocolate == 0) {
            return sachinChocolate + ankushChocolate;
        }
        if (sachinChocolate < ankushChocolate) {
            return eatingFest(sachinChocolate, ankushChocolate - sachinChocolate);
        } else {
            return eatingFest(sachinChocolate - ankushChocolate, ankushChocolate);
        }
    }

    public static void main(String[] args) {
        int sachinChocolate = 5;
        int ankushChocolate = 3;
        System.out.println(eatingFest(sachinChocolate, ankushChocolate)); // Output: 2
    }
}