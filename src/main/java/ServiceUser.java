/**
 * @author zhangjiawen
 */
import java.util.*;
import java.util.Scanner;

public class ServiceUser {
    public boolean testInformation(String bankAccountUserId,String bankAccountName,String bankAccountPassword,String bankAccountRealId,String bankAccountPhoneNumber,char bankAccountSex,String bankAccountBirthDate){
        if(bankAccountUserId.length()!=10){
            System.out.println("The length of User ID must be 10!");
            return false;
        }
        for(int i = 0;i < bankAccountUserId.length();i++){
            if(bankAccountUserId.charAt(i) > '9' || bankAccountUserId.charAt(i) < '0'){
                System.out.println("The accountid must be numbers!");
                return false;
            }
        }
        if(bankAccountName.length()>10){
            System.out.println("The length of user name must be shorter than 10!");
            return false;
        }
        if(bankAccountRealId.length()!=12) {
            System.out.println("The length of real ID must be 12!");
            return false;
        }
        for(int i = 0;i < bankAccountRealId.length();i++){
            if(bankAccountRealId.charAt(i) > '9' ||bankAccountRealId.charAt(i) < '0'){
                System.out.println("The id must be numbers!");
                return false;
            }
        }
        if(bankAccountSex!='F'&&bankAccountSex!='M'){
            System.out.println("The sex must be F or M");
        }
        if(bankAccountBirthDate.length()!=10){
            System.out.println("The format of birthday must be YYYY-MM-DD");
            return false;
        }
        if(bankAccountBirthDate.charAt(4)!='-'||bankAccountBirthDate.charAt(7)!='-'){
            System.out.println("The format of birthday must be YYYY-MM-DD");
            return false;
        }
        return true;
    }
    public boolean register(String bankAccountUserId,String bankAccountName,String bankAccountPassword,String bankAccountRealId,String bankAccountPhoneNumber,char bankAccountSex,String bankAccountBirthDate){
        if(testInformation(bankAccountUserId,bankAccountName,bankAccountPassword,bankAccountRealId,bankAccountPhoneNumber,bankAccountSex,bankAccountBirthDate)){
            return true;
        }
        return false;
    }
    public void setInformation(User auser){
        System.out.println("Please input the id of the information you want to reset");
        System.out.print("1.username\n2.phone number\n3.password\n");
        Scanner keyin = new Scanner(System.in);
        int choose = keyin.nextInt();
        switch (choose){
            case 1:{
                System.out.print("Please input the name:");
                String ausername = keyin.next();
                if(testinfo(auser.getAccountId(),ausername,aresident.getPassword(),aresident.getId(),aresident.getPhone(),aresident.getSex(),aresident.getBirthday())==true){
                    aresident.setUsername(ausername);
                }
                else {
                    System.out.println("Reset unsuccessfully!");
                }
            }
            case 2:{
                System.out.print("Please input the phone number:");
                String aphone = keyin.next();
                if(testinfo(aresident.getAccountId(),aresident.getUsername(),aresident.getPassword(),aresident.getId(),aphone,aresident.getSex(),aresident.getBirthday())==true){
                    aresident.setUsername(aphone);
                    System.out.println("Reset the phonenumber successfully!");
                }
                else {
                    System.out.println("Reset unsuccessfully!");
                }
            }
            case 3:{
                int time = 5;
                while(time >= 0){
                    System.out.print("Please input the old password:");
                    String apassword = keyin.next();
                    if(apassword.equals(aresident.getPassword())){
                        System.out.print("Correct!Please the new password:");
                        apassword = keyin.next();
                        System.out.println("Reset the password successfully!");
                    }
                    else {
                        time--;
                        System.out.println("Reset unsuccessfully!You have only "+time+" times!");
                    }
                }
                if(time == 0){
                    System.out.println("Time is up!");
                }
            }
        }
        keyin.close();
    }
    public boolean withdrawmoney(fmResident aResident,double money){
        if(aResident.getMoney()>money){
            aResident.WithdrawMoney(money);
            return true;
        }
        else{
            return false;
        } 
    }
    public void depositmoney(fmResident aResident,double money){
        depositmoney(aResident, money);
    }
    public void transport(fmResident from,fmResident to,double money){
        if(from.getMoney()>=money){
            from.WithdrawMoney(money);
            to.DepositMoney(money);
        }
    }
}
