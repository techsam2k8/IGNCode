import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class License {
    static int min(int x, int y) {
	if (x > y) {
	    return y;
	}
	return x;
    }
    public static void main(String args[]) throws Exception {
	Scanner in = new Scanner(System.in); //assuming from standard input
	while (true) {
	    int n = in.nextInt();
	    if (n < 26) {
		int[] array = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1};
		System.out.println(array[n]);
	    } else {
		int[] array = new int[n+1];
		array[0] = 0;
		array[1] = 9;
		array[2] = 8;
		array[3] = 7;
		array[4] = 6;
		array[5] = 5;
		array[6] = 4;
		array[7] = 3;
		array[8] = 2;
		array[9] = 1;
		array[10] = 0;
		array[11] = 9;
		array[12] = 8;
		array[13] = 7;
		array[14] = 6;
		array[15] = 5;
		array[16] = 4;
		array[17] = 3;
		array[18] = 2;
		array[19] = 1;
		array[20] = 0;
		array[21] = 5;
		array[22] = 4;
		array[23] = 3;
		array[24] = 2;
		array[25] = 1;
		for (int i = 26; i < n + 1; i++) {
		    array[i] = min(array[i - 10], array[i - 26]);
		}
	    System.out.println(array[n]);

	    }
	}
    }
}

