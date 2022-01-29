package Lab_Tutorialstetement1;
import java.util.Scanner;
/* ***********

     ******** โปรแกรมคำนวณเงินค่าจ้าง *****

 */
public class Calculatewage {
    final double $standard_rate = 150;
    final int $standard_hour = 40;
    static double result,bonus;

    public static void main(String[] args) {
        int hour;
        Calculatewage $nobj = new Calculatewage();
        Scanner reader = new Scanner (System.in);
        System.out.print("ป้อนชั่วโมงทำงานของคุณ : ");
        hour = reader.nextInt();
        $nobj.setWage(hour);



    }
    void setWage (int hour) {
        if ((hour > 0) && (hour <= $standard_hour)) {
        result = hour*$standard_rate;
            System.out.println("ค่าจ้าง : "+result+" บาท");
        }
        else if (hour > $standard_hour) {
        result = ($standard_rate*$standard_hour);
        bonus = (((hour-$standard_hour)*$standard_rate)/100*50)+(((hour-$standard_hour)*$standard_rate));
            System.out.println("โบนัส 50% : "+bonus+" บาท");
            System.out.println("รวมค่าจ้าง : "+(result+bonus)+" บาท");
        }
        else {
        System.out.println();
        }

    }
}
