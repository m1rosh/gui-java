import java.util.Scanner;
public class first_prog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        long a = 2147483647;
        long b = a;
        long begin = 0;
        long end = a;
        while (true) {
            if ((begin + end) == 1) {
                a = (begin + end) / 2 + 1;
            } else {
                a = (begin + end) / 2;
            }

            System.out.println("Загаданное число больше чем " + a + " ? 2-оно равно ему; 1-да; 0-нет, меньше");
            res = scanner.nextInt();

            if (res == 2) {
                System.out.println("Число отгадано!");
                break;
            }
            if (res == 1) {
                begin = a;
            }
            if (res == 0) {
                end = a;
            }
        }
    }
}
