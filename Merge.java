public class Merge{
		private static  int [] original;
public static void main(String[] args) {
	int [] a = {5, 4 , 6, 1, 2, 3, 4, 4, 3, 7, 8, 9};
	mergesort (a);
	int [] b = {1, 2 , 3, 3, 4, 4, 4, 5, 6, 7, 8, 9};
	boolean sad = false;
	for (int x = 0; x < a.length; x ++){
		if (a[x] != b [x]){
			sad = true;
			System.out.println("hiudhndin");
		}
	}
	if (!sad){
		System.out.println("you da best");
	}
	// not changing a

	}

public static void mergesort(int[]data){
	int [] copy = new int [data.length];

	for (int x = 0; x < data.length; x ++){
		copy [x] = data [x];
	}
	// System.out.println(d);
	// original [0] = 10;
 	// d = "";
	// for (int x = 0; x < data.length; x ++){
	// 	d = d + data[x] + " , ";
	// }
	// System.out.println(d + "after");
	mergesort(copy, 0, data.length - 1);
	// String d = "";
	// for (int x = 0; x < original.length; x ++){
	// 	d = d + original[x] + " , ";
	// }
	// System.out.println(d + "after");

	for (int x = 0; x < original.length; x ++){
		data [x] = original [x];
	}
}
//		 /
//  	/
//  \  /
//   v
public static void mergesort(int[]data, int lo, int hi){
	int mid = (hi + lo) / 2;
	//makes tow arrays, by splitting the current one into a right and left one
	// mergesort(data,lo,hi);
	if (lo >= hi || data.length < 2){
		// System.out.println("smxhiuxbsbgdjs");
		return;
	}
	int [] left = new int [mid + 1 - lo];
	for (int y = 0; y <= mid - lo; y ++){
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
	merge (left, right);
	// String d = "";
	// for (int x = 0; x < data.length; x ++){
	// 	d = d + data[x] + " , ";
	// }
	// System.out.println(d + "after");
   for (int x = 0; x < data.length; x ++){
		data [x] = original [x];
	}
   }
public static void merge(int[] left, int [] right){
	original = new int [left.length + right.length];
	int l = 0;
	int r = 0;
	int i = 0;
	while(l < left.length && r < right.length && i < original.length){
			if (left [l] <= right [r]){
	             original [i] = left [l];
	             l ++;
				 i ++;
	        }
			if ( l < left.length && r < right.length && i < original.length && left [l] > right [r]){
	             original [i] = right [r];
	             r ++;
				 i ++;
	        }
		}
	while (r < right.length && i < original.length){
			original [i] = right [r];
		   	r ++;
			i ++;
	  	}
	while (l < left.length && i < original.length){
			original [i] = left [l];
		   	l ++;
			i ++;
	  	}
		// String d = "";
		// for (int x = 0; x < original.length; x ++){
		// 	d = d + original[x] + " , ";
		// }
		// System.out.println(d + "akr");

		}

	}
