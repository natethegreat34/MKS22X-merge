
	public class Merge{
	   public static void main(String[] args) {
	      int[] data = {0,1,2,3,4,5,6,7};
	      int high = data.length;
	      int low = 0;
	      mergesort(data);
	      System.out.println(data);
	    }
	    /*sort the array from least to greatest value. This is a wrapper function*/
	    public static void mergesort(int[]data){
			if (data.length > 0)
			mergesort(data, 0, data.length);
		}
		public static void mergesort(int[]data, int lo, int hi){
		int mid = (lo + hi)/ 2;
	       if (lo < hi){
	        mergesort (data, lo,mid );
	        mergesort (data, mid + 1, hi);
	        // recursive
	    }
	    merge (data, lo, hi);
	       }
	    // combine all lonely arrays
	    private static void merge(int[] data, int lo, int hi){
		   int mid = (lo + hi)/ 2;
		   // sets the start and end of the given array
		   int [] left = new int [mid];
		   int [] right = new int [mid];
		   //makes tow arrays, by splitting the current one into a right and left one
		   // mergesort(data,lo,hi);
			if (lo < hi){
		   for (int y = lo; y < mid; y ++){
			   left [y] = data [y];
		   }
		   //for left array, loop from 0 to half of the array - 1 and assgn each value to the space of left

		   for (int y = mid; y - mid >= 0 && y < hi + 1; y ++){
			   right [y - mid] = data [y];
		   }
		   //for right array, loop from half of the array to end of the array and assgn each value to the space of right

	        int l = 0;
	        int r = 0;
			int i = 0;
			for(; l < left.length && r < right.length; i ++){
				if (left [l] <= right [r]){
		             data [i] = left [l];
		             l ++;
		        }
				if (left [l] > right [r]){
		             data [i] = right [r];
		             r ++;
		        }

			}
			while (r < right.length){
				data [i] = right [r];
			   r ++;
		  	}
			while (l < right.length){
				data [i] = right [l];
			   l ++;
		  	}

			}
	        // for ( ;i < original.length ; i ++){
            //     if (l < left.length && r < right.length){
	        //
	        //         else if(right [r] < left [l]){
	        //             original [i] = right [r];
	        //             r ++;
	        //         }
	        //     }
	        //     if (l >= left.length && r < right.length){
	        //         original [i] = right [r];
	        //         r ++;
	        //     }
	        //     if (r >= right.length && l < left.length){
	        //         original [i] = left [l];
	        //         l ++;
	        //     }
	        }
	    }
