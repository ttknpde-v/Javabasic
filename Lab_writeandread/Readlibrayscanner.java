package Lab_writeandread;
import java.util.Scanner;
import java.io.File;
public class Readlibrayscanner {
    public static void main(String[] args) {
        try {
            String studentsrt = "";
            int position;
            double score;
            Readlibrayscanner nobJ = new Readlibrayscanner();
            Scanner reading = new Scanner(new File("student.txt"));
            while (reading.hasNext()) {
                studentsrt = reading.nextLine();
                position = studentsrt.indexOf(" ");
                studentsrt = studentsrt.substring(position, studentsrt.length());
                studentsrt = studentsrt.trim();
                score = Double.parseDouble(studentsrt);
                nobJ.getGarde(studentsrt,score);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private Double scorenisit;
    private String grade;
    public void getGarde (String nisit,double sc) {
        scorenisit = sc; grade = "F";
        if (scorenisit >= 97 && scorenisit <= 100) {
            grade = "A+";
        } else if (scorenisit >= 93 && scorenisit <= 96) {
            grade = "A";
        }else if (scorenisit >= 90 && scorenisit <= 92) {
            grade = "A-";
        }else if (scorenisit >= 87 && scorenisit <= 89) {
            grade = "B+";
        }else if (scorenisit >= 83 && scorenisit <= 86) {
            grade = "B";
        }else if (scorenisit >= 80 && scorenisit <= 82) {
            grade = "B-";
        }else if (scorenisit >= 77 && scorenisit <= 79) {
            grade = "C+";
        }else if (scorenisit >= 73 && scorenisit <= 76) {
            grade = "C";
        }else if (scorenisit >= 70 && scorenisit <= 72) {
            grade = "C-";
        }else if (scorenisit >= 67 && scorenisit <= 69) {
            grade = "D+";
        }else if (scorenisit >= 60 && scorenisit <= 66) {
            grade = "D";
        }else if (scorenisit >= 0 && scorenisit <= 59) {
            grade = "F";
        }else if (scorenisit < 0 || scorenisit > 100) {
            grade = "Error";
        }
        System.out.println(nisit+"    "+grade);
    }
}


