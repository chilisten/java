package Laboratorki1;

import java.util.ArrayList;
import java.util.List;

public class lb3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] nums2 = {0, 2, 1, 9, 7};

        List<Integer> nums3 = new ArrayList<>();

        for (int num : nums1) {
            boolean found = false;
            for (int num2 : nums2) {
                if (num == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                nums3.add(num);
            }
        }


        for (int num : nums3) {
            System.out.print(num + " ");
        }
    }
}
