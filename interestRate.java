public class interestRate {    
    public interestRate(){
        System.out.println("This is the base class constructor");
    }   
    public double calculateInterest(double amount){
        return (amount*0.05);
    }
    public static void main(String args[]){
        //abstract classes cannot be instatiated
        //state of the class at that instance; the snapshot of the class
        interestRate ir = new interestRate();
        System.out.println(ir.calculateInterest(10000));
    } 
}
