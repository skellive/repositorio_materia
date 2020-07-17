package com.example.syncsqlitemysql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE ventas("+
                "idVenta INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "producto TEXT,"+
                "fechaVenta TEXT,"+
                "precio TEXT,"+
                "sincronizado TEXT"+
                ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void borrarRegistros(SQLiteDatabase db) {
        db.execSQL("DELETE FROM ventas");
    }
}
