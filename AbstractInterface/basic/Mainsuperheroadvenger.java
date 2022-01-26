package AbstractInterface.basic;

public class Mainsuperheroadvenger {
    public static void main(String[] args) {

        Ironman hero1 = new Ironman();
        hero1.setName("Iron man");
        hero1.setAge("30");
        hero1.setskIll("Shooting");
        hero1.moving("2398.03 mph");
        hero1.jumping("62.2 cm");
        hero1.disPlay();

        System.out.println();

        Thor hero2 = new Thor();
        hero2.setName("Thor");
        hero2.setAge("1200");
        hero2.setskIll("Strong");
        hero1.moving("7980.17 mph");
        hero1.jumping("2074 m");
        hero2.disPlay();



    }
}
