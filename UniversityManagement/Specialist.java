package UniversityManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Specialist extends Staff {
    private ArrayList<String> projectCode = new ArrayList<String>();    
    private int yearOfExp;
    public Specialist(){}
    public Specialist(String fullName, String dob, String id, ArrayList<String> projectCode, int yearOfExp){
        super(fullName, dob, id);
        this.projectCode = projectCode;
        this.yearOfExp = yearOfExp;
    }
    @Override
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of projects: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n;i++){
            System.out.print("Enter project code: ");
            projectCode.add(sc.nextLine());
        }
        System.out.print("Enter number of experience: ");
        yearOfExp = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public double getSalary() {
        int count = 0;
        for (String code : projectCode){
            if (code.startsWith("T")){
                count++;
            }
        }
        return (double)(yearOfExp*4 +count)*18000;
    }
}
