package contactManager;

public class Contact {
    private String name;
   private int phoneNumber;

   public Contact(String name, int number){
       this.name = name;
       phoneNumber = number;
   }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}