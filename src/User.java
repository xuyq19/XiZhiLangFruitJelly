/**
 * author: @Lucas Xu
 * date: 2021-12-01
 * version: 0.1
 */
public class User{
    private String bankAccountUserId;
    private String bankAccountName;
    private String bankAccountPassword;
    private String bankAccountRealId;
    private String bankAccountPhoneNumber;
    private String bankAccountSex;
    private String bankAccountBirthDate;
    private String bankAccountBalance;
    public User(String bankAccountName,String bankAccountPassword,String bankAccountRealId,String bankAccountPhoneNumber,String bankAccountSex,String bankAccountBirthDate){
        this.bankAccountName = bankAccountName;
        this.bankAccountPassword = bankAccountPassword;
        this.bankAccountRealId = bankAccountRealId;
        this.bankAccountPhoneNumber = bankAccountPhoneNumber;
        this.bankAccountSex = bankAccountSex;
        this.bankAccountBirthDate = bankAccountBirthDate;
    }
    public String getBankAccountUserId(){
        return bankAccountUserId;
    }
    public String getBankAccountName(){
        return bankAccountName;
    }
    public String getBankAccountPassword(){
        return bankAccountPassword;
    }
    public String getBankAccountRealId(){
        return bankAccountRealId;
    }
    public String getBankAccountPhoneNumber(){
        return bankAccountPhoneNumber;
    }
    public String getBankAccountSex(){
        return bankAccountSex;
    }
    public String getBankAccountBirthDate(){
        return bankAccountBirthDate;
    }
    public String getBankAccountBalance(){
        return bankAccountBalance;
    }
    public void setBankAccountUserId(String bankAccountUserId){
        this.bankAccountUserId = bankAccountUserId;
    }
    public void setBankAccountName(String bankAccountName){
        this.bankAccountName = bankAccountName;
    }
    public void setBankAccountPassword(String bankAccountPassword){
        this.bankAccountPassword = bankAccountPassword;
    }
    public void setBankAccountRealId(String bankAccountRealId){
        this.bankAccountRealId = bankAccountRealId;
    }
    public void setBankAccountPhoneNumber(String bankAccountPhoneNumber){
        this.bankAccountPhoneNumber = bankAccountPhoneNumber;
    }
    public void setBankAccountSex(String bankAccountSex){
        this.bankAccountSex = bankAccountSex;
    }
    public void setBankAccountBirthDate(String bankAccountBirthDate){
        this.bankAccountBirthDate = bankAccountBirthDate;
    }
    public void setBankAccountBalance(String bankAccountBalance){
        this.bankAccountBalance = bankAccountBalance;
    }

}
