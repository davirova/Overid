public class B_Duck extends B_Anima{
    B_Duck(){}
    B_Duck(String name)
    {
        this.name = name;
    }
    public void sound()
    {
        System.out.println("Animal sound: "+"quack quack");
    }

    @Override
    public void getName(String name) {
        System.out.println( "Animal name: "+ name);
    }

    public static void main(String[] args) {
        B_Duck bDuck = new B_Duck();
        bDuck.getName("Duck");
        bDuck.sound();
    }
}
