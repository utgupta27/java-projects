package self;


abstract class Bike{  
    // Bike(){
    //     System.out.println("bike is created");
    // }  

    abstract void run();  

    void changeGear(){
        System.out.println("gear changed");
    }  
  }  
  
class Honda extends Bike{  
    Honda(){
        System.out.println("Honda Comstructor");
    }
    void run(){
      System.out.println("running safely..");
    }  
}
  
  
class TestAbstraction2{  
  public static void main(String args[]){  
   Bike obj = new Honda();  
   obj.run();  
   obj.changeGear();  
  }  
 }