package BinarySearch;

public class FightClub {
    public static void main(String[] args) {
        int[] soldiers = {1, 2, 3, 4, 5, 6, 7};
        int[] piyushPower = {3, 10,2};

        for (int i = 0; i < piyushPower.length; i++) {
            fight(soldiers, piyushPower[i]);
        }
    }

    private static int sumPower(int[] soldiers, int lastIndex) {
        int sum = 0;
        for (int i = 0; i <= lastIndex; i++) {
            sum += soldiers[i];
        }
        return sum;
    }

    private static void fight(int[] soldiers, int power) {
        int left = 0, right = soldiers.length - 1;
        int lastDefeatedIndex = -1;  // No soldier defeated yet

        while (left <= right) {
            int mid = (left + right) / 2;
            if (soldiers[mid] <= power) {
                lastDefeatedIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int count = lastDefeatedIndex + 1;
        int totalPower = (lastDefeatedIndex >= 0) ? sumPower(soldiers, lastDefeatedIndex) : 0;
        System.out.println(count + " " + totalPower);
    }
}
