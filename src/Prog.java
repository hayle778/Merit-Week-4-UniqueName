import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {

        //when the user Enter a blank input the loop return

        Scanner input = new Scanner(System.in);

        ArrayList<String> empList = new ArrayList<>();
        System.out.println("Enter a name:");
        String america = input.nextLine();
        empList.add(america);
        System.out.println("Enter a name:");
        String america2 = input.nextLine();
        empList.add(america2);
        System.out.println("Enter a name:");
        String america3 = input.nextLine();
        empList.add(america3);
        System.out.println("Enter a name:");
        String america4 = input.nextLine();
       empList.add(america4);
        System.out.println("Enter a name:");
        String america5 = input.nextLine();
    empList.add(america5);
        System.out.println("Enter a name:");
        String america6 = input.nextLine();
        empList.add(america6);
        System.out.println(empList);
        ArrayList<String> newList = new ArrayList<>();

        for (String emp : empList) {
            if (input == null) {
                break;
                //    return;
            }
            if (!newList .contains(emp)) {
          newList.add(emp);

            }}
     for(String  empName : newList ){
    System.out.println("The edited name list is: "+ empName);
}
            //   System.out.println();



    }
    }






