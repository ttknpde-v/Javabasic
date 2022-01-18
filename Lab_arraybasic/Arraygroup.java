package Lab_arraybasic;

public class Arraygroup {
    public static void main (String[] args) {
        String cpu[] = {"core i3","core i5","core i7","core i9"};
        getLoopfor(cpu);
    }
    static void getLoopfor (String []arr) {
        System.out.print("{");
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]);
                if(x<4 -1) System.out.print(",");
            }
        System.out.print("}");
    }
}

