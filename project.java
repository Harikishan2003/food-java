import java.util.Scanner;

public class project {
    public static void main(String[] args){
        System.out.println("Hello welcome to the food app");
        System.out.println("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        String pass1 = sc.next();
        System.out.println("Your password is now: "+pass1);

        System.out.println("Please enter your password: ");
        String pass = sc.next();

        while(!pass.equals(pass1)){
            System.out.println("Your password is incorrect try once again!");
            pass = sc.next();
        }

        System.out.println("access granted!");

        System.out.println("Are you hungry yes or no: ");
        String ans = sc.next();

        if(ans.equals("yes")) {
            System.out.println("This is our menu, choose item between 'burger,pizza,chicken biryani,fish,veg biryani': ");

            String ans1 = sc.next();

            if(ans1.equals("burger")||ans1.equals("pizza")||ans1.equals("chicken biryani")||ans1.equals("fish")||ans1.equals("veg biryani")){
                System.out.println("Would you like to have drinks? yes or no: ");
                String ans2 = sc.next();
                if(ans2.equals("yes")){
                    System.out.println("Would you prefer coke or juice?");
                    String ans3 = sc.next();
                }
                else{
                    System.out.println("Alright");
                }
            }
            else{
                System.out.println("Choose items from above menu");
            }
            System.out.println("You will get your order soon");

        }
        else{
            System.out.println("Alright have a good day");
        }

    }
}

