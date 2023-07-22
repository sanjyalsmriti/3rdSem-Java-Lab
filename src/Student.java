
public class Student {
      private String name;
    private int age; // only for this class cant be extended

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
     public static void main(String[] args) {
        StudentInfo student = new StudentInfo("Smiriti Sanjyal(Jaishi)", 19, "A");
        System.out.println(student.toString());
    }
}

class StudentInfo extends Student {
    private String grade;
    
    public StudentInfo(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    
    public String getGrade() {
        return grade;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nGrade: " + getGrade();
    }
}



