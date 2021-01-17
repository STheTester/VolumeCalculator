package Test;

import com.company.Sphere;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {
    @Test
    void WhenSphereInitialised_WithRadiusZero_CorrectVolumeIsReturned() {
        //Arrange
        Sphere s1 = new Sphere(0);
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertEquals("0.00",result);
    }

    @Test
    void WhenSphereInitialised_WithRadiusOne_CorrectVolumeIsReturned() {
        //Arrange
        Sphere s1 = new Sphere(1);
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertEquals("4.19",result);
    }

    @Test
    void WhenSphereInitialised_WithRadiusFive_CorrectVolumeIsReturned() {
        //Arrange
        Sphere s1 = new Sphere(5);
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertEquals("523.60",result);
    }

    @Test
    void WhenSphereInitialised_WithRadiusSix_CorrectVolumeIsReturned() {
        //Arrange
        Sphere s1 = new Sphere(6);
        //Act
        String result = s1.getVolume();
        //Assert
        Assertions.assertEquals("904.78",result);
    }

}