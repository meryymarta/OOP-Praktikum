public class Student {
    private String name;
    private int studentID;
    private String major;
    private double gpa;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public void displayInfo(){
        System.out.println("Name:   " + name);
        System.out.println("Student ID  :" + studentID);
        System.out.println("Major   :" + major);
        System.out.println("Gpa :" + gpa);
        System.out.println("---------------------");
    }
}
