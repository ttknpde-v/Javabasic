package Lab_extratutorialclass;
import java.util.Scanner;
public class Schoolextra {
    boolean checkbreak;
    String word;
    public static void main(String[] args) {
        Scanner render = new Scanner(System.in);
        Schoolextra call = new Schoolextra();
        Stetementextraclass nobj = new Stetementextraclass();
        call.checkbreak = false;
        call.word = "ใช่";
        nobj.condiTion();

        while (true) {
            System.out.print("จำนวนนักเรียน : ");
            int person = render.nextInt();
            System.out.print("จำนวนชั่วโมง : ");
            int hours = render.nextInt();
            System.out.print("จำนวนเงินสด : ");
            int money = render.nextInt();
            nobj.summaryStudent(person,hours,money);
            System.out.print("ต้องการหยุดโปรแกรม (ใช่/ไม่) : ");
            String message = render.next();
            call.checkbreak = message.equals(call.word);
            if (call.checkbreak)break;
        }
        nobj.mesSage();
    }
}
