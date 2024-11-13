package OOPs;

import java.util.ArrayList;

public class OOPs {



    //This method is non-static method and thus can only be used after instantiation i.e. using a object and calling the method
    void greeting(String name){
        System.out.print("Hello My name is: "+name);

    }
    public void main(String[] args) {

        //Calling a non-static method directly
        //greeting("Kartik");
        //Error = java: non-static method greeting(java.lang.String) cannot be referenced from a static context


        OOPs method = new OOPs();
        //Calling the method using an object
        method.greeting("Kartik");
//        method.main(new String[] {});


//        ArrayList<Integer> = new ArrayList<>();
    }
    public static void hello(){
        System.out.println("Hello World");
    }
}
