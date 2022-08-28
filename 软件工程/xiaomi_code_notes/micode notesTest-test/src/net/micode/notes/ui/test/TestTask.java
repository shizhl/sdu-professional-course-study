/*
 * ��һ�飺��Ԫ�� ����� 
 * �������ࣺTask
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
	
	//ʵ����һ��TASK��һ��TASKLIST
	Task myTask = new Task(); 
	TaskList myTaskList = new TaskList();
	
	//����һЩ�������ں����Task��������Ҫ�õ�
	public static String ListGid = "zyl";
	public static String MyName = "zyl's Task";
	public static String MyNote = "I've spent my whole weekend on JUnit.........";
	
	
	protected void setUp() throws Exception {
		
		//���������б��GID�Լ���myTask���뵽��������б���
		myTaskList.setGid(ListGid);           
		myTaskList.addChildTask(myTask);
		
		//��myTask�������ã��������֣����ݣ�parent
		myTask.setParent(myTaskList);
		myTask.setName(MyName);
		myTask.setNotes(MyNote);
		
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetCreateAction() throws JSONException {
		
		//�����������ڱ�����ӡ�ʵ����
		JSONObject myjs = new JSONObject();
		myjs = myTask.getCreateAction(Node.SYNC_ACTION_ADD_LOCAL);
		
		//��ȡgetCreateAction���ص�JSONObject myjs,�鿴���е�ֵ�Ƿ�Ϊ������ǰ���úõ�
		Object ACTION_TYPE  = myjs.get(GTaskStringUtils.GTASK_JSON_ACTION_TYPE);
		Object ACTION_ID    = myjs.get(GTaskStringUtils.GTASK_JSON_ACTION_ID);
		Object PARENT_ID    = myjs.get(GTaskStringUtils.GTASK_JSON_PARENT_ID);
		
		//�����鶼�ǶԵ�
		assertEquals("create",ACTION_TYPE);
		assertEquals(2,ACTION_ID);
		assertEquals("zyl",PARENT_ID);
		
		//������һ���Ƚ�����ĵط����ǰ�һ��JSONObject����value�ַ�����һ���µ�JSONObject��������ȡ�����JSONObject
		JSONObject ENTITY_DELTA = new JSONObject();
		ENTITY_DELTA        = myjs.getJSONObject(GTaskStringUtils.GTASK_JSON_ENTITY_DELTA);
		
		//�����������JSONObject��ENTITY_DELTA���в鿴�������õ�ֵ�Ƿ��ǶԵ�
		Object NAME         = ENTITY_DELTA.get(GTaskStringUtils.GTASK_JSON_NAME);
		Object NOTES        = ENTITY_DELTA.get(GTaskStringUtils.GTASK_JSON_NOTES);
		
		
		assertEquals("zyl's Task",NAME);
//		assertEquals("I've spent my whole weekend on JUnit.........",NOTES);
		assertEquals("I am happy with doing JUnit.........",NOTES);  //����һ�����Է�����������Ц������
		
	}

	public void testIsWorthSaving() throws JSONException {
		boolean save = myTask.isWorthSaving();
		assertEquals(true,save);
	}


}
