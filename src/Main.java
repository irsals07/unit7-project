import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.println("-----------------------------------");
        System.out.println("What would you like to do? ");
        System.out.println("1. Calculate cost of one package");
        System.out.println("2. Simulate packages");
        System.out.println("3. How package costs are calculated");
        System.out.println("4. Exit");
        System.out.print("Input: ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        int c = Integer.parseInt(choice);

        if(c == 1){
            //origin zip
            System.out.println("Enter the Zipcode of the origin of the package: ");
            String oz = s.nextLine();
            int origin = Integer.parseInt(oz);
            //destination zip
            System.out.println("Enter the zipcode of the destination of the package: ");
            String zd = s.nextLine();
            int destination = Integer.parseInt(zd);
            //weight
            System.out.println("Enter the weight of the package: ");
            String weight = s.nextLine();
            int w = Integer.parseInt(weight);
            //height
            System.out.println("Enter the height of the package: ");
            String height = s.nextLine();
            int h = Integer.parseInt(height);
            //length
            System.out.println("Enter the length of the package: ");
            String length = s.nextLine();
            int l = Integer.parseInt(length);
            //width
            System.out.println("Enter the width of the package: ");
            String width = s.nextLine();
            int wi = Integer.parseInt(width);

            Package p = new Package(w, h, l, wi);
            PostageCalculator pc = new PostageCalculator();
            System.out.println("Cost: " + pc.calculatePostage(oz, zd, w,h,l,wi));
        }
        else if (c == 2){
            PackageSimulator ps = new PackageSimulator();
            System.out.println("How many packages would you like to simulate? ");
            String num = s.nextLine();
            int n = Integer.parseInt(num);
            ps.generatePackages(n);
            ps.getSimulationInfo();
            System.out.println("Total Cost: " + formatter.format(ps.generateTotalCost()));
        }


    }
}