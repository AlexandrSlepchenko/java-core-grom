package lesson8.HW2;

public class Demo {
    Student createHighestParent() {
        Student student = new Student("Alex", "Sl", 9, null);
        return student;
    }

    SpecialStudent createLowestChild() {
        SpecialStudent student = new SpecialStudent("Denis", "LA", 5, null, 911, "some@mail.com");
        return student;
    }
}
