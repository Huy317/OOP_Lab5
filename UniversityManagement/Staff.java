package UniversityManagement;

import java.util.Scanner;

public class Staff {
    protected String fullName;
    protected String dob;
    protected String id;
    public Staff(){
    }
    public Staff(String fullName, String dob, String id){
        this.fullName = fullName;
        this.dob = dob;
        this.id = id;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        dob = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextLine();
    }
    public String getId(){
        return id;
    }
    public double getSalary(){
        return 0;
    }
}
