
import java.util.Scanner;
public class Tower {

    public static void main(String[] args) {
        System.out.print("�����������������");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.print("1����������2������������");
        int mode = scanner.nextInt();
        switch (mode) {
        case 1:
            function_1(count);
            break;
        case 2:
            function_2(count);
            break;
        default:
            System.out.println("��������");
            break;
        }
        scanner.close();
    }

    // ������
    public static void function_1(int count) {
        for (int i = 0; i < count; i++) {
            for (int space = count - i - 1; space > 0; space--) {
                System.out.print("   ");
            }
            for (int star = 0; star < (2 * i + 1); star++) {
                System.out.print("��");
            }
            System.out.println();
        }
    }

    // ��������
    public static void function_2(int count) {
        for (int i = 0; i < count; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print("    ");
            }
            for (int star = 0; star < (2 * (count - i) - 1); star++) {
                System.out.print("��");
            }
            System.out.println();
        }
    }
}