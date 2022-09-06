package com.example.rowielokentmatsui.writeme;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

public class DataManager extends SQLiteOpenHelper {
    // Database Info
    private static final String DATABASE_NAME = "WritemeDB";
    private static final int DATABASE_VERSION = 1;

    // Table Names

    private static final String TABLE_Achievement = "achievements";
    private static final String TABLE_Letter = "letter";
    private static final String TABLE_History="history";
    private static final String TABLE_Opener="opentable";
    // Post Table Columns achievement
    private static final String Achievement_ID = "achievementID";
    private static final String Achievement_Name = "achievementname";
    private static final String Achievement_Stat = "achievementstat";
    // Post Table Columns letter
    private static final String Letter_ID = "letterID";
    private static final String Letter_Name = "lettername";
    private static final String Letter_Stat = "letterstat";
    private static final String Difficulty = "letterdifficulty";
    // Post Table Columns history
    private static final String History_ID = "historyID";
    private static final String History_Letter="historyletter";
    private static final String History_filename="filename";
    // Post Table for one open
    private static final String One_Open = "openone";

    Letter letter = new Letter();

    private SQLiteDatabase dbinp;

    public DataManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String Create_table = "CREATE TABLE IF NOT EXISTS " + TABLE_Achievement
                + " ( " + Achievement_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +  Achievement_Name + " TEXT, " + Achievement_Stat + " INTEGER)";
        db.execSQL(Create_table);

