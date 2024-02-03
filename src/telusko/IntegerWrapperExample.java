package telusko;

public class IntegerWrapperExample {
    public static void main(String[] args) {

        int num = 42;
        Integer wrappedInt = new Integer(num);

        int unwrappedInt = wrappedInt.intValue();

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped int: " + unwrappedInt);

        // Wrapping Unwrapping: Using valueOf() method (preferred way since Java 9)
        int anotherNum = 100;
        Integer anotherWrappedInt = Integer.valueOf(anotherNum);

        // Unwrapping: Using unboxing (automatically unwrapped)
        int anotherUnwrappedInt = anotherWrappedInt;

        System.out.println("Another Wrapped Integer: " + anotherWrappedInt);
        System.out.println("Another Unwrapped int: " + anotherUnwrappedInt);
    }
}
