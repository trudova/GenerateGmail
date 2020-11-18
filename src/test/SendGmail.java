package test;
import library.EmailUtility;
public class SendGmail {
    public static void main(String[] args) {
        String userName = "liubovtrudova@gmail.com";
        String passWord = "password";
        String receiver = "liubovtrudova@gmail.com";
        String subject="Liv";
        String text ="I like your sens oh humor";
        EmailUtility.sendEmails(userName,passWord,receiver,subject,text);
        System.out.println("done");
    }
}
