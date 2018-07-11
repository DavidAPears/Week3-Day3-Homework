package db;

import models.Lesson;
import models.Student;

public class DBStudent {

    public static void addStudentToLesson(Student student, Lesson lesson) {
        student.addLesson(lesson);
        lesson.addStudent(student);
//        why does updating the student return extra rows in students_lessons table?
        DBHelper.update(lesson);
    }

}
