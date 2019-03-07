package inheritproject;
public class Manager extends Employee {
    private String deptName;
    public Manager(String name,String ssn,double salary,String dept){
        super(name,ssn,salary);
        this.deptName=dept;
        }
    public String getDeptName(){
        return this.deptName;
        }
    @Override
    public void displayInformation(){
    super.displayInformation();
    System.out.println("部門:"+deptName);
    }

}