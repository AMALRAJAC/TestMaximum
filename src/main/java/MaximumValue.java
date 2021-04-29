public class MaximumValue{
    static <T extends Comparable<? super T>> T maximumValue(T[] values) {

        T max = values[0];//set maximum
        for (T element:values) {
            //compare element to get maximum
            if (max.compareTo(element) < 0) max = element;
        }
        printMax(max);
        //return maximum
        return max;
    }
    public static <T> void printMax( T max ){
        System.out.println("maximum value is = "+max);
    }
}