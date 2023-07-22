
public class Modifier {
    private int privateVariable = 10;
    protected int protectedVariable = 20;
    public int publicVariable = 30;
    int defaultVariable = 40;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    public static void main(String[] args) {
        Modifier example = new Modifier();
        // Accessing variables
        System.out.println("Private variable: " + example.privateVariable);
        System.out.println("Protected variable: " + example.protectedVariable);
        System.out.println("Public variable: " + example.publicVariable);
        System.out.println("Default variable: " + example.defaultVariable);

        // Invoking methods
        example.privateMethod();
        example.protectedMethod();
        example.publicMethod();
        example.defaultMethod();
    }    
}
