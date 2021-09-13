/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam_solomon_home
 */
public class Course {
    //here I am setting these member variables to private so that they are only visible to the Course class
    // and also to make sure that they can not be directly accessed outside the class
    private int ID;
    private String Name;
    private String Code;

    //if the variables need to be accessed or changed outside of the class
    // I have created these getter and setter methods for each variable

    //These are my Getter methods which will allow me to access the data/values stored in each of my member variables
    public int getID(){
        return ID;
    }

   public String getName(){
        return Name;
    }

    public String getCode(){
        return Code;
    }

    //these are my Setter methods which will allow me to change the data/values stored in each of the member variables
    public void setID(int id)
    {
        this.ID=id;

    }
     public void setName(String name){
        this.Name=name;

    }
    public void setCode(String code){
        this.Code=code;

    }





    //this is the default constructor which is used when an object is created from this class without any parameters
    public Course()
    {}//these Brackets are empty because I am not setting anything within my default constructor

    //here I am overloading the default constructor by giving it three parameters so that I can create my object with
    //values already set for each of these variables so that I can update them
    public Course(int User_ID,String User_Name,String User_Course_Code){
        this.ID=User_ID;
        this.Name=User_Name;
        this.Code=User_Course_Code;

    }

}

class Main_class{

    public static void main(String[] args) {

        Course Obj1=new Course();
        Obj1.setID(9876);
        Obj1.setName("Thomas");
        Obj1.setCode("CSC229");
        /*
        here I decided to instantiate the Course object using the default constructor,
        so I used the setter methods to the set data for each of the variables in my Course object
        however if did not want to have to use the setter methods to set the data for each of the variables in my object
        I would use the overloaded constructor and create my Course object with the data already set for each of variables
        like this
        Course Obj1=new Course(5768,"John","BCS230");
        */


    }

}
