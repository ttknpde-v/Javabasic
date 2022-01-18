package Lab_array2d;

public class Arraytwo_d {
    public static void main(String[] args) {
        Process nobj = new Process();

        int group[][] = {
                {23,44,9},
                {46,50,37},
                {15,33,11},
                {29,41,28},
                {50,21,10},
                        };
            nobj.getArray(group);
            nobj.positive(group);
    }
}
class Process {
    private int index_0; private float avg_0;
    private int index_1; private float avg_1;
    private int index_2; private float avg_2;
    private int index_3; private float avg_3;
    private int index_4; private float avg_4;
    public void getArray (int[][] arr) {
        for (int row = 0;row< arr.length;row++) {
            System.out.print("{");
                for (int colums = 0;colums<arr[row].length;colums++) {
                    System.out.print(arr[row][colums]);
                    if (colums <= 2 -1) {System.out.print(",");}
                }
            System.out.println("}");
            }
        }

    public void positive (int [][] arr) {
            for (int x = 0; x < 1;x++) {
                for (int y = 0;y <= 2;y++) {
                    index_0 += arr[x][y];
                    avg_0 = index_0/3;
                    System.out.print(arr[x][y]);
                    if (y < 3 -1) {System.out.print(" + ");}
                }
                System.out.print(" = "+index_0+" ");
                System.out.println("ค่าเฉลี่ย : "+avg_0);
            }

            for (int x = 1;x < 2;x++) {
                for (int y =0;y <= 2;y++) {
                    index_1 += arr[x][y];
                    avg_1 = index_1/3;
                    System.out.print(arr[x][y]);
                    if (y < 3 -1) {System.out.print(" + ");}
                }
                System.out.print(" = "+index_1+" ");
                System.out.println("ค่าเฉลี่ย : "+avg_1);
            }

            for (int x = 2;x < 3;x++) {
                for (int y=0;y <= 2;y++) {
                    index_2 += arr[x][y];
                    avg_2 = index_2/3;
                    System.out.print(arr[x][y]);
                    if (y < 3 -1) {System.out.print(" + ");}
                }
                System.out.print(" = "+index_2);
                System.out.println(" ค่าเฉลี่ย : "+avg_2);
            }

            for (int x = 3;x < 4;x++) {
                for (int y = 0;y <= 2;y++) {
                    index_3 += arr[x][y];
                    avg_3 = index_3/3;
                    System.out.print(arr[x][y]);
                    if (y < 3 -1) {System.out.print(" + ");}
                }
                System.out.print(" = "+index_3);
                System.out.println(" ค่าเฉลี่ย : "+avg_3);
            }

            for (int x = 4;x < 5;x++) {
                for (int y = 0;y <= 2;y++) {
                    index_4 += arr[x][y];
                    avg_4 = index_4/3;
                    System.out.print(arr[x][y]);
                    if (y < 3 -1) {System.out.print(" + ");}
            }
            System.out.print(" = "+index_4);
            System.out.println(" ค่าเฉลี่ย : "+avg_4);
        }




    }
}
