public class Merge{
    /*sort the array from least to greatest value. This is a wrapper function*/
    public static void mergesort(int[]data){
        int lo = 0;
        int hi = data.length -1;
        int mid = data.length / 2;
        // sets the start and end of the given array
        int [] left = new int [mid];
        int [] right = new int [mid];
        //makes tow arrays, by splitting the current one into a right and left one
        mergesort(data,lo,hi);
      if (lo < hi){
        for (int y = lo; y < mid; y ++){
            left [y] = data [y];
        }
        //for left array, loop from 0 to half of the array - 1 and assgn each value to the space of left

        for (int y = mid; y < hi + 1; y ++){
            right [y] = data [y];
        }
        //for right array, loop from half of the array to end of the array and assgn each value to the space of right

        mergesort (left);
        mergesort (right);
        // recursive
    }
    merge (left, right, data);
    // combine all lonely arrays
}
    private static void merge(int[] left, int [] right, int [] original){
        int l = 0;
        int r = 0;
        for (int i = 0 ;i < original.length; i ++){
            if (l < left.length && r < right.length){
                 if (left [l] <= left [r]){
                    original [i] = left [l];
                    l ++;
                }
                if (left [r] < left [l]){
                    original [i] = left [r];
                    r ++;
                }
            }
            if (l >= left.length && r < right.length){
                original [i] = left [r];
                r ++;
            }
            if (r >= right.length && l < left.length){
                original [i] = left [l];
                l ++;
            }
        }
    }
}
