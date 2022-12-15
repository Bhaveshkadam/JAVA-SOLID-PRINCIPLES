import java.sql.SQLOutput;

public class HR extends Employee{
    public HR(int id, String name, String location, boolean working) {
        super(id, name, location, working);
    }

    private void checkAttendance(){
        System.out.println("Checking Employee Attendance");
    }
    private void manageLeave(){
        System.out.println("Managing employee leaves requests");
    }
    @Override
    public void performDuties() {
        checkAttendance();
        manageLeave();
    }

}

