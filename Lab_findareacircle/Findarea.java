package Lab_findareacircle;
import java.lang.Math;
public class Findarea {
    static double pi = Math.PI;
    double result;
    public void summaryCricle(double radius) {
        getArea(radius);
        getDiameter(radius);
        getCircumference(radius);
    }

    void getArea(double radius) {
    result = pi*(radius*radius);
    messagearea(result);
    }
    void getDiameter(double radius) {
    result = radius*2;
    messagediameter(result);
    }
    void getCircumference(double radius) {
    result = (radius*pi)*2;
    messagecircumfer(result);
    }
    void messagearea(double result) {
        System.out.println("พื้นที่วงกลม = "+result+" cm²");
    }
    void messagediameter(double result) {
        System.out.println("เส้นผ่านศูนย์กลางวงกลม = "+result+" m");
    }
    void messagecircumfer(double result) {
        System.out.println("ความยาวเส้นรอบวง = "+result+" m");
    }
}
