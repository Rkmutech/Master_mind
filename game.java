import java.util.Scanner;

public class game {
    public static void match_input(String input)
    {
        Scanner scan=new Scanner(System.in);
        String user_input_1="";
        System.out.println("Enter the input1:");
        user_input_1=scan.nextLine();
        System.out.println("Enter the input2:");
        String user_input_2="";
        System.out.println("Enter the input3:");
        String user_input_3="";
        System.out.println("Enter the input4:");
        String user_input_4="";
        System.out.println("Enter the input5:");
        String user_input_5="";
        System.out.println("Enter the input6:");
        String user_input_6="";
        System.out.println("Enter the input7:");
        String user_input_7="";
        System.out.println("Enter the input8:");
        String user_input_8="";

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        game obj=new game();
        String input1="";
        String input2="";
        String input3="";
        String input4="";
        System.out.println("Enter the input1:");
        input1 =scan.nextLine();
        System.out.println("Enter the input2:");
        input2 =scan.nextLine();
        System.out.println("Enter the input3:");
        input3 =scan.nextLine();
        System.out.println("Enter the input4:");
        input4 =scan.nextLine();
        System.out.print(input1);
        System.out.print("\t"+input2);
        System.out.print("\t"+input3);
        System.out.print("\t"+input4);
    }
}
