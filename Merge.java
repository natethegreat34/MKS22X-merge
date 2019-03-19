public class Merge{

public static void mergesort(int[]data){
	int mid = data.length / 2;
	int lo = 0;
	int hi = data.length;
	//makes tow arrays, by splitting the current one into a right and left one
	// mergesort(data,lo,hi);
	if (lo >= hi || data.length < 2 || mid == lo){
		System.out.println("smxhiuxbsbgdjs");
		return;
	}
	int [] left = new int [mid];
	for (int y = lo; y < mid; y ++){
		left [y] = data [y];
	}
	//for left array, loop from 0 to half of the array - 1 and assgn each value to the space of left
 	int [] right = new int [hi - mid + 1];

	for (int y = mid; y < hi; y ++){
		// System.out.println(mid);
		// System.out.println(y + "y");
		// System.out.println(right.length);
		right [y - mid] = data [y];
	}
	//for right array, loop from half of the array to end of the array and assgn each value to the space of right
// System.out.println("pb");
	mergesort (left);
	// System.out.println("bj");
	mergesort (right);
	// recursive
	// System.out.println("saleeehfjdjfhjdh");
	merge (left, right, data);
   }
private static void merge(int[] left, int [] right, int [] data){
	int l = 0;
	int r = 0;
	int i = 0;
	while(l < left.length && r < right.length && i < data.length){
			if (left [l] <= right [r]){
	             data [i] = left [l];
	             l ++;
				 i ++;
	        }
			System.out.println("r" + r + "length " + right.length );
			System.out.println("ll" + l+ "length " + left.length );
			if ( l < left.length && r < right.length && i < data.length && left [l] > right [r]){
	             data [i] = right [r];
	             r ++;
				 i ++;
	        }
		}
	while (r < right.length && i < data.length){
			data [i] = right [r];
		   	r ++;
			i ++;
	  	}
	while (l < right.length && i < data.length){
			data [i] = right [l];
		   	l ++;
			i ++;
	  	}

		}
	}     // for ( ;i < original.length ; i ++){
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
	 //     }
	 // }

	   // public static void main(String[] args) {
	   //    int[] data = {9,1,2,3,4,5,6,7};
	   //    int high = data.length;
	   //    int low = 0;
	   //    mergesort(data);
	   //    System.out.println(data);
	   //  }
	   //  /*sort the array from least to greatest value. This is a wrapper function*/
	   //  public static void mergesort(int[]data){
		// 	if (data.length > 0)
		// 	mergesort(data, 0, data.length - 1);
		// }
		// public static void mergesort(int[]data, int lo, int hi){
		// int mid = (lo + hi)/ 2;
	   //     if (hi > 1 && lo < hi){
	   //      mergesort (data, lo,mid );
	   //      mergesort (data, mid + 1, hi);
	   //      // recursive
	   //  }
	   //  merge (data, lo, hi);
	   //     }
	   //  // combine all lonely arrays
	   //  private static void merge(int[] data, int lo, int hi){
		//    int mid = (lo + hi)/ 2;
		//    // sets the start and end of the given array
		//    int [] left = new int [mid - lo + 1];
		//    int [] right = new int [hi - mid];
		//    //makes tow arrays, by splitting the current one into a right and left one
		//    // mergesort(data,lo,hi);
		// 	if (lo < hi){
		//    for (int y = 0; y < left.length; y ++){
		// 	   left [y] = data [y + lo];
		//    }
		//    //for left array, loop from 0 to half of the array - 1 and assgn each value to the space of left
		//    for (int y = 0; y < right.length; y ++){
 		// 	  left [y] = data [y + mid + 1];
 		//   }
		//    //for right array, loop from half of the array to end of the array and assgn each value to the space of right
	   //
	   //      int l = 0;
	   //      int r = 0;
		// 	int i = 1;
		// 	while(l < left.length && r < right.length && i < data.length){
		// 		if (left [l] <= right [r]){
		//              data [i] = left [l];
		//              l ++;
		// 			 i ++;
		//         }
		// 		// System.out.println("r" + r + "length " + right.length );
		// 		// System.out.println("ll" + l+ "length " + left.length );
		// 		if (left [l] > right [r]){
		//              data [i] = right [r];
		//              r ++;
		// 			 i ++;
		//         }
	   //
		// 	}
		// 	while (r < right.length && i < data.length){
		// 		data [i] = right [r];
		// 	   r ++;
		//   	}
		// 	while (l < right.length && i < data.length){
		// 		data [i] = right [l];
		// 	   l ++;
		//   	}
	   //
		// 	}
	   //      // for ( ;i < original.length ; i ++){
       //      //     if (l < left.length && r < right.length){
	   //      //
	   //      //         else if(right [r] < left [l]){
	   //      //             original [i] = right [r];
	   //      //             r ++;
	   //      //         }
	   //      //     }
	   //      //     if (l >= left.length && r < right.length){
	   //      //         original [i] = right [r];
	   //      //         r ++;
	   //      //     }
	   //      //     if (r >= right.length && l < left.length){
	   //      //         original [i] = left [l];
	   //      //         l ++;
	   //      //     }
	   //      }
	   //  }
