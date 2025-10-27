

public class studentStruktural {
    public static void main(String[] args) {
        String name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;
        int studentID1, studentID2, studentID3, studentID4, studentID5, studentID6, studentID7, studentID8, studentID9, studentID10;
        String major1, major2, major3, major4, major5, major6, major7, major8, major9, major10;
        
        name1 = "Mery";
        studentID1 = 111;
        major1 = "SIB";

        name2 = "Oktavia";
        studentID2 = 112;
        major2 = "TI";
        
        name3 ="Diana";
        studentID3 = 113;
        major3 = "TI";

        name4 = "Rizky";
        studentID4 = 114;
        major4 = "TI";

        name5 = "Nisa";
        studentID5 = 115;
        major5 = "TK";

        name6 = "Rani";
        studentID6 = 116;
        major6 = "SIB";

        name7 = "Dewi";
        studentID7 = 117;
        major7 = "SIB";

        name8 = "Putri";
        studentID8 = 118;
        major8 = "AKT";

        name9 = "Alya";
        studentID9 = 119;
        major9 = "AKT";

        name10 = "Raihan";
        studentID10 = 120;
        major10 = "TI";

        
        System.out.println("Name: " + name1);
        System.out.println("Student ID: " + studentID1);
        System.out.println("Major: " + major1);
        enrollCourse(name1);
        viewGrades(name1);
        System.out.println();


        System.out.println("Name: " + name2);
        System.out.println("Student ID: " + studentID2);
        System.out.println("Major: " + major2);
        enrollCourse(name2);
        viewGrades(name2);
        System.out.println();


        System.out.println("Name: " + name3);
        System.out.println("Student ID: " + studentID3);
        System.out.println("Major: " + major3);
        enrollCourse(name3);
        viewGrades(name3);
        System.out.println();


        System.out.println("Name: " + name4);
        System.out.println("Student ID: " + studentID4);
        System.out.println("Major: " + major4);
        enrollCourse(name4);
        viewGrades(name4);
        System.out.println();


        System.out.println("Name: " + name5);
        System.out.println("Student ID: " + studentID5);
        System.out.println("Major: " + major5);
        enrollCourse(name5);
        viewGrades(name5);
        System.out.println();


        System.out.println("Name: " + name6);
        System.out.println("Student ID: " + studentID6);
        System.out.println("Major: " + major6);
        enrollCourse(name6);
        viewGrades(name6);
        System.out.println();


        System.out.println("Name: " + name7);
        System.out.println("Student ID: " + studentID7);
        System.out.println("Major: " + major7);
        enrollCourse(name7);
        viewGrades(name7);
        System.out.println();


        System.out.println("Name: " + name8);
        System.out.println("Student ID: " + studentID8);
        System.out.println("Major: " + major8);
        enrollCourse(name8);
        viewGrades(name8);
        System.out.println();


        System.out.println("Name: " + name9);
        System.out.println("Student ID: " + studentID9);
        System.out.println("Major: " + major9);
        enrollCourse(name9);
        viewGrades(name9);
        System.out.println();


        System.out.println("Name: " + name10);
        System.out.println("Student ID: " + studentID10);
        System.out.println("Major: " + major10);
        enrollCourse(name10);
        viewGrades(name10);
        System.out.println();


    }

    public static void enrollCourse(String name){
        System.out.println(name + " enrolling in course");
}
    
    public static void viewGrades(String name){
        System.out.println(name + " is viewing grades..");
    }
   
    }


    
