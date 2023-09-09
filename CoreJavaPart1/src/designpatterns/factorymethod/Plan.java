package designpatterns.factorymethod;

public abstract class Plan {
    double rate;
   abstract void getRate();
   void calculateBill(int units) {
	   System.out.println(units*rate);
   }
    
}
