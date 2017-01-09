package MavenDemo.start;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testDoubleTwoNegative(){
    	assertEquals(-4.4, App.addTwoDouble(-2, -2.4));
    }
    
    public void testDoubleNegativePositive(){
    	assertEquals(-2.8, App.addTwoDouble(-3.8, 1));
    }
    
    public void testIntegerTwoPositive(){
    	assertEquals(12, App.addTwoIntegers(2, 10));
    }
    
    public void testIntegerNegativePositive(){
    	assertEquals(14, App.addTwoIntegers(-12, 26));
    }
    
}
