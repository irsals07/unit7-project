public class PostageCalculator {

    public double calculatePostage(String zipCode, String zipCode2, double weight, double length, double width, double height){
        double price= 3.75;

        if(weight < 40){
            price += (weight*10)*.05;
        }
        else{
            price += 20 + (0.1*((weight-40)));
        }
        if(length + width + height > 36){
            price += (length + width + height -36)*.1;
        }
        int z1 = Integer.parseInt(zipCode);
        int z2 = Integer.parseInt(zipCode2);
        price += (double) Math.abs(z1 - z2)/100;
        return price;
    }
    public double calculatePostage(Address a1, Address a2, double weight, double length, double width, double height){
        double price= 3.75;

        if(weight < 40){
            price += (weight*10)*.05;
        }
        else{
            price += 20 + (0.1*((weight-40)));
        }
        if(length + width + height > 36){
            price += (length + width + height -36)*.1;
        }
        int z1 = Integer.parseInt(a1.getZipCode());
        int z2 = Integer.parseInt(a2.getZipCode());
        price += (double) Math.abs(z1 - z2)/100;
        return price;
    }
    public double calculatePostage(Package p1){
        double price= 3.75;

        if(p1.getWeight() < 40){
            price += (p1.getWeight()*10)*.05;
        }
        else{
            price += 20 + (0.1*((p1.getWeight()-40)));
        }
        if(p1.getLength() + p1.getWidth() + p1.getHeight() > 36){
            price += (p1.getLength() + p1.getWidth() + p1.getHeight() -36)*.1;
        }
        int z1 = Integer.parseInt(p1.getOrigin().getZipCode().substring(0,3));
        int z2 = Integer.parseInt(p1.getDestination().getZipCode().substring(0,3));
        price += (double) Math.abs(z1 - z2)/100;
        return price;
    }

}
