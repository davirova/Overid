public class B_Cat extends B_Anima{
    B_Cat(){}
    B_Cat(String name)
    {
        this.name = name;
    }
    public void sound()
    {
        System.out.println("Animal sound: "+"meow meow");
    }

    @Override
    public void getName(String name) {
        System.out.println( "Animal name: "+ name);
    }

    public static void main(String[] args) {
        B_Cat bCat = new B_Cat();
        bCat.getName("cat");
        bCat.sound();
    }
}
