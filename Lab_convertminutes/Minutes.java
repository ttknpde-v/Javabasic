package Lab_convertminutes;

public class Minutes {
    private int hours;
    private int minutes;
    public void getTime (double minute) {
        minutes = (int) (minute%60);
        hours = (int) (minute/60);
        System.out.printf("%d:%d",hours,minutes);
        System.out.print(" (ชั่วโมง:นาที)");
    }
}
