import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumValueTest {
    Integer[] intArray={10,30,20};
    Double [] doubleArray={10.25,35.50,35.75};

    @Test
    public void maximumValueWillReturnFirstPosition(){
       int firstPosition=MaximumValue.maximumValue(intArray);
        Assertions.assertEquals(10,firstPosition);
    }
    @Test
    public void maximumValueWillReturnSecondPosition(){
        int SecondPosition=MaximumValue.maximumValue(intArray);
        Assertions.assertEquals(30,SecondPosition);
    }
    @Test
    public void maximumValueWillReturnThirdPosition(){
        int ThirdPosition=MaximumValue.maximumValue(intArray);
        Assertions.assertEquals(20,ThirdPosition);
    }
    @Test
    public void maximumValueWillReturnFirstDoublePosition(){
        double firstPosition=MaximumValue.maximumValue(doubleArray);
        Assertions.assertEquals(10.25,firstPosition);
    }
    @Test
    public void maximumValueWillReturnSecondDoublePosition(){
        double SecondPosition=MaximumValue.maximumValue(doubleArray);
        Assertions.assertEquals(30.50,SecondPosition);
    }
    @Test
    public void maximumValueWillReturnThirdDoublePosition() {
        double ThirdPosition = MaximumValue.maximumValue(doubleArray);
        Assertions.assertEquals(35.75,ThirdPosition);
    }

}