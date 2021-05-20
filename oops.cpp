#include<bits/stdc++.h>
using namespace std;

//the oops.java is written in c++ here
//refer oops.java for clear explantaion

class home{
    //private variables
    string owner;
    int people;
    public:
    static final int safetylimits=10000;
    home(){
        cout<<"Blue print for the class has been obtained"<<endl;
    }
    virtual void requirements(){
        cout<<"User will enter the requirments";
    }
    virtual void bedroom()=0;
    virtual void bathroom()=0;
    virtual void carparking()=0;
}

//in c++ we donot have interfaces so we have to implement using abstract class 
class workers{
    public:
    int noofworkers=100;
    virtual void assigncontract()=0;
}

class sridhar :  virtual public home,virtual public workers{
private:
string owner;
int people;
sridhar(){
    super();
    cout<<"sridhars house construction has been started"<<endl;
}
sridhar(string name,int people){
    cout<<"use getter and setter function donot pass parameters like this for security purposes";
}
sridhar(cost sridhar &s){
    owner=s.owner;
    people=s.people;
}
void requirements(){
    cout<<"My house should have two bedrooms and a big bathrooms attached to them along with carparking for a bigsize car"<<endl;
}
int mincost(int base) {
    retrun  base+10000;
}
int mincost(int base,int gst){
    retrun base+10000+gst*0.18;
}
void sethomedetails(String name,int people){
owner=name;
people=people;
}
void gethomedetails(){
    cout<<owner<<endl;
    cout<<people<<endl;
}
void assigncontract(){
cout<<"the contract is assigned to gajendra infrastructure and they provide 100 workers"<<endl;
}
void bedroom(){
    cout<<"two bedrooms are created"<<endl;
}
void bathroom(){
    cout<<"two bathrooms are created attached to the bedrooms"<<endl;
}
void carparking(){
    cout<<"car parking for large size car is created"<<endl;
}
~sridhar(){
    cout<<"Thank you sridhar.Your house is now ready"<<endl;
}
}