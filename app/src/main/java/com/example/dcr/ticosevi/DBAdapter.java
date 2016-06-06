package com.example.dcr.ticosevi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBAdapter {
    static final String KEY_ROWID = "_id";
    static final String KEY_ATRIBUTO01 = "atributo01";
    static final String KEY_ATRIBUTO02 = "atributo02";
    static final String TAG = "DBAdapter";
    static final String DATABASE_NAME = "NotasObtenidas.db";
    static final String DATABASE_TABLE = "mitabla";
    static final int DATABASE_VERSION = 1;
    static final String DATABASE_CREATE =
            "create table mitabla (_id integer primary key autoincrement, "
                    + "atributo01 text not null, atributo02 text not null);";
    final Context context;
    DatabaseHelper DBHelper;
    SQLiteDatabase db;

    public DBAdapter(Context ctx)
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }

    private static class DatabaseHelper extends SQLiteOpenHelper
    {
        DatabaseHelper(Context context)
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        @Override
        public void onCreate(SQLiteDatabase db)
        {
            try {
                db.execSQL(DATABASE_CREATE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            db.execSQL("DROP TABLE IF EXISTS mitabla");
            onCreate(db);
        }
    }
    //---Abrimos la base datos---
    public DBAdapter open() throws SQLException
    {
        db = DBHelper.getWritableDatabase();
        return this;
    }
    //---Cerramos la base de datos ---
    public void close()
    {
        DBHelper.close();
    }
    //---Insertamos un dato en la BD---
    public long insertDato(String atributo01)
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_ATRIBUTO01, atributo01);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }
    //---Borramos un dato particular---
    public boolean BorrarDato(long rowId)
    {
        return db.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;
    }
    //---Recuperamos todo los datos---
    public Cursor CargarTodosLosDatos()
    {
        return db.query(DATABASE_TABLE, new String[] {KEY_ATRIBUTO01}, null, null, null, null, null);
    }
    //---recuperamos un dato particular---
    public Cursor ObtenerDato(long rowId) throws SQLException
    {
        Cursor mCursor =
                db.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,
                                KEY_ATRIBUTO01, KEY_ATRIBUTO02}, KEY_ROWID + "=" + rowId, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }
    //---Actualizamos un dato---
    public boolean ActualizarDato(long rowId, String atributo01, String atributo02)
    {
        ContentValues args = new ContentValues();
        args.put(KEY_ATRIBUTO01, atributo01);
        args.put(KEY_ATRIBUTO02, atributo02);
        return db.update(
                DATABASE_TABLE, args, KEY_ROWID + "=" + rowId, null) > 0;
    }
}


// FIN DE LA CLASE DatabaseHelper