        String Create_table_letter = "CREATE TABLE IF NOT EXISTS " + TABLE_Letter
                + " ( " + Letter_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +  Letter_Name + " TEXT, " + Letter_Stat + " INTEGER ,"+ Difficulty + " INTEGER)";
        db.execSQL(Create_table_letter);
        String Create_table_history = "CREATE TABLE IF NOT EXISTS " + TABLE_History
                + " ( " + History_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +  History_Letter + " TEXT, " + History_filename + " TEXT " + " )";
        db.execSQL(Create_table_history);
        String Create_table_open = "CREATE TABLE IF NOT EXISTS " + TABLE_Opener
                + " ( " + One_Open + " INTEGER PRIMARY KEY  " + " )";
        db.execSQL(Create_table_open);
        String addDataAchievement = "Insert into "+TABLE_Achievement +
                " values(null,'BigA',0)," +
                "(null,'BigB',0)," +
                "(null,'BigC',0)," +
                "(null,'BigD',0)," +
                "(null,'BigE',0)," +
                "(null,'BigF',0)," +
                "(null,'BigG',0)," +
                "(null,'BigH',0)," +
                "(null,'BigI',0)," +
                "(null,'BigJ',0)," +
                "(null,'BigK',0)," +
                "(null,'BigL',0)," +
                "(null,'BigM',0)," +
                "(null,'BigN',0)," +
                "(null,'BigO',0)," +
                "(null,'BigP',0)," +
                "(null,'BigQ',0)," +
                "(null,'BigR',0)," +
                "(null,'BigS',0)," +
                "(null,'BigT',0)," +
                "(null,'BigU',0)," +
                "(null,'BigV',0)," +
                "(null,'BigW',0)," +
                "(null,'BigX',0)," +
                "(null,'BigY',0)," +
                "(null,'BigZ',0)," +
                "(null,'Smalla',0)," +
                "(null,'Smallb',0)," +
                "(null,'Smallc',0)," +
                "(null,'Smalld',0)," +
                "(null,'Smalle',0)," +
                "(null,'Smallf',0)," +
                "(null,'Smallg',0)," +
                "(null,'Smallh',0)," +
                "(null,'Smalli',0)," +
                "(null,'Smallj',0)," +
                "(null,'Smallk',0)," +
                "(null,'Smalll',0)," +
                "(null,'Smallm',0)," +
                "(null,'Smalln',0)," +
                "(null,'Smallo',0)," +
                "(null,'Smallp',0)," +
                "(null,'Smallq',0)," +
                "(null,'Smallr',0)," +
                "(null,'Smalls',0)," +
                "(null,'Smallt',0)," +
                "(null,'Smallu',0)," +
                "(null,'Smallv',0)," +
                "(null,'Smallw',0)," +
                "(null,'Smallx',0)," +
                "(null,'Smally',0)," +
                "(null,'Smallz',0)," +
                "(null,'circle',0)," +
                "(null,'rectangle',0)," +
                "(null,'square',0)," +
                "(null,'triangle',0)" ;
        String addDataLetter = "Insert into "+TABLE_Letter +
                " values(null,'BigA',1,0)," +
                "(null,'BigB',0,0)," +
                "(null,'BigC',0,0)," +
                "(null,'BigD',0,0)," +
                "(null,'BigE',0,0)," +
                "(null,'BigF',0,0)," +
                "(null,'BigG',0,0)," +
                "(null,'BigH',0,0)," +
                "(null,'BigI',0,0)," +
                "(null,'BigJ',0,0)," +
                "(null,'BigK',0,0)," +
                "(null,'BigL',0,0)," +
                "(null,'BigM',0,0)," +
                "(null,'BigN',0,0)," +
                "(null,'BigO',0,0)," +
                "(null,'BigP',0,0)," +
                "(null,'BigQ',0,0)," +
                "(null,'BigR',0,0)," +
                "(null,'BigS',0,0)," +
                "(null,'BigT',0,0)," +
                "(null,'BigU',0,0)," +
                "(null,'BigV',0,0)," +
                "(null,'BigW',0,0)," +
                "(null,'BigX',0,0)," +
                "(null,'BigY',0,0)," +
                "(null,'BigZ',0,0)," +
                "(null,'Smalla',0,0)," +
                "(null,'Smallb',0,0)," +
                "(null,'Smallc',0,0)," +
                "(null,'Smalld',0,0)," +
                "(null,'Smalle',0,0)," +
                "(null,'Smallf',0,0)," +
                "(null,'Smallg',0,0)," +
                "(null,'Smallh',0,0)," +
                "(null,'Smalli',0,0)," +
                "(null,'Smallj',0,0)," +
                "(null,'Smallk',0,0)," +
                "(null,'Smalll',0,0)," +
                "(null,'Smallm',0,0)," +
                "(null,'Smalln',0,0)," +
                "(null,'Smallo',0,0)," +
                "(null,'Smallp',0,0)," +
                "(null,'Smallq',0,0)," +
                "(null,'Smallr',0,0)," +
                "(null,'Smalls',0,0)," +
                "(null,'Smallt',0,0)," +
                "(null,'Smallu',0,0)," +
                "(null,'Smallv',0,0)," +
                "(null,'Smallw',0,0)," +
                "(null,'Smallx',0,0)," +
                "(null,'Smally',0,0)," +
                "(null,'Smallz',0,0)," +
                "(null,'circle',0,0)," +
                "(null,'square',0,0)," +
                "(null,'rectangle',0,0)," +
                "(null,'triangle',0,0)," +
                "(null,'BigA',0,1)," +
                "(null,'BigB',0,1)," +
                "(null,'BigC',0,1)," +
                "(null,'BigD',0,1)," +
                "(null,'BigE',0,01)," +
                "(null,'BigF',0,1)," +
                "(null,'BigG',0,1)," +
                "(null,'BigH',0,1)," +
                "(null,'BigI',0,1)," +
                "(null,'BigJ',0,1)," +
                "(null,'BigK',0,1)," +
                "(null,'BigL',0,1)," +
                "(null,'BigM',0,1)," +
                "(null,'BigN',0,1)," +
                "(null,'BigO',0,1)," +
                "(null,'BigP',0,1)," +
                "(null,'BigQ',0,1)," +
                "(null,'BigR',0,1)," +
                "(null,'BigS',0,1)," +
                "(null,'BigT',0,1)," +
                "(null,'BigU',0,1)," +
                "(null,'BigV',0,1)," +
                "(null,'BigW',0,1)," +
                "(null,'BigX',0,1)," +
                "(null,'BigY',0,1)," +
                "(null,'BigZ',0,1)," +
                "(null,'Smalla',0,1)," +
                "(null,'Smallb',0,1)," +
                "(null,'Smallc',0,1)," +
                "(null,'Smalld',0,1)," +
                "(null,'Smalle',0,1)," +
                "(null,'Smallf',0,1)," +
                "(null,'Smallg',0,1)," +
                "(null,'Smallh',0,1)," +
                "(null,'Smalli',0,1)," +
                "(null,'Smallj',0,1)," +
                "(null,'Smallk',0,1)," +
                "(null,'Smalll',0,1)," +
                "(null,'Smallm',0,1)," +
                "(null,'Smalln',0,1)," +
                "(null,'Smallo',0,1)," +
                "(null,'Smallp',0,1)," +
                "(null,'Smallq',0,1)," +
                "(null,'Smallr',0,1)," +
                "(null,'Smalls',0,1)," +
                "(null,'Smallt',0,1)," +
                "(null,'Smallu',0,1)," +
                "(null,'Smallv',0,1)," +
                "(null,'Smallw',0,1)," +
                "(null,'Smallx',0,1)," +
                "(null,'Smally',0,1)," +
                "(null,'Smallz',0,1)," +
                "(null,'circle',0,1)," +
                "(null,'square',0,1)," +
                "(null,'rectangle',0,1)," +
                "(null,'triangle',0,1)" ;
        db.execSQL(addDataLetter);
        db.execSQL(addDataAchievement);
        String opener = "Insert into "+TABLE_Opener+" values(0)" ;
        db.execSQL(opener);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        if (oldVersion != newVersion) {
            // Simplest implementation is to drop all old tables and recreate
            // them
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_Achievement);
            onCreate(db);
            
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_Letter);
            onCreate(db);
        }
    }
    public int updateopen(){
        dbinp = this.getWritableDatabase();

        int result;

            ContentValues values = new ContentValues();
            values.put(One_Open, 1);
            result = dbinp.update(TABLE_Opener, values, One_Open+ " = 0" ,
                    null);

        dbinp.close();
       return result;
    }
    public int checkifopened(){
        dbinp = this.getWritableDatabase();

        String que = "Select " + One_Open + " FROM " + TABLE_Opener;
        Cursor cur = dbinp.rawQuery(que, null);

        if (cur != null) {

            if (cur.moveToFirst()) {
              Log.d("sulod","sa dli null");
                int id = Integer.parseInt(cur.getString(0));
                dbinp.close();
                return id;
            } else {
                Log.d("sulod","sa dli null pero else");
                dbinp.close();
                return 0;
            }
        } else {
            Log.d("sulod","sa null");
            dbinp.close();
            return 0;
        }
    }
    public ArrayList<Letter> getEasy(){
        ArrayList<Letter> letterlist = new ArrayList<Letter>();

        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_Letter +" where "+ Difficulty + " = 0";

        // 2. get reference to writable DB
        dbinp = this.getWritableDatabase();
        Cursor cursor = dbinp.rawQuery(query, null);

        // 3. go over each row, build and add it to list

        if (cursor.moveToFirst()) {
            do {
                Letter lett = new Letter();
                lett.setLetterID(Integer.parseInt(cursor.getString(0)));
                lett.setLetterName((cursor.getString(1)));
                lett.setLettterStat(Integer.parseInt(cursor.getString(2)));
                lett.setDifficulty(Integer.parseInt(cursor.getString(3)));
                // Add
                letterlist.add(lett);
            } while (cursor.moveToNext());
        }

        dbinp.close();
        return letterlist;
    }
    public ArrayList<Letter> getAvg(){
        ArrayList<Letter> letterlist = new ArrayList<Letter>();

        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_Letter +" where "+ Difficulty + " = 1";

        // 2. get reference to writable DB
        dbinp = this.getWritableDatabase();
        Cursor cursor = dbinp.rawQuery(query, null);

        // 3. go over each row, build and add it to list

        if (cursor.moveToFirst()) {
            do {
                Letter lett = new Letter();
                lett.setLetterID(Integer.parseInt(cursor.getString(0)));
                lett.setLetterName((cursor.getString(1)));
                lett.setLettterStat(Integer.parseInt(cursor.getString(2)));
                lett.setDifficulty(Integer.parseInt(cursor.getString(3)));
                // Add
                letterlist.add(lett);
            } while (cursor.moveToNext());
        }

        dbinp.close();
        return letterlist;
    }
    public ArrayList<Letter> getAchievements(){
        ArrayList<Letter> letterlist = new ArrayList<Letter>();

        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_Achievement ;

        // 2. get reference to writable DB
        dbinp = this.getWritableDatabase();
        Cursor cursor = dbinp.rawQuery(query, null);

        // 3. go over each row, build and add it to list

        if (cursor.moveToFirst()) {
            do {
                Letter lett = new Letter();
                lett.setAchievementID(Integer.parseInt(cursor.getString(0)));
                lett.setAchievementName((cursor.getString(1)));
                lett.setAchievementStat(Integer.parseInt(cursor.getString(2)));

                // Add
                letterlist.add(lett);
            } while (cursor.moveToNext());
        }

        dbinp.close();
        return letterlist;
    }
    public int updateLetter(String lettername,int difficulty){
        dbinp = this.getWritableDatabase();
        int lettID = getID(lettername,difficulty);
        int result;
        if (lettID == 0) {
            result = 0;
        } else {
            ContentValues values = new ContentValues();
            values.put(Letter_Stat, 1);
            result = dbinp.update(TABLE_Letter, values, Letter_ID + " = " + lettID ,
                    null);
        }
        dbinp.close();
        return result;
    }
    public int updateAchievement(String lettername,int achieved){
        dbinp = this.getWritableDatabase();
        int result;
            ContentValues values1 = new ContentValues();
            values1.put(Achievement_Stat,achieved);
            result = dbinp.update(TABLE_Achievement,values1,Achievement_Name + " like '" + lettername +"'", null);
        dbinp.close();
        return result;
    }
    public int getID(String letternya, int diff) {

        String que = "Select " + Letter_ID + " FROM " + TABLE_Letter + " where "
                + Letter_Name + " like '" + letternya+"' and "+Difficulty+ " = " +diff;
        Cursor cur = dbinp.rawQuery(que, null);
        if (cur != null) {
            if (cur.moveToFirst()) {
                int id = Integer.parseInt(cur.getString(0));
                return id;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
    public int getAverageCat(){
        dbinp = this.getWritableDatabase();
        String que = "Select " + Letter_Stat + " FROM " + TABLE_Letter + " where "
               +Letter_ID+ " = 56";
        Cursor cur = dbinp.rawQuery(que, null);
        if (cur != null) {
            if (cur.moveToFirst()) {
                int id = Integer.parseInt(cur.getString(0));
                dbinp.close();
                return id;
            } else {
                dbinp.close();
                return 4;
            }
        } else {
            dbinp.close();
            return 4;
        }

    }


    public int getHrdCat(){
        dbinp = this.getWritableDatabase();
        String que = "Select " + Letter_Stat + " FROM " + TABLE_Letter + " where "
                +Letter_ID+ " = 112";
        Cursor cur = dbinp.rawQuery(que, null);
        if (cur != null) {
            if (cur.moveToFirst()) {
                int id = Integer.parseInt(cur.getString(0));
                dbinp.close();
                return id;
            } else {
                dbinp.close();
                return 4;
            }
        } else {
            dbinp.close();
            return 4;
        }

    }
    public int getHistoryCount(){
        dbinp = this.getWritableDatabase();
        String que = "Select " + History_ID + " FROM " + TABLE_History;
        Cursor cur = dbinp.rawQuery(que, null);
        if (cur != null) {
            if (cur.moveToFirst()) {
                int id = Integer.parseInt(cur.getString(0));
                dbinp.close();
                return id;
            } else {
                dbinp.close();
                return 0;
            }
        } else {
            dbinp.close();
            return 0;
        }
    }
    public String addHistory(Letter letters){

        try {
            dbinp = this.getWritableDatabase();
            ContentValues rowid = new ContentValues();
            // String
            // query="insert into "+TABLE_NAME+" values(null,"+book.getIsbn()+",'"+
            // book.getTitle()+"','"+book.getAuthor()+"',"+book.getQuantity()+","+book.getPrice()+")";
            // dbinp.execSQL(query);
            rowid.putNull(History_ID);
            rowid.put(History_Letter, letters.getHistoryLetter());
            rowid.put(History_filename, letters.getHistoryFilename());

            dbinp.insertOrThrow(TABLE_History, null, rowid);
        } catch (SQLException e) {
            dbinp.close();
            return e.toString();
        }
        dbinp.close();
        return "good";

    }
    public ArrayList<String> getHistory(String letterhere){
        dbinp = this.getWritableDatabase();
        ArrayList <String> letternew= new ArrayList<String>();
        // 1. build the query
        String query = "SELECT "+ History_filename +" FROM " + TABLE_History + " where "+History_Letter+" like '"+ letterhere+"'";

        // 2. get reference to writable DB
        dbinp = this.getWritableDatabase();
        Cursor cursor = dbinp.rawQuery(query, null);

        // 3. go over each row, build and add it to list

        if (cursor.moveToFirst()) {
            do {
                // Add
                letternew.add(Environment.getExternalStorageDirectory()+"/"+cursor.getString(0));
            } while (cursor.moveToNext());
        }
        else{
            letternew.add("nothing");
        }

        dbinp.close();
        return letternew;

    }
    public ArrayList<Cursor> getData(String Query){
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[] { "mesage" };
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2= new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);


        try{
            String maxQuery = Query ;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);


            //add value to cursor2
            Cursor2.addRow(new Object[] { "Success" });

            alc.set(1,Cursor2);
            if (null != c && c.getCount() > 0) {


                alc.set(0,c);
                c.moveToFirst();

                return alc ;
            }
            return alc;
        } catch(SQLException sqlEx){
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[] { ""+sqlEx.getMessage() });
            alc.set(1,Cursor2);
            return alc;
        } catch(Exception ex){

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[] { ""+ex.getMessage() });
            alc.set(1,Cursor2);
            return alc;
        }


    }
}


