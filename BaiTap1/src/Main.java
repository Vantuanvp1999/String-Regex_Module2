//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String s : validClassName) {
            boolean isValid = classNameExample.validate(s);
            System.out.println("Class: " + s + " isValid: " + isValid);
        }
        for (String s : invalidClassName) {
            boolean isValid = classNameExample.validate(s);
            System.out.println("Class: " + s + " isValid: " + isValid);
        }
    }
}