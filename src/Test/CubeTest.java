package Test;

import com.company.Cube;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CubeTest {

    @Test
    void WhenCubeInitialised_WithWidthZero_CorrectVolumeIsReturned() {
        //Arrange
        Cube c1 = new Cube(0);
        //Act
        String result = c1.getVolume();
        //Assert
        Assertions.assertEquals("0.00",result);
    }

    @Test
    void WhenCubeInitialised_WithWidthOne_CorrectVolumeIsReturned() {
        //Arrange
        Cube c1 = new Cube(1);
        //Act
        String result = c1.getVolume();
        //Assert
        Assertions.assertEquals("1.00",result);
    }

    @Test
    void WhenCubeInitialised_WithWidthFive_CorrectVolumeIsReturned() {
        //Arrange
        Cube c1 = new Cube(5);
        //Act
        String result = c1.getVolume();
        //Assert
        Assertions.assertEquals("125.00",result);
    }

    @Test
    void WhenCubeInitialised_WithWidthSix_CorrectVolumeIsReturned() {
        //Arrange
        Cube c1 = new Cube(6);
        //Act
        String result = c1.getVolume();
        //Assert
        Assertions.assertEquals("216.00",result);
    }

}