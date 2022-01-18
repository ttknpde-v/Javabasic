package Lab_calculatevat7percent;
import java.util.Scanner;
public class Priceunitvat {
    public static void main(String[] args) {
        Scanner render = new Scanner(System.in);
        Percentvat nobj = new Percentvat();
        String product; double price;
        System.out.println
        (">>โปรแกรมควณภาษีมูลค่าเพิ่ม<<");

        System.out.print("ป้อนชื่อสินค้า : ");
        product = render.nextLine();
        System.out.print("ราคาสินค้า : ");
        price = render.nextDouble();
        nobj.Process(product,price);



    }
}
