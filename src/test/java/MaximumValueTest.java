import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumValueTest {

    @Test
    public void maximumValueWillReturnFirstPosition(){
        int firstPosition=MaximumValue.maximumValue(10,20,30);
        Assertions.assertEquals(10,firstPosition);
    }
    @Test
    public void maximumValueWillReturnSecondPosition(){
        int SecondPosition=MaximumValue.maximumValue(10,20,30);
        Assertions.assertEquals(30,SecondPosition);
    }
    @Test
    public void maximumValueWillReturnThirdPosition(){
        int ThirdPosition=MaximumValue.maximumValue(10,20,30);
        Assertions.assertEquals(20,ThirdPosition);
    }
    @Test
    public void maximumValueWillReturnFirstDoublePosition(){
        double firstPosition=MaximumValue.maximumValue(10.25,35.50,35.75);
        Assertions.assertEquals(10.25,firstPosition);
    }
    @Test
    public void maximumValueWillReturnSecondDoublePosition(){
        double SecondPosition=MaximumValue.maximumValue(10.25,35.50,35.75);
        Assertions.assertEquals(30.50,SecondPosition);
    }
    @Test
    public void maximumValueWillReturnThirdDoublePosition() {
        double ThirdPosition = MaximumValue.maximumValue(10.25,35.50,35.75);
        Assertions.assertEquals(35.75,ThirdPosition);
    }
    @Test
    public void maximumValueWillReturnFirstStringPosition(){
        String firstPosition=MaximumValue.maximumValue("pear","apple","orange");
        Assertions.assertEquals("pear",firstPosition);
    }
    @Test
    public void maximumValueWillReturnSecondStringPosition(){
        String SecondPosition=MaximumValue.maximumValue("pear","apple","orange");
        Assertions.assertEquals("apple",SecondPosition);
    }
    @Test
    public void maximumValueWillReturnThirdStringPosition(){
        String ThirdPosition = MaximumValue.maximumValue("pear","apple","orange");
        Assertions.assertEquals("orange",ThirdPosition);
    }
}