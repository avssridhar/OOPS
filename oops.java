import java.util.*;

//creating an abstract class home for using it as blueprint-abstrction
abstract class home{
    //making the owner and the no of people private-encapsulation
    private string owner;
    private int people;
    //creating a safety limit that should not be less than 100000 this is both static and final and should
    //not be changed
    static final int safetylimit=10000;
    //creating a constructor for the class
    home(){
        System.out.prinln("Blue print for the house has been obtained");
    }
    //creating a requirements method
    void requirements(){
        System.out.println("User will enter the requirements according to the no of people etc");
    }
    
    //creating three abstract methods which need to be implemented by the builder
    abstract void bedroom();
    abstract void bathroom();
    abstract void carparking(); 
}

//writing an interface to decide the worker contracts
interface workers{
    //the variables are bydefault static and final
    int noofworkers=100;
    //this method is abstract by default and the contract should be assigned in the class implementing the
    //interface
    void assignconstract();
}
//buidling the actual house using the home class as  blueprint and implemeting interface 
class sridhar implements workers extends home{ 
//let us make the house owner and the people private for security purpose
private string owner;
private int people; 
//defining constrcutor to the class also calling the cosntructor of the house class using super
sridhar(){
    super();//calling the super class constructor using super keyword
    System.out.println("Sridhars house cosntruction has been started");
}
//creating a paramterized constructor
sridhar(string name,int people){
    System.out.println("use getter and setter methods to assign names and donot pass the names as parameters for security purposes");
}
//creating a copy constructor
sridhar(Sridhar s){
    this.owner=s.owner;
    this.people=s.people;
}
//overriding the method requirements 
void requirements(){
    System.out.println("My house should have two bedrooms and bathrooms attached them with a carparking for my car");
}
//deciding cost based on various parametes-Overloading
int mincost(int base) {
    retrun  base+10000;
}
//overloading the mincost class and deciding the cost if GST is applicable
int mincost(int base,int gst){
    retrun base+10000+gst*0.18;
}
//getting and setting owners name and no of people-encapsulation
void sethomedetails(String name,int people){
this.owner=name;
this.people=people;
}
void gethomedetails(){
    cout<<this.owner<<endl;
    cout<<this.people<<endl;
}
//implementing the abstract method in interface
void assigncontract(){
    System.out.println("The contract is assigned to Gajendra infrasturcture and 100 workers will be working on th");
}
//implementing all the abstract methods in the abstract class
void bedroom(){
    System.out.println("Two bedroom are created");
}
void bathroom(){
    System.out.println("Two bathroom are created which are attached to the two bedrooms");
}
void carparking(){
    System.out.println("Car parking for large size car is created");
}
//defining destructor to the class
~sridhar(){
    System.out.println("Thank you sridhar.Your house is now ready");
}
}
