package Lab_Tutorialstetement1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Employee_ratepay {
    public static void main(String[] args) {

        Display_rate $nobJ;
        $nobJ = new Display_rate();
        System.out.println("โปรแกรมคำนวณค่าจ้างพนักงาน\nทำงานเกิน 160 ชั่วโมง บวกเงินโบนัส 50% ต่ออัตราจ้าง ราย/ชั่วโมง.");
        $nobJ.Setdisplay();

    }
}
class Display_rate {
    final int $person = 4;
    final double $rate_hour = 120.81d;
    final int $fixed_hour = 160; // 1 mount
    public void Setdisplay () {
        Scanner $in;
        $in = new Scanner (System.in);
        int []$hour_employee;
        $hour_employee = new int[$person];

        for (int id = 0 ; id < $person ; id ++) {
            System.out.print("ชั่วโมงทำงานพนักงานคนที่ "+(id+1)+". ");
            $hour_employee[id] = $in.nextInt();
        }

        Calculatehour($hour_employee);

    }
    private void Calculatehour (int [] arr) {
        DecimalFormat $format = new DecimalFormat("#0.00");
        int $sum;
        for (int id = 0 ; id < arr.length ; id ++) {
            $sum = arr[id];
            if ($sum >= 160) {
            System.out.println("ค่าจ้างพนักงานคนที่ " + (id + 1) + ". " +
            $format.format(((((($sum-$fixed_hour)*$rate_hour)*50)/100)+($fixed_hour*$rate_hour)+(($sum-$fixed_hour)*$rate_hour)))
             + " บาท");
            }
            if ($sum < 160) {
            System.out.println("ค่าจ้างพนักงานคนที่ " + (id + 1) + ". " + (arr[id] * $rate_hour) + " บาท");
            }
        }

    }
}
