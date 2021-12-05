package FMbank;

public class fmResident {
    private String accountId;//十位数字的银行用户ID
    public String username;//用户名
    private String password;//密码
    private String Id;//身份ID
    private String phone;//手机号
    public char sex;//性别
    private String birthday;//生日
    private double money;//账户余额
    public fmResident(String accountid,String username,String password,String id,String phone,char sex,String birthday){
        this.accountId = accountid;
        this.username = username;
        this.password = password;
        this.Id = id;
        this.phone = phone;
        this.sex = sex;
        this.birthday = birthday;
        this.money = 2000;
    }
    //get
    public String getAccountId() {
        return accountId;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getId() {
        return Id;
    }
    public String getPhone() {
        return phone;
    }
    public String getBirthday(){
        return birthday;
    }
    public char getSex(){
        return sex;
    }
    public double getMoney() {
        return money;
    }
    
    //set

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    //WithdrawMoney & DepositMoney 
    public void WithdrawMoney(double withdrawmoney) {
        money -= withdrawmoney;
    }
    public void DepositMoney(double depositmoney) {
        money += depositmoney;
    }
}
