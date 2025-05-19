public class Merge_Sort {
    public static void main(String[] args) {
        /*
         * 1 3 5 7
         * 
         * 2 4 6 8
         * 
         * output: 1 2 3 4 5 6 7 8
         */
        int jam[] = { 1, 3, 5, 7 };
        int jav[] = { 2, 4, 6, 8 };
        int pla[] = new int[8];

        // Merging

        int r = 0, k = 0, c = 0;
        while (r < 4 && c < 4) {
            if (jam[r] < jav[c])
                pla[k++] = jam[r++];
            else
                pla[k++] = jav[c++];

        }

        while (r < 4)
            pla[k++] = jam[r++];

        while (c < 4)
            pla[k++] = jav[c++];


        for (int i = 0; i < pla.length; i++) {
            System.out.println(pla[i]);
        }
    }
}
