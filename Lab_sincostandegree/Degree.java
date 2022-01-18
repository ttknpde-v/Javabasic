package Lab_sincostandegree;

public class Degree {
    private String degree60;
    private String degree45;
    private String degree30;
    private String degree37;
    private String degree53;

    Degree () {

        degree30 = "sin30 ํ 1/2 cos30 ํ √3/2 tan30 ํ 1/√3 ";
        degree37 = "sin37 ํ 3/5 cos37 ํ 4/5 tan37 ํ 3/4 ";
        degree53 = "sin53 ํ 4/5 cos53 ํ 3/5 tan53 ํ 4/3 ";
        degree45 = "sin45 ํ 1/√2 cos45 ํ 1/√2 tan45 ํ 1 ";
        degree60 = "sin60 ํ √3/2 cos60 ํ 1/2 tan60 ํ √3/1 ";
    }
    public void getSINCOSTAN (String degree) {
        getSwitch(degree);
        }
    void getSwitch(String degree) {
        switch (degree) {
            case "30":
                System.out.println("มุม " + degree + " องศา " + degree30);
                break;
            case "45":
                System.out.println("มุม " + degree + " องศา " + degree45);
                break;
            case "60":
                System.out.println("มุม " + degree + " องศา " + degree60);
                break;
            case "37":
                System.out.println("มุม " + degree + " องศา " + degree37);
                break;
            case "53":
                System.out.println("มุม " + degree + " องศา" + degree53);
                break;
            default:
                System.out.println("โปรดป้อนจำนวนองศา 30,45,60,37,53");
        }
    }
}
