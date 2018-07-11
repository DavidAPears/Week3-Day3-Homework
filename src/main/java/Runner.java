import db.DBCourse;
import db.DBHelper;
import db.DBStudent;
import models.*;
import org.hibernate.id.IdentifierGeneratorHelper;

import java.util.List;

public class Runner {
    public static void main(String[] args) {


        Course geography = new Course("Geography", "BSc");
        DBHelper.save(geography);

        Course history = new Course("History", "BA");
        DBHelper.save(history);

        Student student1 = new Student("David", 40, 136, geography);
        DBHelper.save(student1);

        Student student2 = new Student("Gary", 27, 472, history);
        DBHelper.save(student2);

        Mentor mentor1 = new Mentor("Mr Brown", student1);
        DBHelper.save(mentor1);

        Mentor mentor2 = new Mentor("Miss Drysdale", student2);
        DBHelper.save(mentor2);

        Instructor instructor1 = new Instructor("Mr Jones");
        DBHelper.save(instructor1);

        Instructor instructor2 = new Instructor("Mr Smith");
        DBHelper.save(instructor2);

        Lesson soilTheory = new Lesson("Soil Theory", 1, geography, instructor1);
        DBHelper.save(soilTheory);

        Lesson worldWarTwo = new Lesson("World War Two", 2, history, instructor2);
        DBHelper.save(worldWarTwo);

        Lesson careerAdvice = new Lesson("Career Advice", 3, history, instructor1);
        DBHelper.save(careerAdvice);


        List<Student> studentList = DBCourse.getStudentForCourse(geography);

        List<Lesson> lessonList = DBCourse.getLessonsForCourse(geography);

        DBStudent.addStudentToLesson(student1, worldWarTwo);
        DBStudent.addStudentToLesson(student1, careerAdvice);

    }



    }
