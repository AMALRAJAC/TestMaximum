public class MaximumValue{
    static <T extends Comparable<? super T>> T maximumValue(T[] values) {

        T max = values[0];
        for (T element:values) {
            if (max.compareTo(element) < 0) max = element;
        }
        return max;
    }
}