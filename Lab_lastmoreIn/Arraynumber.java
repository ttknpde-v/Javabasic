package Lab_lastmoreIn;

public class Arraynumber {
    static int result;
    public static void main (String[] args) {
        int number[] = {80,20,82,73,62,102,13,40,32,109};
        getComparearray(number);

    }
    static void getComparearray (int []arr) {
        result = arr[0];
        System.out.print("{");
        for (int x =0;x<arr.length;x++) {
            System.out.print(arr[x]);
            if (arr[x]>result) result = arr[x];
            if (x <= 9 -1) System.out.print(",");
        }
        System.out.print("}");
        System.out.print(" ตัวเลขที่มากที่สุด "+result);
    }
}
