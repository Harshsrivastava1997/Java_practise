package test.BasicJavaCodes;

public class MoveZeroTORightWithoutOrder {

    public static void main(String[] args) {
            int[] inputarr = {0, 3, 0, 1, 0, 5, 0, 6, 2};
            int left = 0;
            int right = inputarr.length - 1;

            while (left < right) {
                // Move left pointer to the first non-zero element
                while (inputarr[left] != 0 && left < right) {
                    left++;
                }
                // Move right pointer to the first zero element from the end
                while (inputarr[right] == 0 && left < right) {
                    right--;
                }
                // Swap non-zero element at left with zero element at right
                if (left < right) {
                    int temp = inputarr[left];
                    inputarr[left] = inputarr[right];
                    inputarr[right] = temp;
                    left++;
                    right--;
                }
            }

            // Print the modified array
            for (int i = 0; i < inputarr.length; i++) {
                System.out.print(inputarr[i] + " ");
            }
        }
    }


