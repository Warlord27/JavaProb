public class SortAnUnsortArray {
    // Merge sort of  two array 2️⃣ 🎇
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr1[] = { 1, 3, 5, 7, 9, 11, 137,458,896 }, arr2[] = { 2, 4, 6, 8, 10, 12, 14};
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0, r = 0, c = 0;
       
        while (r < arr1.length && c < arr2.length) {
            if (arr1[r] < arr2[c])
                arr3[k++] = arr1[r++];
            else
                arr3[k++] = arr2[c++];
        }
        while (r < arr1.length)
            arr3[k++] = arr1[r++];

        while (c < arr2.length)
            arr3[k++] = arr2[c++];

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}