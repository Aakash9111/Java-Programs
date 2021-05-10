import java.util.Scanner;

public class HammingCode {
	static int arr[];
	static Scanner sc = new Scanner(System.in);

	public static void FindParity(int start, int g, int len) {
		// System.out.println("for Parity" + start);
		int count = 0;
		int v = start;
		int cout = 0;
		// System.out.println("value of g" + g);
		// System.out.println(len);
		while (v < len + 1) {

			if (cout == g) {
				v = v + g;
				if (v > len) {
					break;
				}
				// System.out.println("V :" + v);
				cout = 0;
			}
			// System.out.println(v - 1);
			try {
				if (arr[v - 1] == 1) {
					// System.out.println(arr[v - 1]);
					count++;

				} else if (arr[v - 1] == 0) {
					// System.out.println(arr[v - 1]);
					count = count + 0;

				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			cout++;
			v++;
		}
		// System.out.println(count);
		if (count % 2 == 1) {
			arr[start - 1] = 1;
		} else {
			arr[start - 1] = 0;
		}
		count = 0;

	}

	public static void main(String[] args) {
		int r = 0;
		System.out.print("Enter Size of Bit Stream:");
		int s = sc.nextInt();
		int m[] = new int[s];
		System.out.println("Enter Bit Stream:");
		for (int i = 0; i < s; i++) {
			m[i] = sc.nextInt();
		}

		while (true) {
			// 2r ≥ m+r+1
			if ((int) Math.pow(2, r) >= s + r + 1) {
				break;
			} else
				r++;
		}
		System.out.println("Parity bits :" + r);
		arr = new int[r + s];
		int k = 0, c = 0;
		for (int i = 0; i < arr.length; i++) {

			if ((int) Math.pow(2, c) - 1 == i) {
				c++;
				arr[i] = 0;
			} else {
				int temp = m[k];
				arr[i] = temp;
				k++;
			}
		}

		int v = 1;
		int x = 1;
		for (int i = 0; i < r; i++) {

			int b = (int) Math.pow(2, i);
			// System.out.println("Parity bit" + (b));
			// System.out.println(s + r);
			FindParity(b, v, (s + r));

			v = (int) Math.pow(2, x);
			x++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
