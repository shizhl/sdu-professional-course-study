package net.micode.notes.gtask.data;

import net.micode.notes.data.Notes.DataColumns;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import android.content.Context;
import android.test.AndroidTestCase;

import android.test.AndroidTestRunner;

public class SqlDataTest extends AndroidTestCase {

	SqlData MySqlData;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void testGetId() {
		Context MyContext = getContext();
		MySqlData=new SqlData(MyContext);
		assertEquals(-99999,MySqlData.getId());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testGetContent() throws JSONException {

		Context MyContext = getContext();
		MySqlData=new SqlData(MyContext);
		
		JSONObject MyJs = new JSONObject ();
		
		MyJs.put(DataColumns.ID,19500);
	    MyJs.put(DataColumns.MIME_TYPE, "mime_type");
	    MyJs.put(DataColumns.CONTENT, "content");
	    MyJs.put(DataColumns.DATA1, 0);
	    MyJs.put(DataColumns.DATA3, 0);

	    
		MySqlData.setContent(MyJs);
		JSONObject RealJs = MySqlData.getContent();
		
		Assert.assertEquals("content",RealJs.getString(DataColumns.CONTENT));
		

	}
	
}
