package app;
import ca.Cart;
import app.Promain;
import java.util.*;
import java.util.ArrayList;
public class Login{
    private static ArrayList<String> username = new ArrayList<>();
    private static ArrayList<String> passwords = new ArrayList<>();
    private static ArrayList<Long> mobile = new ArrayList<>();
    private static ArrayList<Promain> promainObjects = new ArrayList<>();
    private static final HashMap<String, Cart> userCarts = new HashMap<>();
    private static String loggedInUser = null;


   // private static ArrayList<String> obj;
   // private static Scanner scanner;
   public static Scanner scanner = new Scanner(System.in);

    // public Login() {
    //     username = new ArrayList<>();
    //     passwords = new ArrayList<>();
    //     //scanner = new Scanner(System.in);
    //     mobile = new ArrayList<>();
    //     obj = new ArrayList<>();

    // }
   public static boolean pcp(String p)
	{
		int ca=0,nu=0,sm=0,sc=0;
		for (int i=0; i<p.length(); i++)
		{
			if(p.charAt(i)>='A'&&p.charAt(i)<='Z')
				ca++;
			else if(p.charAt(i)>='a'&&p.charAt(i)<='z')
				sm++;
			else if(p.charAt(i)>='0'&&p.charAt(i)<='9')
				nu++;
			else
				sc++;
		}
		if(ca>0&&nu>0&&sm>0&&sc>0&&p.length()>7)
			return true;
		return false;

	}


    public static String generateRandomString(int length) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(letters.charAt(random.nextInt(letters.length())));
        }

        return result.toString();
    }


        public static void signup(){
            System.out.println("Create a new account");
            long contactNumber = 0;
            while(true) {
                System.out.println("\u001B[36mEnter phone number:\u001B[0m");
                int c = 0;
                while(true){
                    try{
                        contactNumber = scanner.nextLong();
                        c++;
                    }catch(Exception e){
                        System.out.println("please enter an integer");
                    }
                    if(c!=0) break;
                }
                if(contactNumber>(long)(Math.pow(10,9))-1&&contactNumber<(long)(Math.pow(10,10))) break;
                System.out.println("Phone number length must be 10 digits only");
            }
            String password;
            while(true) {
                System.out.print("Enter Password[min 8 characters] \n(must include: 1 uppercase letter, 1 lowercase letter, 1 number, and 1 special character): ");

                password = scanner.next();
                if(pcp(password))
                    break;
            }
            String uname;
            while(true){
            System.out.print("Enter username ");
            uname = scanner.next();
            if(!username.contains(uname)){
                username.add(uname);
                passwords.add(password);
                mobile.add(contactNumber);
                break;
            }
            else System.out.println("Already Exist!. Please try another userName");
        }
        //    String obj1 = generateRandomString();
        userCarts.put(uname, new Cart());
            //Promain obj.get(i) = new Promain();
            System.out.println("Account created Successfully!");
            login();
    }

    public static void login(){
        int userIndex;
        String uname;
        while (true) {
            System.out.print("Enter username: ");
            uname = scanner.next();
            userIndex = username.indexOf(uname);
            if (userIndex != -1) {
                loggedInUser = uname;
                break;
            }
            String suchi;
            while(true){
            System.out.println("Invalid username. \n 1. Retry \n 2. See UserName \n 3. Create New Account  \n 4. Exit");
            suchi = scanner.next();
                if(suchi.equals("1")||suchi.equals("2")||suchi.equals("3")||suchi.equals("4")) break;
                else System.out.println("Invalid Input.");
            }
                if(suchi.equals("2")) {
                long contactNumber = 0;
                while(true){
                System.out.println("\u001B[36mEnter phone number:\u001B[0m");
                int c = 0;
                while(true){
                    try{
                        contactNumber = scanner.nextLong();
                        c++;
                    }catch(Exception e){
                        System.out.println("please enter phone number");
                    }
                    if(c!=0) break;
                }
                if(mobile.contains(contactNumber)) break;
                else{
                    String us;
                    while(true){
                    System.out.println("Invalid phone number. \n 1. Retry \n 2. Create New Account \n 3.Back   \n 4. Exit");
                    us = scanner.next();
                    if(us.equals("1")||us.equals("2")||us.equals("3")||us.equals("4")) break;
                    else System.out.println("Invalid Input.");
                    }
                    if(us.equals("2")) signup();
                    else if(us.equals("3")) login();
                    else if(us.equals("4")) System.exit(0);
                }
                
                }
                if(mobile.contains(contactNumber)){
                    for(int i = 0;i<mobile.size();i++){
                        if(contactNumber==mobile.get(i))
                     System.out.println("UserName:"+username.get(i));
                    }
                     System.out.print("Loading Back To Login Page.");
                     for (int i = 0; i < 5; i++) {
                         try {
                             System.out.print(".");
                             Thread.sleep(1000);
                         } catch (InterruptedException e) {
                             System.out.println("An error occurred.");
                             return;
                         }
                     }
                    }
        }
                    else if(suchi.equals("3")){ signup(); break;}
                    else if(suchi.equals("4")) System.exit(0);
    }
    while(true){
    System.out.print("Enter Password: ");
    String password = scanner.next();
    if(password.equals(passwords.get(userIndex))){
        Promain.main(new String[]{});
        break;
    }
    else{
         System.out.println("Invalid Password");
         String rp;
         while(true){
            System.out.println(" 1. Do you want to retry \n 2. Do you want to reset Password \n 3. Exit");
            rp = scanner.next();
            if(rp.equals("1")||rp.equals("2")||rp.equals("3")) break;
            else System.out.println("Invalid Input.");
            }
         //if(rp.equalsIgnoreCase("2")) reset();
         if(rp.equalsIgnoreCase("2")) reset();
         if(rp.equalsIgnoreCase("3")) System.exit(0);

        }
}

}
public static Cart getCurrentUserCart() {
    return userCarts.get(loggedInUser);
}
public static void reset(){
    while(true){
    System.out.print("Enter username ");
    String uname=scanner.next();
    int i;
    for(i = 0;i<username.size();i++){
        if(uname.equals(username.get(i))) break;
    }
    if(i!=username.size()){
        String password;
        while(true) {
            System.out.print("Enter Password[min 8 characters] \n(must include: 1 uppercase letter, 1 lowercase letter, 1 number, and 1 special character): ");

            password = scanner.next();
            if(pcp(password))
                break;
        }
        passwords.remove(i);
        passwords.add(password);
        System.out.println("Updated Password Successfully!");
        login();
        break;
    }
    else{
        String op;
        while(true){
        System.out.println(" 1. Do you want to retry \n 2. Do you want to create an account \n 3. Back \n 4. Exit");
        op = scanner.next();
        if(op.equals("1")||op.equals("2")||op.equals("3")||op.equals("4")) break;
        else System.out.println("Invalid Input.");
        }
        if(op.equals("2")) signup();
        else if(op.equals("4")) System.exit(0);
        else if(op.equals("3")) login();
    }

}
}
public static void display(){
    for(int i = 0;i<username.size();i++){
        System.out.println(username.get(i));
    }
    String en;
    while(true){
    System.out.println(" 1. Login \n 2. SignUp \n 3. Exit");
    en = scanner.next();
    if(en.equals("1")||en.equals("2")||en.equals("3")) break;
    else System.out.println("Invalid Input.");
    }
    if(en.equals("1")) login();
    else if(en.equals("2")) signup();
    else System.exit(0);
}
public static void main(String[] args){
    display();
}
}