package Task Manager;
 
import org.junit.Test;
 
import com.java2novice.junit.samples.Employee;
 
import static org.junit.Assert.*;
 
public class JSONAssertEqualsTest {
 
    @Test
    public void JSONJunitTest(){
         
        String expectedName = "Sarah Kelly";
        assertEquals(expectedName, Student.JSONSerialization());
    }
     
}
