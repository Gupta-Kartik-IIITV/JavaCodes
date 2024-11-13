package OOPs;

public class House {

    House(){
        super();
    }
    void location(int a){
        System.out.println("Your Location: House");
    }

    @Override
    public String toString(){
        String aClass = (String) this.getClass().getName();
        return aClass;
    }

    public static void greetings(){
        System.out.println("hello");
    }
}
