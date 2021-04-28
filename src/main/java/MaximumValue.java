
public class MaximumValue {

    public static int maximumValue(Integer[] inputArray) {
        Integer fist= Integer.valueOf(inputArray[0]);
        Integer second= Integer.valueOf(inputArray[1]);
        Integer third= Integer.valueOf(inputArray[2]);
       if(fist.compareTo(second)>0&&fist.compareTo(third)>0){
           return fist;
       }
       else if(second.compareTo(third)>0&&second.compareTo(fist)>0){
           return second;
       }else{
           return third;
       }
    }
    public static double maximumValue(Double[] inputArray) {
        Double fist= Double.valueOf(inputArray[0]);
        Double second= Double.valueOf(inputArray[1]);
        Double third= Double.valueOf(inputArray[2]);
        if(fist.compareTo(second)>0&&fist.compareTo(third)>0){
            return fist;
        }
        else if(second.compareTo(third)>0&&second.compareTo(fist)>0){
            return second;
        }else{
            return third;
        }
    }
    public static String maximumValue(String[] inputArray) {
        String fist= String.valueOf(inputArray[0]);
        String second= String.valueOf(inputArray[1]);
        String third= String.valueOf(inputArray[2]);
        if(fist.compareTo(second)>0&&fist.compareTo(third)>0){
            return fist;
        }
        else if(second.compareTo(third)>0&&second.compareTo(fist)>0){
            return second;
        }else{
            return third;
        }
    }

}
