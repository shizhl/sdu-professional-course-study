/*
 * 第5组：曹书锦 黄翔鸿  
 * 被测试类：SetCurrentDate()
 */
package net.micode.notes.ui.test;

import junit.framework.TestCase;
import net.micode.notes.ui.DateTimePicker;
import android.test.AndroidTestCase;

public class TestDataTime extends AndroidTestCase {

//	protected void setUp() throws Exception {
//		super.setUp();
//	}
	
	
	private DateTimePicker mDateTimePicker;
	protected void setUp() throws Exception {
		super.setUp();
		mDateTimePicker = new DateTimePicker(getContext());
	}



	public void testSetCurrentDate() {
        int year=2016;
        int month=12;
        int dayOfMonth=12;
        int hourOfDay=11;
        int minute=21;
     mDateTimePicker.setCurrentDate(year, month, dayOfMonth, hourOfDay, minute);
   //     assertEquals(year,mDateTimePicker.getCurrentYear());
        assertEquals(month,mDateTimePicker.getCurrentMonth());
    }
	
public void testDateTimePickerContext() {
	fail("Not yet implemented");
}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
