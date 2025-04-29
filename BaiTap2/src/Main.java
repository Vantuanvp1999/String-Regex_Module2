//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String[] validPhoneNumbers = {"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = {"(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};
    public static void main(String[] args) {
    PhoneNumber phoneNumber = new PhoneNumber();
  for (String s : validPhoneNumbers) {
     boolean isvalid = phoneNumber.isValidPhoneNumber(s);
     System.out.println("phone number "+s+" isvalid: "+isvalid);
  }
  for (String s : invalidPhoneNumber) {
      boolean isvalid = phoneNumber.isValidPhoneNumber(s);
      System.out.println("phone number "+s+" isvalid: "+isvalid);

  }
    }
}