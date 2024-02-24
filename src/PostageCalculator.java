public class PostageCalculator {
    double price= 3.75;
    public double calculatePostage(String zipCode, String zipCode2, double weight, double length, double width, double height){
        if(length + width + height < 36 && weight < 40){
            price += (weight/0.1)*5;;
            int z1 = Integer.parseInt(zipCode);
            int z2 = Integer.parseInt(zipCode2);
            price += (double) Math.abs(z1 - z2)/100;
        }
        else if(length+width+height > 36){
            double difference = length+weight+height-36;
            price += (weight/0.1)*5;;
            int z1 = Integer.parseInt(zipCode);
            int z2 = Integer.parseInt(zipCode2);
            price += (double) Math.abs(z1 - z2)/100;
            price += difference*0.1;
        }
        else if(weight>40){
            double difference = weight-40;
            price += (weight/0.1)*5;;
            int z1 = Integer.parseInt(zipCode);
            int z2 = Integer.parseInt(zipCode2);
            price += (double) Math.abs(z1 - z2)/100;
            price += (difference/0.1)*0.1;
        }
        return price;
    }
    public double calculatePostage(Address a1, Address a2, double weight, double length, double width, double height){
        if(length + width + height < 36 && weight < 40){
            price += (weight/0.1)*5;;
            int z1 = Integer.parseInt(a1.getZipCode());
            int z2 = Integer.parseInt(a2.getZipCode());
            price += (double) Math.abs(z1 - z2)/100;
        }
        else if(length+width+height > 36){
            double difference = length+weight+height-36;
            price += (weight/0.1)*5;;
            int z1 = Integer.parseInt(a1.getZipCode());
            int z2 = Integer.parseInt(a2.getZipCode());
            price += (double) Math.abs(z1 - z2)/100;
            price += difference*0.1;
        }
        else if(weight>40){
            double difference = weight-40;
            price += (weight/0.1)*5;;
            int z1 = Integer.parseInt(a1.getZipCode());
            int z2 = Integer.parseInt(a1.getZipCode());
            price += (double) Math.abs(z1 - z2)/100;
            price += (difference/0.1)*0.1;
        }
        return price;
    }
    public double calculatePostage(Package p1){
        if(p1.getLength() + p1.getWidth() + p1.getHeight() < 36 && p1.getWeight() < 40){
            price += (p1.getWeight()/0.1)*5;;
            int z1 = Integer.parseInt(p1.getOrigin().getZipCode());
            int z2 = Integer.parseInt(p1.getDestination().getZipCode());
            price += (double) Math.abs(z1 - z2)/100;
        }
        else if(p1.getLength() + p1.getWidth() + p1.getHeight() > 36){
            double difference = p1.getHeight()+p1.getHeight()+p1.getWidth()-36;
            price += (p1.getWeight()/0.1)*5;;
            int z1 = Integer.parseInt(p1.getOrigin().getZipCode());
            int z2 = Integer.parseInt(p1.getDestination().getZipCode());
            price += (double) Math.abs(z1 - z2)/100;
            price += difference*0.1;
        }
        else if(p1.getWeight()>40){
            double difference = p1.getWeight()-40;
            price += (p1.getWeight()/0.1)*5;;
            int z1 = Integer.parseInt(p1.getOrigin().getZipCode());
            int z2 = Integer.parseInt(p1.getDestination().getZipCode());
            price += (double) Math.abs(z1 - z2)/100;
            price += (difference/0.1)*0.1;
        }
        return price;
    }

}
