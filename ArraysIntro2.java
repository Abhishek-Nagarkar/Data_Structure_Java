package Data_Structures_Java;

public class ArraysIntro2 {
    public static void main(String[] args) {
        // non-primitive data type array
        Person[] personList = new Person[3];
        // Q. What would be output of for loop on above array
        // for(int i=0; i<personList.length; i++){
        //     System.out.println(personList[i]);
        // }

        // ANS: NULL since 3 Person REFERENCES are created but objects are not yet allocated on heap
        // Q. How would you create 3 Person objects in Person[0] [1] & [2]

        // for(int i=0; i<personList.length; i++){
        //     personList[i] = new Person(i+10, i+" Unknown", Gender.MALE);
        // }
        // for(int i=0; i<personList.length; i++){
        //     System.out.println(personList[i]);
        // }

        // Q. Create another class Employee with fields
        //- empId : int
        //- role : ENUM -> Engineer, Manager, Tester, HR
        //- salary : float
        //- asset : Laptop type ( Create class Laptop ; fields mentioned below) (Such type of relation between Employee and asset is called Compositon or Has-A relationship)
        // create default/param constructor
        // create getters/accessors and setters/mutators
        // override toStirng() method first using auto code generation then manually
        // Employee class should inherit from Person class
        // Laptop class with fields
        //- assetId : int
        //- companyName : String
        //- Ram : ENUM -> 4, 8, 16
        //- MemoryType : ENUM -> SSD, HDD
        // create default/param constructor
        // create getters/accessors and setters/mutators
        // override toStirng() method first using auto code generation then manually
        // Create an array of Employee 
        // Initialize the employee array like shown in above example
        // Also use .clone() method of Array class
        // And learn about Deep Copy and Shallow Copy

    }
}

class Person {
    public int age;
    public String name;
    public Gender gender;

    Person(){
        age = 18;
        name = "Unknown";
        gender = Gender.MALE; // Main advantage of enum is only selected values can be entered
    }

    Person(int age, String name, Gender gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
    }    

    
}
