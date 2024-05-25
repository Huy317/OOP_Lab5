package UniversityManagement;

import java.util.*;

public class Lecturer extends Staff {
    private String academicRank;
    private String academicDegree;
    private int yearOfExp;
    private int subjectsCount;

    public Lecturer() {
    }

    public Lecturer(String fullName, String dob, String id, String academicRank, String academicDegree, int yearOfExp,
            int subjectsCount) {
        super(fullName, dob, id);
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearOfExp = yearOfExp;
        this.subjectsCount = subjectsCount;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter academic rank: ");
        academicRank = sc.nextLine();
        System.out.print("Enter academic degree: ");
        academicDegree = sc.nextLine();
        System.out.print("Enter year of experience: ");
        yearOfExp = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter number of subjects: ");
        subjectsCount = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public double getSalary() {
        return (double) (subjectsCount * yearOfExp * 0.12d) * 20000;
    }
}
