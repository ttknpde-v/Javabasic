package Lab_convertminutes;

import java.util.Scanner;

public class Inputminutes {
    public static void main(String[] args) {
        Minutes nobj = new Minutes();
        Scanner render = new Scanner(System.in);
        double time;
        System.out.println
        (">>>โปรแกรมแปลงเวลา (นาที => ชั่วโมง)<<<");

        System.out.print("ป้อนนาทีที่ต้องการแปลง : ");
        time = render.nextDouble();
        nobj.getTime(time);
    }
}
