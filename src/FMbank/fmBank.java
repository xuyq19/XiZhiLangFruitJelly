package FMbank;

import java.util.ArrayList;

public class fmBank {
    private ArrayList<fmResident> fmbank;
    static int operation_times;
    public static void inti(){

    } 
    public fmBank(){
        fmbank = new ArrayList<fmResident>();
    } 
    public void refresh(){

    }
    public int accountnumber(){
        return fmbank.size();
    }
    public double getTotalMoney(){
        double total = 0;
        for(fmResident i:fmbank){
            total += i.getMoney();
        }
        return total;
    }
    
}
