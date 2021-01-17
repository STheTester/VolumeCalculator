package Test;
import com.company.Tetrahedron;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TetrahedronTest {

    @Test
    void WhenTetrahedronInitialised_WithEdgeZero_CorrectVolumeIsReturned() {
        //Arrange
        Tetrahedron t1 = new Tetrahedron(0);
        //Act
        String result = t1.getVolume();
        //Assert
        Assertions.assertEquals("0.00",result);
    }

    @Test
    void WhenTetrahedronInitialised_WithEdgeOne_CorrectVolumeIsReturned() {
        //Arrange
        Tetrahedron t1 = new Tetrahedron(1);
        //Act
        String result = t1.getVolume();
        //Assert
        Assertions.assertEquals("0.12",result);
    }

    @Test
    void WhenTetrahedronInitialised_WithEdgeFive_CorrectVolumeIsReturned() {
        //Arrange
        Tetrahedron t1 = new Tetrahedron(5);
        //Act
        String result = t1.getVolume();
        //Assert
        Assertions.assertEquals("14.73",result);
    }

    @Test
    void WhenTetrahedronInitialised_WithEdgeSix_CorrectVolumeIsReturned() {
        //Arrange
        Tetrahedron t1 = new Tetrahedron(6);
        //Act
        String result = t1.getVolume();
        //Assert
        Assertions.assertEquals("25.46",result);
    }

}