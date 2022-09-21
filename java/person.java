public class person {

    private String name; 
    private int age;
   int modelYear;
    String modelName;

    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
// constructor
    public void constructor (int year, String name) {
        modelYear = year;
        modelName = name;
      }
    


    }
