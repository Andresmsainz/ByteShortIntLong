package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("My Value = " + myValue);
        System.out.println("My Min Value = " + myMinValue);
        System.out.println("My Max Value = " + myMaxValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Min Byte Value = " + myMinByteValue);
        System.out.println("My Max Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Min Short Value = " + myMinShortValue);
        System.out.println("My Max Short Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Long Value = " + myLongValue);
        System.out.println("My Min Long Value = " + myMinLongValue);
        System.out.println("My Max Long Value = " + myMaxLongValue);
    }
}
