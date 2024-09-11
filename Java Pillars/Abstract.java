abstract class Bank{
    public abstract void custumer();
}
class Manager extends Bank{
    @Override
    public void custumer(){
        System.out.println("Bank name is maharashtra");
    }

}

public class Abstract {
    public static void main(String [] args){
    Manager m1= new Manager();
    m1.custumer();
    }
}