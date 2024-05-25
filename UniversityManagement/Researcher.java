package UniversityManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Researcher extends Staff {
    private ArrayList<String> projectCode = new ArrayList<String>();
    private int yearOfExp;
    public Researcher(){
    }
    public Researcher(String fullName, String dob, String id, ArrayList<String> projectCode, int yearOfExp){
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
        for (int i = 0; i < n; i++){
            System.out.print("Enter project code: ");
            projectCode.add(sc.nextLine());
        }
        System.out.print("Enter year of exp: ");
        yearOfExp = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void Edit(){
        Input();
    }
    @Override
    public double getSalary(){
        int count = 0;
        for (String code : projectCode){
            if (code.startsWith("D")){
                count++;
            }
        }
        return (double)(yearOfExp*2 + count)*20000;
    }
}
