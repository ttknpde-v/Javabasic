package AbstractInterface.basic;

abstract class Superhero {
    private String name;
    private String age;

    public void setName (String name) {

        this.name = name;

    }

    public void setAge (String age) {

        this.age = age;

    }
    public void disPlay () {

        System.out.println("Name "+this.name+"\nAge "+this.age);

    }
    public abstract void setskIll(String skill);
}
