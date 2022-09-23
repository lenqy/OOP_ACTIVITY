public class Teacher extends Person {
    String name;
    String PersonAddress;
    private int age;
    int year;

    // making constructor
    public Teacher(){
        System.out.println("This is for the teacher constructor");
    }
    public Teacher(int year){
        this.year = year;
    }
    public Teacher(String name){
        this.name = name;
    }


    // Encapsulate Teachers age
    public void setAge(int TeacherAge){
       age = TeacherAge;
    }
    public int getAge(){
        return age;
    }
    
    // overide the address method in the superclass
    public void address(){
        System.out.println("He lives in Talamban");
    }

  
    
    
   
}
