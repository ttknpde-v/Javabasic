package Lab_calculatevat7percent;

public class Percentvat {
    private String product;
    private double price;
    private double sum;
    Percentvat () {
        product = "";
        price = 0;
        sum = 0;
    }
    public void Process (String p,double priIce) {
    product = p;
    price = priIce;
    getVat(product,price);
    }
    void getVat (String p,double price) {
        sum = (price*7)/100;
        System.out.println(p+" บวกภาษีมูลค่าเพิ่ม 7%\nรวมเป็นเงิน "+(price+sum)+" บาท");

    }
}
