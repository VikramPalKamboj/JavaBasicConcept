package abstractAndInterface;

interface Showable{  
void show();  
}  

//Multiple inheritance in Java by interface {marker or tagged interface}
//An interface that have no member is known as marker or tagged interface. 
//For example: Serializable, Cloneable, Remote etc. 
//They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
//An interface can have another interface i.e. known as nested interface.

class InterfaceTesting implements Testing,Showable{  
public void print(){
	System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
InterfaceTesting obj = new InterfaceTesting();  
obj.print();  
obj.show();  
 }  
}  
