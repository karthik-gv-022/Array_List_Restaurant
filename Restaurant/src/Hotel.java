public class Hotel {
    private String shopName;
    private String ownerName;
    private Integer noOfServant;
    private String famousDish1;
    private String famousDish2;

    // Default constructor
    public Hotel() {}

    // Parameterized constructor
    public Hotel(String shopName, String ownerName, Integer noOfServant, String famousDish1, String famousDish2) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.noOfServant = noOfServant;
        this.famousDish1 = famousDish1;
        this.famousDish2 = famousDish2;
    }

    // Getters and Setters
    public String getShopName() { return shopName; }
    public void setShopName(String shopName) { this.shopName = shopName; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public Integer getNoOfServant() { return noOfServant; }
    public void setNoOfServant(Integer noOfServant) { this.noOfServant = noOfServant; }

    public String getFamousDish1() { return famousDish1; }
    public void setFamousDish1(String famousDish1) { this.famousDish1 = famousDish1; }

    public String getFamousDish2() { return famousDish2; }
    public void setFamousDish2(String famousDish2) { this.famousDish2 = famousDish2; }

    @Override
    public String toString() {
        return "\nShop Name : " + shopName +
               "\nOwner Name : " + ownerName +
               "\nTotal Servant : " + noOfServant +
               "\n1st Famous Dish : " + famousDish1 +
               "\n2nd Famous Dish : " + famousDish2;
    }
}
