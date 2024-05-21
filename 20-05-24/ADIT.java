public class ADIT {
    private String name;
    private String phoneNumber;

    public ADIT(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void storeDetails(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }


    public static void main(String[] args) {
        ADIT contact = new ADIT("harilal", "9207618434");
        contact.printDetails();


        contact.storeDetails("sreehari", "9656877802");
        contact.printDetails(); 
    }
}
