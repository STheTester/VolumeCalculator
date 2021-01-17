package Test;

import com.company.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void WhenInitialised_WithParameter_GetLengthReturnsCorrectLength() {
        //Arrange
        Shape s1 = new Shape(1);
        //Act
        float result = s1.getLength();
        //Assert
        Assertions.assertEquals(1,result);
    }
    @Test
    void WhenInitialised_WithoutParameter_GetLengthReturnsDefaultLength() {
        //Arrange
        Shape s1 = new Shape();
        //Act
        float result = s1.getLength();
        //Assert
        Assertions.assertEquals(0,result);
    }

    @Test
    void AfterInitialised_WithParameter_SetVolumeCanBeCalled() {
        //Arrange
        Shape s1 = new Shape(5f);
        s1.setVolume();
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertEquals("5.00",result);
    }

    @Test
    void AfterInitialised_GetVolume_IsNotReturnedAsOneSignificantDigit() {
        //Arrange
        Shape s1 = new Shape(5.1f);
        s1.setVolume();
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertNotEquals("5.1",result);
    }

    @Test
    void AfterInitialised_GetVolume_IsNotReturnedAsThreeSignificantDigits() {
        //Arrange
        Shape s1 = new Shape(5.123f);
        s1.setVolume();
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertNotEquals("5.123",result);
    }

    @Test
    void AfterInitialised_GetVolume_IsReturnedAsTwoSignificantDigits() {
        //Arrange
        Shape s1 = new Shape(5.123f);
        s1.setVolume();
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertEquals("5.12",result);
    }
}