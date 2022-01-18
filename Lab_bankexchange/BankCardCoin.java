package Lab_bankexchange;

public class BankCardCoin {
    private Integer summoney;
    public void getCardCoin(int money) {
        if (money>=1000){
            summoney = money/1000;
            System.out.println("ธนบัตร 1000 จำนวน "+summoney+" ใบ");
            money = money%1000;
        }if (money>=500) {
            summoney = money/500;
            System.out.println("ธนบัตร 500 จำนวน "+summoney+" ใบ");
            money=money%500;
        }if (money>=100) {
            summoney = money/100;
            System.out.println("ธนบัตร 100 จำนวน "+summoney+" ใบ" );
            money=money%100;
        }if (money>=50) {
            summoney = money/50;
            System.out.println("ธนบัตร 50 จำนวน "+summoney+" ใบ" );
            money=money%50;
        }if (money>=20){
            summoney = money/20;
            System.out.println("ธนบัตร 20 จำนวน "+summoney+" ใบ" );
            money=money%20;
        }if (money>=10) {
            summoney = money/10;
            System.out.println("เหรียญ 10 จำนวน "+summoney+" เหรียญ" );
            money=money%10;
        }if (money>=5){
            summoney = money/5;
            System.out.println("เหรียญ 5 จำนวน "+summoney+" เหรียญ" );
            money=money%5;
        }if (money>=1) {
            summoney = money / 1;
            System.out.println("เหรียญบาท จำนวน " + summoney + " เหรียญ");
        }else if (money <= 0) {
            System.out.println("โปรดป้อนจำนวนที่เต็มค่ะ !!! ");
        }

    }

    }

