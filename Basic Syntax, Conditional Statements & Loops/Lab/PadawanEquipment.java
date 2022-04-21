import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        int count = 0;
        for (int i = 1; i <= students; i++) {
            if (i % 6 == 0) {
                count++;
            }
        }
        double sabreSinglePrice = Double.parseDouble(scan.nextLine());
        double robeSinglePrice = Double.parseDouble(scan.nextLine());
        double beltSinglePrice = Double.parseDouble(scan.nextLine());

        double totalSabrePrice = Math.ceil(1.1 * students) * sabreSinglePrice;
        double totalBeltPrice = (students - count) * beltSinglePrice;
        double totalRobePrice = students * robeSinglePrice;
        double totalMoney = totalBeltPrice + totalRobePrice + totalSabrePrice;
        if (totalMoney <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalMoney - amountOfMoney);
        }
    }
}
