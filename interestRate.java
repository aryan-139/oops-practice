public abstract class interestRate {
    public abstract double calculateInterest(double amount);
    public static void main(String args[]){
        //interestRate ir=new interestRate();
        interestRate ir = new sofr();
        System.out.println(ir.calculateInterest(10000));
    } 
}
