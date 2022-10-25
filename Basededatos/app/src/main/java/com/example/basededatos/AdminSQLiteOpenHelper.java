package com.example.basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public void onCreate(SQLiteDatabase baseDeDatos) {
        baseDeDatos.execSQL("create table articulos(codigo int primary key, descripcion text, precio real)");
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
