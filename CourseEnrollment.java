import java.util.ArrayList;
import java.util.Scanner;

class Course{
    int courseId;
    String courseName;
    int enrolledStudents;
    int courseDuration;
    
    Course(int courseId, String courseName, int enrolledStudents, int duration){
        this.courseId= courseId;
        this.courseName= courseName;
        this.enrolledStudents= enrolledStudents;
        this.courseDuration= duration;
    }
}

public class CourseEnrollement{
    
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Course> courses= new ArrayList<>();
    
    public static void main(String args[]){
        while(true){
            System.out.println("\n--- COURSE ENROLLMENT SYSTEM---");
            System.out.println("1. Add Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Update Course Duration");
            System.out.println("4. Display All Courses");
            System.out.println("5. Find Most Enrolled Course");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            int choice= sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1: addCourse(); break;
                case 2: enrollStudent(); break;
                case 3: updateCourseDuration(); break;
                case 4: displayAllCourses(); break;
                case 5: findMostEnrolledCourse(); break;
                case 6: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }
    static void addCourse(){
        System.out.print("Enter CourseId: ");
        int courseId= sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Course Name: ");
        String courseName= sc.nextLine();
        
        System.out.print("Enter total number of Students enrolled: ");
        int enrolledStudents= sc.nextInt();
        
        System.out.print("Enter Course Duration: ");
        int courseDuration= sc.nextInt();
        
        courses.add(new Course(courseId, courseName, enrolledStudents, courseDuration));
        System.out.println("Course added successfully!");
    }
    
    static void enrollStudent(){
        System.out.print("Enter CourseID: ");
        int courseId= sc.nextInt();
        
        for(Course c: courses){
            if(c.courseId== courseId){
                System.out.print("Enter number of students to add: ");
                int count= sc.nextInt();
                c.enrolledStudents += count;
                System.out.println("Students enrolled successfully!");
                return;
            }
        }
        System.out.println("Invalid CourseId");
    }
    
     static void updateCourseDuration() {
        System.out.print("Enter Course ID: ");
        int courseID = sc.nextInt();
    
        for (Course c : courses) {
            if (c.courseId == courseID) {
                System.out.print("Enter new duration: ");
                c.courseDuration = sc.nextInt();
                System.out.println("Duration updated!");
                return;
            }
        }
        System.out.println("Course not found!");
    }
    
    static void displayAllCourses() {
        for (Course c : courses) {
            System.out.println("\nID: " + c.courseId);
            System.out.println("Name: " + c.courseName);
            System.out.println("Duration: " + c.courseDuration + " weeks");
            System.out.println("Enrolled: " + c.enrolledStudents);
        }
    }
    
    static void findMostEnrolledCourse(){
        if(courses.isEmpty()){
            System.out.println("No course available.");
            return;
        }
        
        Course max= courses.get(0);
        for(Course c: courses){
            if(c.enrolledStudents> max.enrolledStudents){
                max=c;
            }
        }
        
        System.out.println("\nMost Enrolled Cours: ");
        System.out.println(max.courseName+ " ("+max.enrolledStudents+ " students)");
    }
}
