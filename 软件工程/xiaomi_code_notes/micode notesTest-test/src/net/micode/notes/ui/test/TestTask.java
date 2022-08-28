/*
 * 第一组：张元良 许家铭 
 * 被测试类：Task
 */

package net.micode.notes.ui.test;

import junit.framework.TestCase;
import net.micode.notes.gtask.data.Node;
import net.micode.notes.gtask.data.Task;
import net.micode.notes.gtask.data.TaskList;
import net.micode.notes.tool.GTaskStringUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestTask extends TestCase {
	
	//实例化一个TASK和一个TASKLIST
	Task myTask = new Task(); 
	TaskList myTaskList = new TaskList();
	
	//定义一些参数，在后面的Task的设置中要用到
	public static String ListGid = "zyl";
	public static String MyName = "zyl's Task";
	public static String MyNote = "I've spent my whole weekend on JUnit.........";
	
	
	protected void setUp() throws Exception {
		
		//设置任务列表的GID以及将myTask加入到这个任务列表中
		myTaskList.setGid(ListGid);           
		myTaskList.addChildTask(myTask);
		
		//对myTask进行设置，包括名字，内容，parent
		myTask.setParent(myTaskList);
		myTask.setName(MyName);
		myTask.setNotes(MyNote);
		
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetCreateAction() throws JSONException {
		
		//假设任务是在本地添加。实例化
		JSONObject myjs = new JSONObject();
		myjs = myTask.getCreateAction(Node.SYNC_ACTION_ADD_LOCAL);
		
		//获取getCreateAction返回的JSONObject myjs,查看其中的值是否为我们先前设置好的
		Object ACTION_TYPE  = myjs.get(GTaskStringUtils.GTASK_JSON_ACTION_TYPE);
		Object ACTION_ID    = myjs.get(GTaskStringUtils.GTASK_JSON_ACTION_ID);
		Object PARENT_ID    = myjs.get(GTaskStringUtils.GTASK_JSON_PARENT_ID);
		
		//经检验都是对的
		assertEquals("create",ACTION_TYPE);
		assertEquals(2,ACTION_ID);
		assertEquals("zyl",PARENT_ID);
		
		//这里是一个比较特殊的地方，是把一个JSONObject当成value又放入了一个新的JSONObject，我们先取出这个JSONObject
		JSONObject ENTITY_DELTA = new JSONObject();
		ENTITY_DELTA        = myjs.getJSONObject(GTaskStringUtils.GTASK_JSON_ENTITY_DELTA);
		
		//接下来在这个JSONObject（ENTITY_DELTA）中查看我们设置的值是否是对的
		Object NAME         = ENTITY_DELTA.get(GTaskStringUtils.GTASK_JSON_NAME);
		Object NOTES        = ENTITY_DELTA.get(GTaskStringUtils.GTASK_JSON_NOTES);
		
		
		assertEquals("zyl's Task",NAME);
//		assertEquals("I've spent my whole weekend on JUnit.........",NOTES);
		assertEquals("I am happy with doing JUnit.........",NOTES);  //这是一个测试反例，开个玩笑，哈哈
		
	}

	public void testIsWorthSaving() throws JSONException {
		boolean save = myTask.isWorthSaving();
		assertEquals(true,save);
	}


}
