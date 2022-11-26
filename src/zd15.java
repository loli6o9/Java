import java.util.Scanner;
public class zd15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число (Наименьшее): ");
        int op1 = in.nextInt();
        System.out.println("Введите второе число число (Наибольшее): ");
        int op2 = in.nextInt();
        System.out.println("Сумма ="+(op2+op1));
        System.out.println("Разность ="+(op2-op1));
        in.close();    }
}
