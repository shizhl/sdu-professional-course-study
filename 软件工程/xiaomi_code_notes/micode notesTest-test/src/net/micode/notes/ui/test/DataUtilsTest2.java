package net.micode.notes.ui.test;

import net.micode.notes.data.Notes;
import net.micode.notes.data.NotesDatabaseHelper;
import net.micode.notes.data.Notes.NoteColumns;
import net.micode.notes.data.NotesDatabaseHelper.TABLE;
import net.micode.notes.tool.DataUtils;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.test.AndroidTestCase;
import net.micode.notes.data.NotesProvider;


public class DataUtilsTest2 extends AndroidTestCase {

	
//	public static final Uri my_URI = ContentUris.withAppendedId(Notes.CONTENT_NOTE_URI , 0); 
	long insertedId = 1;
	long noteId = 1;
	int URI_NOTE = 1;
	public  UriMatcher mMatcher;
//	public NotesDatabaseHelper mHelper;
//	public NotesDatabaseHelper mInstance;
	
	protected void setUp() throws Exception {
		mMatcher= new UriMatcher(UriMatcher.NO_MATCH);
		mMatcher.addURI(Notes.AUTHORITY, "note", URI_NOTE);
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMoveNoteToFoler() {
		
		Context mcontext = getContext(); 
		ContentResolver resolver = mcontext.getContentResolver();
		
		ContentValues values = new ContentValues();
        values.put(NoteColumns.PARENT_ID, 2);
        values.put(NoteColumns.ORIGIN_PARENT_ID, 3);
        values.put(NoteColumns.LOCAL_MODIFIED, 0);
 
        
//		UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
//		mMatcher.addURI(Notes.AUTHORITY, "note", URI_NOTE);
		
        
//		SQLiteDatabase db = mHelper.getWritableDatabase();
//		insertedId = noteId = db.insert(TABLE.NOTE, null, values);
//		resolver.notifyChange(
//                ContentUris.withAppendedId(Notes.CONTENT_NOTE_URI, noteId), null);
		
	
        
        resolver.insert(ContentUris.withAppendedId(Notes.CONTENT_NOTE_URI, 0), values);
//        resolver.insert(Notes.CONTENT_NOTE_URI, values);
		
	//	DataUtils.moveNoteToFoler(resolver, insertedId, 1, 2);
		
		
	//	Cursor cr =  resolver.query(ContentUris.withAppendedId(Notes.CONTENT_NOTE_URI, insertedId),
		Cursor cr =  resolver.query(ContentUris.withAppendedId(Notes.CONTENT_NOTE_URI, 0),
				new String[]{NoteColumns.PARENT_ID},
				null, null, null);
		
		
		long parentId = cr.getLong(0);	
		assertEquals(2,parentId);
		
	}

}
