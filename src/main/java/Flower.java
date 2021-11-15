import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class Flower extends test {


    public static void main(String args[]) {
        //Creating objects
        test obj1 = new test();
        obj1.set("lilly",5, 3);

        test obj2 = new test();
        obj1.set("rose" ,7, 1);

        test obj3=new test();
        obj1.set("jasmine",2,2);

        //Accessing object data through reference

        double total = obj1.getCost();
        System.out.println("The total cost of bouquet:" + total);

    }
}


