class Employee{
    int employeeId;
    String employeeName;
    float salary;
    Employee(int employeeId,String employeeName,float salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }
    void display() {
        System.out.println("EmployeeId: " + employeeId + "\nEmployeeName: " + employeeName + "\nsalary: "+ salary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e = new Employee(1001,"John",50000);
//		System.out.println("Employee Id : "+e.employeeId + "\nEmployee Name : "+e.employeeName + "\nSalary : "+e.salary);
        e.display();
    }
}
