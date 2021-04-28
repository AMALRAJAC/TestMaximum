import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumValueTest {
    Integer[] intArray={10,30,20};

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
}
