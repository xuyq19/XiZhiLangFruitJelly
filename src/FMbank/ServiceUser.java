package FMbank;

import java.util.Scanner;

public class ServiceUser {
    public boolean testinfo(String accountid,String username,String password,String id,String phone,char sex,String birthday){
        if(accountid.length()!=10){
            System.out.println("The length of accountid must be 10!");
            return false;
        }
        for(int i = 0;i < accountid.length();i++){
            if(accountid.charAt(i) > '9' || accountid.charAt(i) < '0'){
                System.out.println("The accountid must be numbers!");
                return false;
            }
        }
        if(username.length()>10){
            System.out.println("The length of username must be shorter than 10!");
            return false;
        }
        if(id.length()!=12) {
            System.out.println("The length of id must be 12!");
            return false;
        }
        for(int i = 0;i < id.length();i++){
            if(id.charAt(i) > '9' ||id.charAt(i) < '0'){
                System.out.println("The id must be numbers!");
                return false;
            }
        }
        if(sex!='F'&&sex!='M'){
            System.out.println("The sex must be F or M");
        }
        if(birthday.length()!=10){
            System.out.println("The format of birthday must be YYYY-MM-DD");
            return false;
        }
        if(birthday.charAt(4)!='-'||birthday.charAt(7)!='-'){
            System.out.println("The format of birthday must be YYYY-MM-DD");
            return false;
        }
        return true;
    }
    public boolean register(String accountid,String username,String password,String id,String phone,char sex,String birthday){
        if(testinfo(accountid, username, password, id, phone, sex, birthday))return true;
        else {
            System.out.println("Register unsuccessful!");
            return false;
        }
    }
    public void setinfo(fmResident auser){
        System.out.println("Please input the id of the information you want to reset");
        System.out.print("1.username\n2.phone number\n3.password\n");
        Scanner keyin = new Scanner(System.in);
        int choose = keyin.nextInt();
        switch (choose){
            case 1:{
                System.out.print("Please input the usernaem:");
                String ausername = keyin.next();
                if(testinfo(auser.getAccountId(),ausername,auser.getPassword(),auser.getId(),auser.getPhone(),auser.getSex(),auser.getBirthday())==true){
                    auser.setUsername(ausername);
                }
                else {
                    System.out.println("Reset unsuccessfully!");
                }
            }
            case 2:{
                System.out.print("Please input the phone number:");
                String aphone = keyin.next();
                if(testinfo(auser.getAccountId(),auser.getUsername(),auser.getPassword(),auser.getId(),aphone,auser.getSex(),auser.getBirthday())==true){
                    auser.setUsername(aphone);
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
                    if(apassword.equals(auser.getPassword())){
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
    public boolean withdrawmoney(fmResident auser,double money){
        if(auser.getMoney()>money){
            auser.WithdrawMoney(money);
            return true;
        }
        else{
            return false;
        } 
    }
    public void depositmoney(fmResident auser,double money){
        depositmoney(auser, money);
    }
    public void transport(fmResident from,fmResident to,double money){
        if(from.getMoney()>=money){
            from.WithdrawMoney(money);
            to.DepositMoney(money);
        }
    }
}
