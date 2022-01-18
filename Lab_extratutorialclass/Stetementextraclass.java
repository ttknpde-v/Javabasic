package Lab_extratutorialclass;

public class Stetementextraclass {
    private int countclass; private double average; private double sumamount;
    Stetementextraclass () {
        countclass = 0; average = 0; sumamount = 0;
        }
    public void summaryStudent (int person,int hours,double amounts) {
        stetementProcess(person,hours,amounts);
    }
    void stetementProcess (int person,int hours,double amounts) {
        if (person == 1) {
            sumamount = hours*500;
            System.out.println("ยอดรวม "+sumamount+" บาท");
            if (amounts < sumamount) {System.out.println("***ยอดเงินไม่พอค่ะ***");}
            else if (amounts >= sumamount) {
                System.out.println("ทอนเงินจำนวน "+(amounts-sumamount)+" บาท");
            }
        }
        else if (person == 2) {
            sumamount = person*(hours*450);
            System.out.println("ยอดรวม "+sumamount+" บาท");
            if (amounts < sumamount) {System.out.println("***ยอดเงินไม่พอค่ะ***");}
            else if (amounts >= sumamount) {
                average = sumamount/2;
                System.out.println("ทอนเงินจำนวน "+(amounts-sumamount)+" บาท");
                System.out.println("ค่าเฉลี่ย "+average+" ต่อคน");
            }
        }
        else if (person == 3) {
            sumamount = person*(hours*400);
            System.out.println("ยอดรวม "+sumamount+" บาท");
            if (amounts < sumamount) {System.out.println("***ยอดเงินไม่พอค่ะ***");}
            else if (amounts >= sumamount) {
                average = sumamount/3;
                System.out.println("ทอนเงินจำนวน "+(amounts-sumamount)+" บาท");
                System.out.println("ค่าเฉลี่ย "+average+" ต่อคน");
            }
        }
        else if (person == 4) {
            sumamount = person*(hours*350);
            System.out.println("ยอดรวม "+sumamount+" บาท");
            if (amounts < sumamount) {System.out.println("***ยอดเงินไม่พอค่ะ***");}
            else if (amounts >= sumamount) {
                average = sumamount/4;
                System.out.println("ทอนเงินจำนวน "+(amounts-sumamount)+" บาท");
                System.out.println("ค่าเฉลี่ย "+average+" ต่อคน");
            }
        }
        else if (person >= 5) {
            sumamount = person*(hours*300);
            average = sumamount/person;
            System.out.println("ยอดรวม "+sumamount+" บาท");
            if (amounts < sumamount) {System.out.println("***ยอดเงินไม่พอค่ะ***");}
            else if (amounts >= sumamount) {
                System.out.println("ทอนเงินจำนวน "+(amounts-sumamount)+" บาท");
                System.out.println("ค่าเฉลี่ย "+average+" ต่อคน");
            }
        }
            countclass++;
    }
    void mesSage () {
        System.out.println("จำนวนรอบการทำงาน "+countclass+" รอบ");

    }
    void condiTion () {
        System.out.println("ยินดีตอนรับสู่โรงเรียนโปรแกรมเมอร์");
        System.out.println("กติกา");
        System.out.println("นักเรียนหนึ่งคนชั่วโมงละ 500 บาท");
        System.out.println("นักเรียนสองคนชั่วโมงละ 450 บาท");
        System.out.println("นักเรียนสามคนชั่วโมงละ 400 บาท");
        System.out.println("นักเรียนสี่คนชั่วโมงละ 350 บาท");
        System.out.println("นักเรียนห้าคนขึ้นไปชั่วโมงละ 300 บาท");
    }

}
