package test;
import library.EmailUtility;
public class SendGmail {
    public static void main(String[] args) {
        String userName = ""; //    your gmail address
        String passWord = ""; // your gmail password
        String[] receivers = { }; // receiver's email address (can be any domain)
        String subject = "";  // subject of the email
        String text = "";  // text message

        int times  = 1;
        for(int i = 1; i <= times; i++  ){  // how many times you wanna send?

            for( String each : receivers ){ // to how many people you wanna send the email
                EmailUtility.sendEmails(userName, passWord, each, subject, text);
            }

        }
        System.out.println("Completed");
    }
}
