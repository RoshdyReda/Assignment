
package assignment333;


public class Assignment333 {

   
    public static void main(String[] args) 
    {
      Mammal m = new Mammal(4, "leaves");
        m.eat();
        m.travel();
        
        System.out.println("Number of legs: " + m.NoOfLegs());
        System.out.println("Favorite food: " + m.FavFood());
    }
    
}
