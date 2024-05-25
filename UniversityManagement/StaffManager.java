package UniversityManagement;

import java.util.ArrayList;

public class StaffManager {
    ArrayList<Staff> staffList = new ArrayList<Staff>();
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }
}
