import db.DBHelper;
import models.*;
import org.hibernate.id.IdentifierGeneratorHelper;

public class Runner {
    public static void main(String[] args) {


        Course geography = new Course("Geography", "BSc");
        DBHelper.save(geography);

        Course history = new Course("History", "BA");
        DBHelper.save(history);

        Student student1 = new Student("David", 40, 136);
        DBHelper.save(student1);

        Student student2 = new Student("Gary", 27, 472);
        DBHelper.save(student2);

        Mentor mentor1 = new Mentor("Mr Brown");
        DBHelper.save(mentor1);

        Mentor mentor2 = new Mentor("Miss Drysdale");
        DBHelper.save(mentor2);

        Lesson soilTheory = new Lesson("Soil Theory", 1);
        DBHelper.save(soilTheory);

        Lesson worldWarTwo = new Lesson("World War Two", 2);
        DBHelper.save(worldWarTwo);

        Instructor instructor1 = new Instructor("Mr Jones");
        DBHelper.save(instructor1);

        Instructor instructor2 = new Instructor("Mr Smith");
        DBHelper.save(instructor2);

    }



    }
