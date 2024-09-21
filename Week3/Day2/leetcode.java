package Week3.Day2;

public class leetcode {
    class Solution {
        public int trap(int[] height) {
            int totalWater = 0;
            int[] nger = NGER(height);
            int[] ngel = NGEL(height);

            for (int i = 0; i < height.length; i++) {
                int currentLevel = Math.min(nger[i], ngel[i]);
                int currentWater = currentLevel - height[i];
                if (currentWater > 0) {
                    totalWater += currentWater;
                }
            }

            return totalWater;
        }

        int[] NGER(int[] arr) {
            int maxElement = 0;
            int[] nger = new int[arr.length];
            for (int i = arr.length - 1; i >= 0; i--) {
                nger[i] = maxElement;
                maxElement = Math.max(arr[i], maxElement);
            }
            return nger;
        }

        int[] NGEL(int[] arr) {
            int maxElement = 0;
            int[] ngel = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                ngel[i] = maxElement;
                maxElement = Math.max(arr[i], maxElement);
            }
            return ngel;
        }
    }
}
