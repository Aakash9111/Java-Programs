import java.util.Scanner;
import java.util.ArrayList;

public class BitDestuffing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter Size of Bit Stream:");

        int s = sc.nextInt();
        int m[] = new int[s];

        ArrayList<Integer> l = new ArrayList<Integer>();
        System.out.print("\nEnter Stuffed Bit Stream:");

        for (int i = 0; i < s; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < s; i++) {
            if (m[i] == 0 && count >= 5) {
                count = 0;
                continue;
            }
            if (m[i] == 1) {
                count++;
                l.add(m[i]);
            }
            if (m[i] == 0 && count < 5) {

                l.add(m[i]);
            }
        }
        System.out.println("\nBit Stream After DeStuffing:\n");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }

}
