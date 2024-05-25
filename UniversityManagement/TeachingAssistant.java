package UniversityManagement;

import java.util.Scanner;

public class TeachingAssistant extends Staff {
    private int subjectsCount;

    public TeachingAssistant() {
    }

    public TeachingAssistant(String fullName, String dob, String id, int subjectsCount) {
        super(fullName, dob, id);
        this.subjectsCount = subjectsCount;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subjects count: ");
        subjectsCount = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public double getSalary() {
        return (double)subjectsCount * 0.3d * 18000d;
    }
}
