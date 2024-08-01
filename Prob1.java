public class Prob1 {

    public static void main(String[] args) {
       int basicSalary = 105000;
       double dearnessAllowance =  0.40 * basicSalary;
       double rentAllowance =  0.20 * basicSalary;
       double grossSalary = basicSalary + dearnessAllowance + rentAllowance;
       System.out.println("Gross salary: "+ grossSalary);
    }
    
}