package Lab_writeandread;
import java.io.*;
public class Filewrite {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter(new File("student.txt"));
            BufferedWriter bf = new BufferedWriter(w);
            bf.write("NISIT8900981    58.73\n");
            bf.write("NISIT8900982    60.01\n");
            bf.write("NISIT8900983    69.28\n");
            bf.write("NISIT8900984    77.96\n");
            bf.write("NISIT8900985    71.11\n");
            bf.write("NISIT8900986    84.43\n");
            bf.write("NISIT8900987    89.99\n");
            bf.write("NISIT8900988    99.10\n");
            bf.write("NISIT8900989    90.32\n");
            bf.close();



            } catch (Exception e) {e.printStackTrace();}
    }
}
