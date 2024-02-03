package telusko;

public class Abc implements Cloneable {
    int a;
    int b;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        Abc c1 = new Abc();
        c1.a = 9;
        c1.b = 7;

        Abc c2 = c1; // Shallow copy 

        Abc c3 = new Abc(); 
        c3.a = c1.a;
        c3.b = c1.b;

        Abc c4 = null; // Declaration for c4
        try {
            c4 = (Abc) c1.clone(); // Cloning c1 to c4
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(); // Handle the CloneNotSupportedException
        }
        
        System.out.println(c4.a+" "+c4.b);
        
    }
}
