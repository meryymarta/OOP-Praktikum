public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Mery");
        student1.setStudentID(111);
        student1.setMajor("SIB");
        student1.setGpa(4);
    

        Student student2 = new Student();
        student2.setName("Dinata");
        student2.setStudentID(112);
        student2.setMajor("TI");
        student2.setGpa(3.9);

        System.out.println("===Data Mahasiswa==");
        student1.displayInfo();
        student2.displayInfo();
        System.out.println();

        if (student1.getGpa() > student2.getGpa()) {
            System.out.println(student1.getName() + " punya GPA lebih tinggi dari " + student2.getName());
        } else {
            System.out.println(student2.getName() + " punya GPA lebih tinggi dari " + student1.getName());
        }
}
    }

        
    
