public class Person {
    
    // Attributes //
        protected String myName;
        protected int myAge;
        protected String myGender;
    
    // Constructors //
        public Person(String name, int age, String gender) {
            myName = name;
            myAge = age;
            myGender = gender;
        }

    // Setters //

    public void setName(String name){
        myName = name;
    }

    public void setAge(int age){
        myAge = age;
    }

    public void setGender(String gender){
        myGender = gender;
    } 

    // Getters //

    public String getName(){
        return myName;
    }

    public int getAge(){
        return myAge;
    }

    public String getGender(){
        return myGender;
    }

    // toString Method //
    @Override
    public String toString() {
        return "Name: " + myName + ", age: " + myAge + ", gender: " + myGender;
    }
}