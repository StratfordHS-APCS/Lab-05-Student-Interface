import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  Dave Avis
 * @version 10.23.2018
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Test the constructor.
     */
    @Test
    public void constructorTest()
    {
        Student s1 = new Student( "Bob", "SHS" );
        assertEquals( "testing Student( \"Bob\", \"SHS\" ) failed.", "Bob", s1.getName() );
        assertEquals( "testing Student( \"Bob\", \"SHS\" ) failed.", "SHS", s1.getSchool() );
    }
    
    /**
     * Test setName()
     */
    @Test
    public void setNameTest()
    {
        Student s1 = new Student();
        s1.setName( "Bob" );
        assertEquals( "testing setName( \"Bob\" ) failed.", "Bob", s1.getName() );
    }
    
    /**
     * Test setSchool()
     */
    @Test
    public void setSchoolTest()
    {
        Student s1 = new Student();
        s1.setSchool( "SHS" );
        assertEquals( "testing setSchool( \"SHS\" ) failed.", "SHS", s1.getSchool() );
    }
    
    /**
     * Test atSameSchool()
     */
    @Test
    public void atSameSchoolTest()
    {
        Student s1 = new Student( "Bob", "SHS" );
        Student s2 = new Student( "Jane", "SHS" );
        assertTrue( "testing atSameSchool() for true failed.", s1.atSameSchool(s2) );
        s2.setSchool( "MHS" );
        assertFalse( "testing atSameSchool() for false failed.", s1.atSameSchool(s2) );
    }
    
    /**
     * Test toString()
     */
    @Test
    public void toStringTest()
    {
        Student s1 = new Student( "Bob", "SHS" );
        assertTrue( "toString() has no output.", s1.toString().length() > 0 );
    }
}
