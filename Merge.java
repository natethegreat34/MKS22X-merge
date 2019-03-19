public class Merge{
public static void main(String[] args) {
	int [] a = {1,4,7,6,5};
	mergesort (a);
	System.out.println(a);
}
public static void mergesort(int[]data){
	mergesort(data, 0, data.length - 1);
}
//		 /
//  	/
//  \  /
//   v
public static void mergesort(int[]data, int lo, int hi){
	int mid = (hi + lo) / 2;
	//makes tow arrays, by splitting the current one into a right and left one
	// mergesort(data,lo,hi);
	if (lo >= hi || hi - lo < 2 || mid == lo || data.length < 2){
		System.out.println("smxhiuxbsbgdjs");
		return;
	}
	int [] left = new int [mid + 1 - lo];
	for (int y = 0; y <= mid - lo; y ++){
		System.out.println("place:" + y) ;
				System.out.println("length:" + data.length);
		left [y] = data [y];
	}
	//for left array, loop from 0 to half of the array - 1 and assgn each value to the space of left
 	int [] right = new int [hi - mid];

	for (int y = 1 + mid - lo; y <= hi- lo; y ++){
		// System.out.println(mid);
		// System.out.println(y + "y");
		// System.out.println(right.length);
		right [y - mid - 1 + lo] = data [y];
	}
	//for right array, loop from half of the array to end of the array and assgn each value to the space of right
// System.out.println("pb");
	mergesort (left, lo, mid);
	// System.out.println("bj");
	mergesort (right, mid + 1, hi);
	// recursive
	// System.out.println("saleeehfjdjfhjdh");
	merge (left, right, data);
   }
public static void merge(int[] left, int [] right, int [] data){
	data = new int [left.length + right.length];
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
	}
