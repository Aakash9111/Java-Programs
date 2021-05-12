import java.util.Scanner;

public class ByteDestuffing {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Size of Byte Stuffed Data:");
        int s = sc.nextInt();
        char m[] = new char[s];

        System.out.print("\nEnter Byte Stuffed Data:");
        for (int i = 0; i < s; i++) {
            m[i] = sc.next().charAt(0);
        }

        System.out.print("\nByte Stuffed Data:\n\n");
        System.out.print("|Flag| ");
        for (int i = 0; i < s; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.print(" |Flag|");
        char[] l = new char[20];
        int j = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 'D' || m[i] == 'd') {
                l[j] = m[i];
                j++;
            }
            if (m[i] == 'E' && m[i + 1] == 'F') {
                l[j] = 'F';
                i++;
                j++;
            }
            if (m[i] == 'E' && m[i + 1] == 'E') {
                l[j] = 'E';
                i++;
                j++;
            }

        }

        System.out.println("\n\nData After Byte-Destuffing:\n");
        System.out.print("|Flag| ");
        for (int i = 0; i < j; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.print(" |Flag|");
    }
}
