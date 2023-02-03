public class Department {

    private int departmentId;
    private String name;

    //Constructor
    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    //Getters
    public int getDepartmentId() {
        return departmentId;
    }
    public String getName() {
        return name;
    }

    //Setters
    public void setDepartmentId (int departmentId) {
        this.departmentId = departmentId;

    }
    public void setName (String name) {
        this.name = name;
    }




}
