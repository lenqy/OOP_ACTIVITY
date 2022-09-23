public class Main implements Friends{
    public static void main(String[] args) {
        Main m = new Main();
    
        System.out.println("Hello World");

        System.out.println("");

        // Accessing the functions inside the super class using the  sub class
        Teacher t = new Teacher();
        t.occupation();
        t.address();
        


        //setting different values of the constructors
        Teacher T = new Teacher("Victor Chiong");
        Teacher y = new Teacher(3);
        t.setAge(20);
        System.out.println();

        System.out.println("The name of the teacher is " + T.name);
        System.out.println("He works for almost " + y.year);
        System.out.println("He's age is around " + t.getAge());
        

        System.out.println("");
        //displaying the implemented method from the interface class
        m.FriendName();
        m.FriendAddress();
            
  
    }

    
    //implenting the abstract methods from the interface Friends.java
   

    public void FriendName(){
        System.out.println("One of my friend is Seth Obenita");
    }

    public void FriendAddress(){
        System.out.println("She lives in Malabuyoc Cebu");

    }

    
}