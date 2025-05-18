import java.util.*;

public class Triplet {
    // Define a method to find and print all triplets with a given sum.
    public static void find_and_print_all_Triplets(int[] nums, int sum, int alen)
    {
        System.out.println("\nTriplets of sum " + sum);
        // Iterate through the array, leaving space for at least three elements.
        for (int i = 0; i <= alen - 3; i++) {
            int k = sum - nums[i];
            int l_index = i + 1, h_index = nums.length - 1;
            // Use a two-pointer approach to find triplets that sum up to 'k'.
            while (l_index < h_index)
            {
                if (nums[l_index] + nums[h_index] < k) {
                    l_index++;
                }
                else if (nums[l_index] + nums[h_index] > k) {
                    h_index--;
                }
                else {
                    // Print the triplet and adjust the pointers.
                    System.out.println("(" + nums[i] + " " + nums[l_index] + " " + nums[h_index] + ")");
                    l_index++;
                    h_index--;
                }
            }
        }
    }
    // Define the main method for running the program.
    public static void main(String[] args)
    {
        // Initialize the array and its length.
        int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7,5,10,19,17,11,12,13,2,9,14,15,16,17,18 };
        int alen = nums.length;
        System.out.println("\nOriginal array: " + Arrays.toString(nums));
        // Sort the array in ascending order.
        Arrays.sort(nums);
        int sum = 20;
        // Call the 'find_and_print_all_Triplets' method to find and print triplets with the given sum.
        find_and_print_all_Triplets(nums, sum, alen);
    }

}
