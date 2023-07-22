import java.util.Scanner;
 class ANaturalNumbers {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n=scan.nextInt();
        System.out.println("The first 10 natural numbers are:\n");
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
        System.out.println("\n");
    }
}
