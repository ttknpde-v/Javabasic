package AbstractInterface.basic;

public class Thor extends Superhero implements Skillhero {
    public  void setskIll(String skill) {
        System.out.println("skill "+skill);
    }
    public void moving (String moving) {
        System.out.println("speed "+moving);
    }
    public void weapon (String weapon) {
        System.out.println("weapon "+weapon);
    }
    public void jumping (String jum) {
        System.out.println("jumping "+jum);
    }
}
