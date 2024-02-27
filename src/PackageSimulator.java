import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class PackageSimulator {

    NumberFormat formatter = new DecimalFormat("#0.00");
    public ArrayList<Package> packages = new ArrayList<Package>();
    public String[] zero = {"CT", "MA", "ME", "NH", "NJ", "PR", "RI","VT"};
    public String[] one = {"DE", "NY", "PA"};
    public String[] two = {"MD", "NC", "SC", "VA", "WV"};
    public String[] three = {"AL", "FL", "GA", "MS", "TN"};
    public String[] four = {"IN", "KY", "MI", "OH"};
    public String[] five = {"IA", "MN", "MT", "ND", "SD","WI"};
    public String[] six = {"IL", "KS", "MO", "NE"};
    public String[] seven = {"AR", "LA", "OK", "TX"};
    public String[] eight = {"AZ", "CO", "ID","NM", "UT", "WY"};
    public String[] nine = {"AK", "CA", "HI", "OR",   "WA"};

    public void generatePackages(int n){
        for(int i =0; i<n; i++){
            String OriginZipcode = "";
            String destinationZipcode = "";
            String filepath = "src/zipcodes";
            ArrayList<String> lines = new ArrayList<>();
            try {
                File file = new File(filepath);
                Scanner scanner = new Scanner(file);

                // Read each line and store it in an ArrayList
                while (scanner.hasNextLine()) {
                    lines.add(scanner.nextLine());
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Invalid source");
            }
            int index = (int)(Math.random()*lines.size());
            OriginZipcode = lines.get(index);
            int index2 = (int)(Math.random()*lines.size());
            destinationZipcode = lines.get(index2);

            Address origin = new Address("123", "Random Street", "Apt 3C", "City", "State", OriginZipcode);
            Address destination = new Address("123", "Random Street", "Apt 3C", "City", "State", destinationZipcode);

            //Generating data about the package
            double weight = (Math.random()*55) + 1;
            double length = (Math.random()*18);
            double width = (Math.random()*12);
            double height = (Math.random()*10);
            Package p = new Package(weight, length, height, width);
            p.setDestination(destination);
            p.setOrigin(origin);
            packages.add(p);
        }
    }
    public double generateTotalCost(){
        double cost = 0;
        PostageCalculator pc = new PostageCalculator();
        for(int i = 0; i<packages.size(); i++){
            cost += pc.calculatePostage(packages.get(i));
        }
        return cost;
    }

    public void getSimulationInfo(){
        PostageCalculator pc = new PostageCalculator();
        for(int i = 0; i<packages.size(); i++){
            System.out.println("Package " + (i+1) + ": ---------------------------------------------");
            System.out.println("Origin Address: " + packages.get(i).getOrigin());
            System.out.println("Destination Address: " + packages.get(i).getDestination());
            System.out.println("Weight: " + packages.get(i).getWeight() + " pounds");
            System.out.println("Height: " + packages.get(i).getHeight()+ " inches");
            System.out.println("Width: " + packages.get(i).getWidth()+ " inches");
            System.out.println("Length: " + packages.get(i).getLength()+ " inches");
            System.out.println("Cost: " + formatter.format(pc.calculatePostage(packages.get(i))));
        }
        System.out.println("------------------------------------------");
    }

    }

