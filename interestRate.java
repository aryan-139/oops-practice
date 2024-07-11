public class interestRate {    
    public interestRate(){
        System.out.println("This is the base class constructor");
    }   
    public double calculateInterest(double amount){
        return (amount*0.05);
    }
    public static void main(String args[]){
        //asbtract classes cannot be instatiated
        //interestRate ir=new interestRate();
        interestRate ir = new interestRate();
        System.out.println(ir.calculateInterest(10000));
    } 
}
