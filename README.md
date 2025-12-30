# Course-Enrollment-System
📘 Course Enrollment System (Console-Based Java Application)
📌 Overview

The Course Enrollment System is a menu-driven, console-based Java application that allows users to manage courses and student enrollments.
This project is designed to strengthen Java fundamentals, OOP concepts, and collection handling using real-world–style logic.

🎯 Features

  ➕ Add new courses
  
  👨‍🎓 Enroll students into a course
  
  ⏱️ Update course duration
  
  📋 Display all available courses
  
  ⭐ Find the most enrolled course
  
  ❌ Exit the application safely

🛠️ Technologies Used

  Java
  
  OOP Concepts
  
  ArrayList
  
  Scanner (for user input)

🧱 Project Structure
  CourseEnrollment.java
  │
  ├── Course (Model Class)
  │   ├── courseId
  │   ├── courseName
  │   ├── enrolledStudents
  │   └── courseDuration
  │
  └── CourseEnrollment (Main Class)
      ├── Menu-driven logic
      ├── Course management methods
      └── Student enrollment operations

📂 Classes Explanation
  🔹 Course Class
  
  Represents a course entity with:
  
    Course ID
    
    Course name
    
    Number of enrolled students
    
    Course duration (in weeks)

🔹 CourseEnrollment Class

    Acts as the controller of the application:
    
    Displays menu
    
    Handles user choices
    
    Manages course list using ArrayList


🧪 Sample Operations

    Add multiple courses
    
    Enroll students into an existing course
    
    Update course duration
    
    View all courses
    
    Identify the most popular course

💡 Concepts Practiced

    Object-Oriented Programming (Classes & Objects)
    
    Menu-driven program design
    
    Collections (ArrayList)
    
    Conditional logic & loops
    
    Input handling using Scanner

🚀 Future Enhancements

    Prevent duplicate course IDs
    
    Add input validation
    
    Store data using files or a database
    
    Implement search by course name
