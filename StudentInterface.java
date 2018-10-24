/**
 * This interface defines a Student.  That means that any class that 
 * implements this interface must implement all of the methods defined
 * below.  You need to create the Student class so it implements all 
 * of these method definitions.  This file consists of method 
 * definitions only, it is left up to you how your Student implements 
 * these methods.
 *
 * @author Dave Avis
 * @version 10.23.2018
 */
public interface StudentInterface
{
    /**
     * Set the student's name and school.
     * @param   studentName     The student's name.
     * @param   studentSchool   The school the student attends.
     */
    public void setStudent( String studentName, String studentSchool );
    
    /**
     * Set the student's name.
     * @param   studentName     The student's name.
     */
    public void setName( String studentName );
    
    /**
     * Get the student's name.
     * @return  The student's name.
     */
    public String getName();
    
    /**
     * Set the student's school.
     * @param   schoolName      The name of the student's school.
     */
    public void setSchool( String schoolName );
    
    /**
     * Get the student's school.
     * @return  The school the student attends.
     */
    public String getSchool();
    
    /**
     * Determines whether two students attend the same school.
     * @param   other       a student.
     * @return  true if this student's school equals the other student's school.
     */
    public boolean atSameSchool( Student other );
    
    /**
     * Output the student object in a readable format.
     * @return      a string that contains the student's full name and school.
     */
    public String toString();
}
