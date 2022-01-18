package Lab_sincostandegree;

import java.util.Scanner;

public class TestDeegree {
    public static void main(String[] args) {
        Scanner render = new Scanner(System.in);
        Degree getobject = new Degree();
        System.out.println("โปรแกรมทบทวนมุมและอัตราส่วนที่ควรจำ");
        while (true) {
            System.out.print("ป้อนองศา : ");
            String word = render.next();
            getobject.getSINCOSTAN(word);

            System.out.print("ต้องการจบโปรแกรม : (จบ) : ");

            String strbreaK = render.next();
            chekbreak = strbreak.equals(strbreaK);
            if (chekbreak) break;
        }


    }
    static boolean chekbreak;
    static String strbreak = "จบ";
}
