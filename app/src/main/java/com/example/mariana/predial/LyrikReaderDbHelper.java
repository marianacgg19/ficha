package com.example.mariana.predial;



        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

/**
 * Creado por Hermosa Programación
 */
public class LyrikReaderDbHelper extends SQLiteOpenHelper {



    public LyrikReaderDbHelper(Context context){
        super(  context,
                DataBaseScript.DATABASE_NAME,
                null,
                DataBaseScript.DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        /*
        Crear las tablas
         */
        db.execSQL(DataBaseScript.CREATE_GENRES_SCRIPT);
        db.execSQL(DataBaseScript.CREATE_ARTISTS_SCRIPT);
        //******************************************************
        db.execSQL(DataBaseScript.CREATE_PARRO_SCRIPT);

        /*
        Insertar registros iniciales
         */
        db.execSQL(DataBaseScript.INSERT_PROVINCIA_SCRIPT);
        db.execSQL(DataBaseScript.INSERT_CANTON_SCRIPT);
        db.execSQL(DataBaseScript.INSERT_PARRO_SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            /*  Añade los cambios que se realizarán en el esquema
                en tu proxima versión
             */
    }

}
