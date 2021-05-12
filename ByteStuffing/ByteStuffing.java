import java.util.Scanner;

public class ByteStuffing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Size of Bit Stream:");
        int s = sc.nextInt();
        char m[] = new char[s];

        System.out.print("\nEnter Bit Stream:");
        for (int i = 0; i < s; i++) {
            m[i] = sc.next().charAt(0);
        }

        System.out.print("\nData Before Byte Stuffing:\n\n");
        System.out.print("|Flag| ");
        for (int i = 0; i < s; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.print(" |Flag|");
        char[] l = new char[20];
        int j = 0;
        for (int i = 0; i < m.length; i++) {

            if (m[i] == 'F' || m[i] == 'f') {
                l[j] = 'E';
                j++;
                l[j] = m[i];
                j++;
            }
            if (m[i] == 'E' || m[i] == 'e') {
                l[j] = 'E';
                j++;
                l[j] = m[i];
                j++;
            }
            if (m[i] == 'D' || m[i] == 'd') {
                l[j] = m[i];
                j++;
            }
        }

        System.out.println("\n\nData After ByteStuffing:\n");
        System.out.print("|Flag| ");
        for (int i = 0; i < j; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.print(" |Flag|");
    }
}
