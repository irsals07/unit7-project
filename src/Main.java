import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("-----------------------------------");
//        System.out.println("What would you like to do? ");
//        System.out.println("1. Calculate cost of one package");
//        System.out.println("2. Simulate packages");
//        System.out.println("3. How package costs are calculated");
//        System.out.println("4. Exit");
//        System.out.print("Input: ");
//
//        Scanner s = new Scanner(System.in);
//        String choice = s.nextLine();

         String houseNumber = "";
         String streetName = "";
         String apartmentNumber = "";
         String city = "";
         String state = "";
         String zipCode = "";

         String address = "1313 Mockingbird Lane, Springfield, MO 65123";

        if(!address.contains("Apt")){
            for(int i = 0; i<address.indexOf(" "); i++){
                houseNumber += address.charAt(i);
            }
            address = address.substring(address.indexOf(" ") + 1);
            for(int i = 0; i<address.indexOf(","); i++){
                streetName += address.charAt(i);
            }
            address = address.substring(address.indexOf(",") + 2);
            for(int i = 0; i<address.indexOf(","); i++){
                city += address.charAt(i);
            }
            address = address.substring(address.indexOf(", ") + 2);
            for(int i = 0; i<address.indexOf(" "); i++){
                state += address.charAt(i);
            }
            address = address.substring(address.indexOf(" ") + 1);
            for(int i = 0; i<address.length(); i++){
                zipCode += address.charAt(i);
            }
        }
        else if(address.contains("Apt")){
            for(int i = 0; i<address.indexOf(" "); i++){
                houseNumber += address.charAt(i);
            }
            address = address.substring(address.indexOf(" ") + 1);
            for(int i = 0; i<address.indexOf("Apt"); i++){
                streetName += address.charAt(i);
            }
            address = address.substring(address.indexOf("Apt"));
            for(int i = 0; i<address.indexOf(","); i++){
                apartmentNumber += address.charAt(i);
            }
            address = address.substring(address.indexOf(",") + 2);
            for(int i = 0; i<address.indexOf(","); i++){
                city += address.charAt(i);
            }
            address = address.substring(address.indexOf(", ") + 2);
            for(int i = 0; i<address.indexOf(" "); i++){
                state += address.charAt(i);
            }
            address = address.substring(address.indexOf(" ") + 1);
            for(int i = 0; i<address.length(); i++){
                zipCode += address.charAt(i);
            }
        }
        System.out.println(houseNumber + " " + streetName + apartmentNumber + ", " + city + ", " + state + " " + zipCode);


    }
}