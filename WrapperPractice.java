public class WrapperPractice {
    public static void main(String[] args) {
        // Integer constructor
        // Creates an Integer object using a constructor
        Integer intObj = new Integer(10);

        // intValue method
        // integer to int
        int primitiveInt = intObj.intValue();

        // Double constructor
        // Creates a Double object using a constructor
        Double doubleObj = new Double(3.14);

        // doubleValue method
        // double object to a primitive double
        double primitiveDouble = doubleObj.doubleValue();

        // Maximum value of an integer
        // max possible int value
        int maxInt = Integer.MAX_VALUE;

        // Minimum value of an integer
        // min possible int value
        int minInt = Integer.MIN_VALUE;

        // Autoboxing
        // automatic int to Integer 
        Integer autoBoxedInt = 25;

        // Unboxing
        // automatic integer object to primitive int
        int unboxedInt = autoBoxedInt;

        // printing everything out so you can see that it works 
        System.out.println("Integer object: " + intObj);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Max int: " + maxInt);
        System.out.println("Min int: " + minInt);
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Unboxed int: " + unboxedInt);
    }
}