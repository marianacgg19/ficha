package com.example.mariana.predial;

        import android.app.Activity;
        import android.database.Cursor;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.SimpleCursorAdapter;
        import android.widget.Spinner;
        import android.widget.TextView;


public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener{

    /*
    Instancias para los Views
     */
    Spinner genreSpinner;
    Spinner artistSpinner;
    Spinner parroSpinner;
    TextView lyricList;

    /*
    Adaptadores para los Spinners
     */
    SimpleCursorAdapter genreSpinnerAdapter;
    SimpleCursorAdapter artistSpinnerAdapter;
    SimpleCursorAdapter parroSpinnerAdapter;

    /*
    Nuestro origen de datos
     */
    LyrikDataSource dataSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Iniciando nuestro origen de datos
         */
        dataSource = new LyrikDataSource(this);

        /*
        Obteniendo las instancias de los Spinners
         */
        genreSpinner = (Spinner)findViewById(R.id.GenreSpinner);
        artistSpinner =(Spinner)findViewById(R.id.ArtistSpinner);
        parroSpinner =(Spinner)findViewById(R.id.ParroSpinner);

        lyricList =(TextView)findViewById(R.id.LyricList);


        /*
        Creando Adaptador para GenreSpinner
         */
        genreSpinnerAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_spinner_item,//Layout simple
                dataSource.getAllGenres(),//Todos los registros
                new String[]{DataBaseScript.ProvinciaColumns.NAME_PROVI},//Mostrar solo el nombre
                new int[]{android.R.id.text1},//View para el nombre
                SimpleCursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);//Observer para el refresco



        /*
        Seteando Adaptador de GenreSpinner
         */
        genreSpinner.setAdapter(genreSpinnerAdapter);

        /*
        Relacionado la escucha de selección de GenreSpinner
         */
        genreSpinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        /*
        Obteniendo el id del Spinner que recibió el evento
         */
        int idSpinner = parent.getId();


        switch(idSpinner) {

            case R.id.GenreSpinner:
            /*
            Obteniendo el id del género seleccionado
             */
                Cursor c1 = (Cursor) parent.getItemAtPosition(position);
                String genreSelection = c1.getString(
                        c1.getColumnIndex(DataBaseScript.ProvinciaColumns.ID_PROV));

            /*
            Poblar el ArtistSpinner
             */
                activeArtistSpinner(genreSelection);

                break;

            case R.id.ArtistSpinner:
                /*
                Obteniendo el nombre del artista seleccionado
                 */
                Cursor c2 = (Cursor) parent.getItemAtPosition(position);
                String artistSelection = c2.getString(
                        c2.getColumnIndex(DataBaseScript.ArtistColumns.NAME_CANTON));

                /*
                Cambiando el texto de LyricList según el Artista seleccionado
                 */
                activeParroSpinner(artistSelection);


                break;
            case R.id.ParroSpinner:
            /*
            Obteniendo el id del género seleccionado
             */
                Cursor c3 = (Cursor) parent.getItemAtPosition(position);
                String parroSelection = c3.getString(
                        c3.getColumnIndex(DataBaseScript.ParroColumns.NAME_PARRO));

            /*
            Poblar el ArtistSpinner
             */

                lyricList.setText(getResources().getString(R.string.LyricList) + " " + parroSelection);
                break;
        }
    }

    private void activeArtistSpinner(String genreSelection) {
        /*
        Creando Adaptador para ArtistSpinner con el id del género
         */
        artistSpinnerAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_spinner_item,
                dataSource.getArtistsByGenre(genreSelection),
                new String[]{DataBaseScript.ArtistColumns.NAME_CANTON},
                new int[]{android.R.id.text1},
                SimpleCursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);

        /*
        Seteando el adaptador creado
         */
        artistSpinner.setAdapter(artistSpinnerAdapter);

        /*
        Relacionado la escucha
         */
        artistSpinner.setOnItemSelectedListener(this);

    }
    private void activeParroSpinner(String cantoSelection) {
        /*
        Creando Adaptador para ArtistSpinner con el id del género
         */
        parroSpinnerAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_spinner_item,
                dataSource.getParroByGenre(cantoSelection),
                new String[]{DataBaseScript.ParroColumns.NAME_PARRO},
                new int[]{android.R.id.text1},
                SimpleCursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);

        /*
        Seteando el adaptador creado
         */
        parroSpinner.setAdapter(parroSpinnerAdapter);

        /*
        Relacionado la escucha
         */
        parroSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        /*
        Nada por hacer
         */

    }
}
