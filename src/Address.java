public class Address {

    private String houseNumber;
    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipCode;

    public Address(String houseNumber, String streetName, String apartmentNumber, String city, String state, String zipCode){
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address address){
        houseNumber = address.houseNumber;
        streetName = address.streetName;
        apartmentNumber = address.apartmentNumber;
        city = address.city;
        state = address.state;
        zipCode = address.zipCode;
    }
    public Address(String address){
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
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String  getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return apartmentNumber + streetName + apartmentNumber + ", " + city + ", " + state + " " + zipCode;
    }
}
