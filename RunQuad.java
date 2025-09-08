import java.util.Scanner;

class Quadrilateral {
    public void showDescription() {
        System.out.println(" - is quadrilateral.");
    }
}

class Rectangle extends Quadrilateral {
    public void showDescription() { 
        super.showDescription(); 
        System.out.println(" - has 4 right angles.");
    }
}

class Square extends Rectangle {
    public void showDescription() {
        super.showDescription();
        System.out.println(" - has 4 equal sides.");
    }
}
class Parallelogram extends Quadrilateral{
    public void showDescription(){
        super.showDescription();
        System.out.println("- has 2 pairs of parallel sides.");
    }
}
class Rhombus extends Parallelogram{
    public void showDescription(){
        super.showDescription();
        System.out.println("- has 4 conguent sides.");
    } 
}
class Trapezoid extends Quadrilateral{
    public void showDescription(){
        super.showDescription();
        System.out.println("- has 1 pair of parallel sides.");
    }
}



public class RunQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        while(true){
        System.out.println("Select from the Following: ");
        System.out.println(" R - Rectangle");
        System.out.println(" S - Square");
        System.out.println(" P - Parallelogram ");
        System.out.println(" H - Rhombus");
        System.out.println(" T - Trapeziod");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("R")) {
           
            Rectangle rectangle = new Rectangle();  
            System.out.println("A Rectangle: ");
            rectangle.showDescription(); 
        } 
        else if (choice.equalsIgnoreCase("S")) {
           
            Square square = new Square();  
            System.out.println("A Square: ");
            square.showDescription();  
        } 
        else if (choice.equalsIgnoreCase("P")) {

            Parallelogram parallelogram = new Parallelogram();
            System.out.println("A Paralellogram:");
            parallelogram.showDescription();
        }
        else if (choice.equalsIgnoreCase("H")) {

            Rhombus rhombus = new Rhombus();
            System.out.println("A Rhombus:");
            rhombus.showDescription();
        }
        else if (choice.equalsIgnoreCase("T")) {

            Trapezoid trapeziod = new Trapezoid();
            System.out.println("A Trapeziod:");
            trapeziod.showDescription();
        }
        else {
            System.out.println("INVALID INPUT!");
        }

    }  
    }
}
