package OOPS;

public class Student {
    private String id;
    private String Name;
    private String DOB;
    private String ClassList;

    public Student(String id, String name, String DOB, String classList) {
        this.id = id;
        Name = name;
        this.DOB = DOB;
        ClassList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", ClassList='" + ClassList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getClassList() {
        return ClassList;
    }

    public void setClassList(String classList) {
        ClassList = classList;
    }
}
