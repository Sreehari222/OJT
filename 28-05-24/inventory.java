public class inventory{


    private int itemID;
    private String name;
    private int quantity;
    private double price;
  

    public inventory(int itemID, String name, int quantity, double price) {
      this.itemID = itemID;
      this.name = name;
      this.quantity = quantity;
      this.price = price;
    }
  

    public void updateQuantity(int newQuantity) {
      this.quantity = newQuantity;
    }
  

    public void displayItemDetails() {
      System.out.println("Item ID: " + itemID);
      System.out.println("Name: " + name);
      System.out.println("Quantity: " + quantity);
      System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

      inventory item = new inventory(101, "infinx", 10, 899.99);
  

      item.displayItemDetails();
  

      item.updateQuantity(8);
  
  
      item.displayItemDetails();
    }
  }