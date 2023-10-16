//Run 1 constructor file at a time and comment rest 
class Test{
// default constructor 
   int  i ;
   String str;
    public static void main(String[] args) {
        Test c1 = new Test();
        System.out.println(c1.i);    //here we can see as we have not created a constructor so default constructor isd created asd a default valur of i is given that is 0
        System.out.println(c1.str);    //here we can see as we have not created a constructor so default constructor isd created asd a default valur of str is given that is null
    }

public Test(){      // this is user defined constructor 
    System.out.println("Hello There");
}
public static void main(String[] args) {
    Test t = new Test();        //here we are calling the user defined constructor to execute

// parametarized constructor
int roll;
String Name ;

public Test(int roll , String Name ){      // this is user defined constructor 
   this.roll = roll;
   this.Name = Name ; 
}
public static void main(String[] args) {
    Test t = new Test(45,"RAJ"); 
    Test t2 = new Test(64, "Ajay");      
    System.out.println(t.Name +" "+ t.roll);
    System.out.println(t2.Name +" "+ t2.roll);
}
}
