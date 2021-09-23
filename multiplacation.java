import java.util.Scanner;
public class multiplacation {
    public static void main(String[] args) {
        System.out.println("Welcome to multiplacation program");
        int i=1;
        System.out.println("Enter the number: ");
        Scanner input1=new Scanner(System.in);
        int input2=input1.nextInt();
        System.out.println("Enter the number range");
        Scanner input3=new Scanner(System.in);
        int input4=input1.nextInt();
        while(i<input4+1){
            System.out.print(input2+" * "+i+" = ");
            System.out.println(i*input2);
            i++;
        }
    }
}
