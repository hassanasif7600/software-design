/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{

   private double Salary;
   private double bonus;
  private String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }
      
   public void calcSalary(){
       
       if (Salary <= 3000 ){
           bonus = Salary * 0.1 ; 
                Salary = bonus  + Salary ;
                System.out.println(Salary);
            }
       else
           System.out.println(Salary);
   }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Payroll{" + "Salary=" + Salary + ", emp=" + emp + '}';
    }
   
 
    
    
}
