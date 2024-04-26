package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S220473748";
		Assert.assertNotNull("Student ID is S220473748", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rohit Kadam";
		Assert.assertNotNull("Student name is Rohit Kadam", studentName);
	}
	
	// D1 FOR from 1 to 28, D2 For Day 29, D3 For Day 30 and D4 for 31
	// M1 for 30 day Month, M2 for 31 day Month, M3 for 29 Day Month
	// Y1 FOR LEAP YEAR AND Y2 For Normal year
	
	
	// Test case for D1 Class: Day between 1 to 28 for testing increment & Decrement
    @Test
    public void testD1January10shouldIncrementtoJanuary11() {
    	DateUtil date = new DateUtil(10, 1, 2024);
    	System.out.println("Test Case Scenario for D1 Class - Increment");
		System.out.println("january10ShouldIncrementToJanuary11 > " + date);
        date.increment();
        Assert.assertEquals(11, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        System.out.println(date);
    }
    
    @Test
    public void testD1January10shouldDecrementtoJanuary9() {
    	DateUtil date = new DateUtil(10, 1, 2024);
    	System.out.println("Test Case Scenario for D1 Class - Decrement");
		System.out.println("january10ShoulddecrementToJanuary11 > " + date);
        date.decrement();
        Assert.assertEquals(9, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        System.out.println(date);
    }
    
    
 // Test case for D2 Class: Day:29 for testing increment & Decrement
    @Test
    public void testD2February29shouldIncrementtoMarch1() {
    	DateUtil date = new DateUtil(29, 2, 2024);
    	System.out.println("Test Case Scenario for D2 Class - Increment");
		System.out.println("February29ShouldIncrementToMarch1 > " + date);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        System.out.println(date);
    }
    
    @Test
    public void testD2February29shouldDecrementtoFebruary28() {
    	DateUtil date = new DateUtil(29, 2, 2024);
    	System.out.println("Test Case Scenario for D2 Class - Decrement");
		System.out.println("February29ShoulddecrementtToFebruary28 > " + date);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        System.out.println(date);
    }
    
    
    // Test case for D3 Class: Day:30 for testing increment & Decrement
    
    @Test
    public void testD2April29shouldIncrementtoApril30() {
    	DateUtil date = new DateUtil(29, 4, 2024);
    	System.out.println("Test Case Scenario for D3 Class - Increment");
		System.out.println("April29ShouldIncrementToApril30 > " + date);
        date.increment();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        System.out.println(date);
    }
    
    @Test
    public void testD3April15shouldDecrementtoApril14() {
    	DateUtil date = new DateUtil(15, 4, 2024);
    	System.out.println("Test Case Scenario for D3 Class - Decrement");
		System.out.println("April15ShoulddecrementtToApril14 > " + date);
        date.decrement();
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        System.out.println(date);
    }
    
// Test case for D4 Class: Day:31 for testing increment & Decrement
    
    @Test
    public void testD4May15shouldIncrementtoMay16() {
    	DateUtil date = new DateUtil(15, 5, 2024);
    	System.out.println("Test Case Scenario for D4 Class - Increment");
		System.out.println("April15ShouldIncrementToApril16 > " + date);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        System.out.println(date);
    }
    
    @Test
    public void testD4May7shouldDecrementtoMay6() {
    	DateUtil date = new DateUtil(7, 5, 2024);
    	System.out.println("Test Case Scenario for D4 Class - Decrement");
		System.out.println("May7ShoulddecrementtToMay6 > " + date);
        date.decrement();
        Assert.assertEquals(6, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        System.out.println(date);
    }

// Test case for M1 Class: Month:30 for testing increment & Decrement
    
    @Test
    public void testM1June29shouldIncrementtoJune30() {
    	DateUtil date = new DateUtil(29, 6, 2024);
    	System.out.println("Test Case Scenario for M1 Class - Increment");
		System.out.println("May29ShouldIncrementToMay30 > " + date);
        date.increment();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        System.out.println(date);
    }
    
    @Test
    public void testM1June30shouldDecrementtoJune29() {
    	DateUtil date = new DateUtil(30, 6, 2024);
    	System.out.println("Test Case Scenario for M1 Class - Decrement");
		System.out.println("May7ShoulddecrementtToMay6 > " + date);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        System.out.println(date);
    }
    
// Test case for M2 Class: Month:31 for testing increment & Decrement
    
    @Test
    public void testM2July30shouldIncrementtoJuly31() {
    	DateUtil date = new DateUtil(30, 7, 2024);
    	System.out.println("Test Case Scenario for M2 Class - Increment");
		System.out.println("July30ShouldIncrementToJuly31 > " + date);
        date.increment();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        System.out.println(date);
    }
    
    @Test
    public void testM2July31shouldDecrementtoJuly30() {
    	DateUtil date = new DateUtil(31, 7, 2024);
    	System.out.println("Test Case Scenario for M2 Class - Decrement");
		System.out.println("July31ShoulddecrementtToJuly30 > " + date);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        System.out.println(date);
    }
    
    
// Test case for M3 Class: Month:29 for testing increment & Decrement
    
    @Test
    public void testM3February28shouldIncrementtoFebruary29() {
    	DateUtil date = new DateUtil(28, 2, 2024);
    	System.out.println("Test Case Scenario for M3 Class - Increment");
		System.out.println("February28ShouldIncrementToFebruary29 > " + date);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        System.out.println(date);
    }
    
    @Test
    public void testM3February29shouldDecrementtoFebruary28() {
    	DateUtil date = new DateUtil(29, 2, 2024);
    	System.out.println("Test Case Scenario for M3 Class - Decrement");
		System.out.println("February29ShoulddecrementtToFebruary28 > " + date);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        System.out.println(date);
    }
    
// Test case for Y1 Class: Year:Leap year for testing increment & Decrement
    
    @Test
    public void testY1February28shouldIncrementtoFebruary29() {
    	DateUtil date = new DateUtil(28, 2, 2024);
    	System.out.println("Test Case Scenario for Y1 Class - Increment");
		System.out.println("February28ShouldIncrementToFebruary29 > " + date);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
        System.out.println(date);
    }
    
    @Test
    public void testY1March1shouldDecrementtoFebruary29() {
    	DateUtil date = new DateUtil(1, 3, 2024);
    	System.out.println("Test Case Scenario for Y1 Class - Decrement");
		System.out.println("March1ShoulddecrementtToFebruary29 > " + date);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
        System.out.println(date);
    }
    
    
    @Test
	public void testY1leapyear28FebrurayshouldIncrementtoFebruary29() {
        DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("February28ToshouldIncrementtoFebruary29LeapYear > " + date);
	    date.increment();
	    System.out.println(date);
	    if ((date.getMonth() == 2) && (date.getDay() == 29)) {
	        System.out.println("It is a leap year and the next date is: " + date);
	    }
	    else {
	        System.out.println("It is not in a leap year and next date is: " + date);
	    }
	}
    
    
// Test case for Y2 Class: Year:Non-Leap year for testing increment & Decrement
    
    @Test
    public void testY2February28shouldIncrementtoMarch1() {
    	DateUtil date = new DateUtil(28, 2, 2023);
    	System.out.println("Test Case Scenario for Y2 Class - Increment");
		System.out.println("February28ShouldIncrementToMarch1 > " + date);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
        System.out.println(date);
    }
    
    @Test
    public void testY2March1shouldDecrementtoFebruary28() {
    	DateUtil date = new DateUtil(1, 3, 2023);
    	System.out.println("Test Case Scenario for Y1 Class - Decrement");
		System.out.println("March1ShoulddecrementtToFebruary28 > " + date);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
        System.out.println(date);
    }
    
    @Test
   	public void testY2Nonleapyear28FebrurayshouldIncrementtoMarch1() {
           DateUtil date = new DateUtil(28, 2, 2023);
   	    System.out.println("February28shouldincrementToMarch1NonLeapYear > " + date);
   	    date.increment();
   	    System.out.println(date);
   	    if ((date.getMonth() == 2) && (date.getDay() == 29)) {
   	        System.out.println("It is a leap year and the next date is: " + date);
   	    }
   	    else {
   	        System.out.println("It is not in a leap year and next date is: " + date);
   	    }
   	}

    
    
	
	
	
}
