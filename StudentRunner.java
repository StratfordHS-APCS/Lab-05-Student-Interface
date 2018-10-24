/**
 * The StudentRunner class is used to demonstrate and test creating
 * Student objects and using the methods defined in 
 * StudentInterface.
 */
public class StudentRunner
{
	/**
	 * You need to create at least 2 more students and use them to
	 * test the functionality of your implementation of
	 * StudentInterface.
	 *
	 * @param	args	not used
	 */
    public static void main( String[] args )
    {
        Student s1 = new Student( "George Castanza", "Vandalay University" );
        System.out.println( s1.toString() );
        System.out.println( "Name = " + s1.getName() );
        System.out.println( "School = " + s1.getSchool() );
        
        Student s2 = new Student();
        s2.setName( "Harry Potter" );
        s2.setSchool( "Hogwarts Academy" );
        System.out.println( s2.toString() );
        System.out.println( "Name = " + s2.getName() );
        System.out.println( "School = " + s2.getSchool() );
        
        if( s1.atSameSchool( s2 ) )
        {
            System.out.println( s1.getName() + " and " + s2.getName() + " attend the same school." );
        } else {
            System.out.println( s1.getName() + " and " + s2.getName() + " attend different schools." );
        }
        
        s1.setSchool( "Hogwarts Academy" );
        System.out.println( s1.getName() + " transferred to " + s1.getSchool() );
        if( s1.atSameSchool( s2 ) )
        {
            System.out.println( s1.getName() + " and " + s2.getName() + " attend the same school." );
        } else {
            System.out.println( s1.getName() + " and " + s2.getName() + " attend different schools." );
        }
    }
}