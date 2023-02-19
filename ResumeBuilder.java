import java.util.Scanner;

public class ResumeBuilder{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Full Name");
        String name= sc.nextLine();

        System.out.println("Enter your Email Address");
        String email= sc.nextLine();

        System.out.println("Enter your Phone number");
        String Phone= sc.nextLine();

        System.out.println("Enter your address");
        String address= sc.nextLine();

        System.out.println("Enter your profession title:");
        String title=sc.nextLine();

        System.out.println("Enter your Summary Statement:");
        String summary= sc.nextLine();

        System.out.println("\nResume");
        System.out.println("--------------------------------------");
        System.out.println("NAME:"+ name);
        System.out.println("EMAIL ID:"+ email);
        System.out.println("phone No.:"+ Phone);
        System.out.println("ADDRESS:"+address);
        System.out.println("PROFESSION TITLE:" +title);
        System.out.println("SUMMARY:" +summary);

    }
}