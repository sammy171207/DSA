package TwoPointer;

import java.util.Arrays;

public class WeightLift {
    static int[] liftOfBoth(int[] weight) {
        if (weight == null || weight.length == 0) {
            return new int[]{0, 0}; // Handle empty array
        }
        if (weight.length == 1) {
            return new int[]{weight[0], 0}; // Handle single element array
        }

        int rlife = weight[0];
        int slift = weight[weight.length - 1];
        int left = 1, right = weight.length - 2;

        while (left <= right) {
            if (rlife == slift) {
                rlife += weight[left++];
                slift += weight[right--];
            }
            if (rlife < slift) {
                rlife += weight[left++];
            } else {
                slift += weight[right--];
            }
        }
        return new int[]{rlife, slift};
    }
    public static void main(String[] args) {
        int []weight={3,1,4,1,5,9,2,6,5,3,5};
        int []sol=liftOfBoth(weight);
        System.out.println(Arrays.toString(sol));
    }
}
