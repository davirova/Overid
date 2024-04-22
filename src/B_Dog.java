public class B_Dog extends B_Anima{
    B_Dog(){}
    B_Dog(String name)
    {
        this.name = name;
    }
    void sound()
    {
        System.out.println("Animal sound: "+"bow bow");
    }

    @Override
    void getName(String name) {
        System.out.println( "Animal name: "+ name);
    }

    public static void main(String[] args) {
        B_Dog bDog = new B_Dog();
        bDog.getName("dog");
        bDog.sound();
    }
}
