import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTest {
    private int[] arr;

    /*@Before
    public void setUp(){
    int[] arr={1,2,3,4,5,6,7,9,11};
    }*/

    @Test

    public void binarySearchShouldReturnNumberOfElementTestInFirstHalfOfArray(){
        assertEquals(BinarySearch.binarySearch(3),2);
        assertEquals(BinarySearch.binarySearch(1),0);
    }

    @Test

    public void binarySearchShouldReturnNumberOfElementTestInSecondHalfOfArray(){
        assertEquals(BinarySearch.binarySearch(7),6);
        assertEquals(BinarySearch.binarySearch(11),8);
    }

    @Test

    public void binarySearchShouldReturnNumberOfElementTestForMiddleElementOfArray(){
        assertEquals(BinarySearch.binarySearch(6),5);
        assertEquals(BinarySearch.binarySearch(5),4);

    }

    @Test

    public void binarySearchShouldReturnMinusOneForNotExistingElement(){
        assertEquals(BinarySearch.binarySearch(10),-1);
        assertEquals(BinarySearch.binarySearch(0),-1);
    }


}
