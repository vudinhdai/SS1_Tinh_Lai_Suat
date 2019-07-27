import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interset_rate ;
        Scanner input = new Scanner(System.in);
        System.out.println(" so tien dau tu");
        money = input.nextDouble();
        System.out.println("Enter number of month:");
        month = input.nextInt();
        System.out.println("lai suat ");
        interset_rate = input.nextDouble();
        double total_interset ;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate / 100) / 12 * 3;
            System.out.println(" Enter  total_interset"+  total_interset);
        }
    }
}
