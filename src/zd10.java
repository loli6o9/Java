import java.util.Scanner;
public class zd10 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите ваш год рождения: ");
                int Birthday = in.nextInt();
                System.out.println("Введите текущий год: ");
                int Year = in.nextInt();
                System.out.println("Вам : "+(Year-Birthday)+" лет");
                in.close();    }
        }
