package Lesson10Inheritance;
                                        // 5) create the class
    public class Teacher  extends Person{
    //    private String name;
    //    private String lastName;
    //    private int year;                 /////эти поля не нужны потому что я буду пользоваться их в персоне
    private Subject subject;
                                        // 6) create a constructor
    public Teacher(String name, String lastName, int year, Subject subject) {
    //        this.name = name;
    //        this.lastName = lastName;
    //        this.year = year;           /////эти поля не нужны потому что я буду пользоваться их в персоне
        super(name,lastName,year);  ///я вызову конструктор родительского класса
        this.subject = subject;
    }
                                        // 7) create a bunch of getters and setters
    //    public String getName() {                  ///ненужны
    //        return name;
    //    }
    //
    //    public void setName(String name) {
    //        this.name = name;
    //    }
    //    public String getLastName() {
    //        return lastName;
    //    }
    //
    //    public void setLastName(String lastName) {
    //        this.lastName = lastName;
    //    }
    //
    //    public int getYear() {
    //        return year;
    //    }
    //
    //    public void setYear(int year) {
    //        this.year = year;
    //    }
    //
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}