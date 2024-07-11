public class sofr extends interestRate {
    public sofr(){
        super();
        System.out.println("This is the derived class constructor");
    }
    //overriding the base class methods
    @Override
    public double calculateInterest(double amount){
        return (amount*0.0531);
    }
    public static void main(String args[]){
        sofr sofrObj=new sofr();
        System.out.println(sofrObj.calculateInterest(10000));
    }
}