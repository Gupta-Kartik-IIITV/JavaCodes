package OOPs;

import static OOPs.House.greetings;

public class Main {
    public static void main(String[] args) {



        House h = new House();

        Room r = new Room();

        House x = new Room();

//        @Override
        System.out.println(h.toString());

//        System.out.print(h.getName());


//        @Override
        r.location(2);

//        @Override
        x.location(3);

        OOPs.hello();


        OOPs o = new OOPs();

        o.main(new String[] {});

    }
}
