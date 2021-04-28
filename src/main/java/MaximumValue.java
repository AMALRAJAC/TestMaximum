
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

}
