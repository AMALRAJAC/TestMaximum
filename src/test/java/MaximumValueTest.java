import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumValueTest {
    Integer[] intArray={10,30,20,15};
    Double [] doubleArray={10.25,35.50,35.75,1.1};
    String [] stringArray={"pear","apple","orange","peach"};
    @Test
    public void maximumValueWillReturnFirstPosition(){
        int firstPosition=MaximumValue.maximumValue(intArray);
        Assertions.assertEquals(30,firstPosition);
    }

    @Test
    public void maximumValueWillReturnFirstDoublePosition(){
        double firstPosition=MaximumValue.maximumValue(doubleArray);
        Assertions.assertEquals(35.75,firstPosition);
    }

    @Test
    public void maximumValueWillReturnFirstStringPosition(){
        String firstPosition=MaximumValue.maximumValue(stringArray);
        Assertions.assertEquals("pear",firstPosition);
    }

}