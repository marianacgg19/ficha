package com.example.mariana.predial;

import android.app.Activity;
import android.provider.BaseColumns;

import java.util.HashMap;
import java.util.List;

/**
 * Creado por Hermosa Programación
 */
public class DataBaseScript {

    //Metainformación de la base de datos
    public static final String DATABASE_NAME = "rural.sqlite";
    public static final int DATABASE_VERSION = 1;
    public static final String STRING_TYPE = "text";
    public static final String INT_TYPE = "integer";


    /*
    Nombres de las tablas
     */
    public static final String PROVINCIA_TABLE_NAME = "PROVINCIA";
    public static final String CANTON_TABLE_NAME = "CANTON";
        public static final String PARRO_TABLE_NAME = "PARROQUIA";


    /*
    Nombres de los campos de las tablas
     */
    public static class ProvinciaColumns {
        public static final String ID_PROV = BaseColumns._ID;
        public static final String NAME_PROVI = "Nombre";
    }

    public static class ArtistColumns {
        public static final String ID_Canton = BaseColumns._ID;
        public static final String NAME_CANTON = "Nombre";
           public static final String COD_CANTON = "Codigo_Canton";
        public static final String CODIGO = "Codigo_Provincia";
    }
        public static class ParroColumns {
                public static final String ID_PARRO = BaseColumns._ID;
                public static final String NAME_PARRO = "Nombre";
                public static final String COD_PARRO = "Codigo_Parroquia";
                public static final String COD_CANTON = "Codigo_Canton";
                public static final String CODIGO = "Codigo";
        }


    /*
    Sentencia SQL para la creación de las tablas
     */
    public static final String CREATE_GENRES_SCRIPT =
            "create table " + PROVINCIA_TABLE_NAME + "(" +
                    ProvinciaColumns.ID_PROV + " " + INT_TYPE + " primary key," +
                    ProvinciaColumns.NAME_PROVI + " " + STRING_TYPE + " not null)";

    public static final String CREATE_ARTISTS_SCRIPT =
            "create table " + CANTON_TABLE_NAME + "(" +
                    ArtistColumns.ID_Canton + " " + INT_TYPE + " primary key autoincrement," +
                    ArtistColumns.NAME_CANTON + " " + STRING_TYPE + " not null, " +
                   ArtistColumns.COD_CANTON + " " + STRING_TYPE + " not null, " +
                    ArtistColumns.CODIGO + " " + INT_TYPE + " not null," +
                    "foreign key(" + ArtistColumns.CODIGO + ") " +
                    "references " + PROVINCIA_TABLE_NAME + "(" + ProvinciaColumns.ID_PROV + "))";


        public static final String CREATE_PARRO_SCRIPT =
                "create table " + PARRO_TABLE_NAME + "(" +
                        ParroColumns.ID_PARRO + " " + INT_TYPE + " primary key autoincrement," +
                        ParroColumns.NAME_PARRO + " " + STRING_TYPE + " not null, " +
                        ParroColumns.COD_PARRO + " " + STRING_TYPE + " not null, " +
                        ParroColumns.COD_CANTON + " " + STRING_TYPE + " not null, " +
                        ParroColumns.CODIGO + " " + INT_TYPE + " not null," +
                        "foreign key(" + ParroColumns.CODIGO + ") " +
                        "references " + PROVINCIA_TABLE_NAME + "(" + ProvinciaColumns.ID_PROV + "))";
        //********************************************************************************************************
    /*
    Valores para la inserción de los Géneros
     */
    public static final String[] ProvinciaValues = new String[]{
            "AZUAY", "BOLIVAR", "CAÑAR", "CARCHI", "COTOPAXI", "CHIMBORAZO", "EL ORO", "ESMERALDAS", "GUAYAS", "IMBABURA", "LOJA", "LOS RIOS"
            , "MANABI", "MORONA SANTIAGO", "NAPO", "PASTAZA", "PICHINCHA", "TUNGURAHUA", "ZAMORA CHINCHIPE", "GALAPAGOS", "SUCUMBIOS"
            , "ORELLANA", "SANTO DOMINGO DE LOS TSACHILAS", "SANTA ELENA"
    };
    public static final String[] CantonValues = new String[]{
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24","25"
    };

    /*
    Sentencia SQL para la inserción de Provincia
     */
    public static final String INSERT_PROVINCIA_SCRIPT =
            "insert into "+PROVINCIA_TABLE_NAME+" values " +
                    "("+CantonValues[0]+",\""+ProvinciaValues[0]+"\")," +
                    "("+CantonValues[1]+",\""+ProvinciaValues[1]+"\")," +
                    "("+CantonValues[2]+",\""+ProvinciaValues[2]+"\")," +
                    "("+CantonValues[3]+",\""+ProvinciaValues[3]+"\"),"+
                    "("+CantonValues[4]+",\""+ProvinciaValues[4]+"\"),"+
                    "("+CantonValues[5]+",\""+ProvinciaValues[5]+"\")," +
                    "("+CantonValues[6]+",\""+ProvinciaValues[6]+"\")," +
                    "("+CantonValues[7]+",\""+ProvinciaValues[7]+"\")," +
                    "("+CantonValues[8]+",\""+ProvinciaValues[8]+"\"),"+
                    "("+CantonValues[9]+",\""+ProvinciaValues[9]+"\"),"+
                    "("+CantonValues[10]+",\""+ProvinciaValues[10]+"\")," +
                    "("+CantonValues[11]+",\""+ProvinciaValues[11]+"\")," +
                    "("+CantonValues[12]+",\""+ProvinciaValues[12]+"\")," +
                    "("+CantonValues[13]+",\""+ProvinciaValues[13]+"\")," +
                    "("+CantonValues[14]+",\""+ProvinciaValues[14]+"\")," +
                    "("+CantonValues[15]+",\""+ProvinciaValues[15]+"\")," +
                    "("+CantonValues[16]+",\""+ProvinciaValues[16]+"\")," +
                    "("+CantonValues[17]+",\""+ProvinciaValues[17]+"\")," +
                    "("+CantonValues[18]+",\""+ProvinciaValues[18]+"\"),"+
                    "("+CantonValues[19]+",\""+ProvinciaValues[19]+"\"),"+
                    "("+CantonValues[20]+",\""+ProvinciaValues[20]+"\")," +
                    "("+CantonValues[21]+",\""+ProvinciaValues[21]+"\")," +
                    "("+CantonValues[22]+",\""+ProvinciaValues[22]+"\")," +
                     "("+CantonValues[23]+",\""+ProvinciaValues[23]+"\")";
            ;

//*******************************************************************************************************
    /*
    Valores par la inserción de los Cantones
     */
    public static final String[] azuayCanton = new String[]{
            "CUENCA","GIRÓN","GUALACEO","NABÓN","PAUTE","PUCARA","SAN FERNANDO","SANTA ISABEL",
            "SIGSIG","OÑA","CHORDELEG","EL PAN","SEVILLA DE ORO","GUACHAPALA","CAMILO PONCE ENRÍQUEZ"
    };
    public static final String[] bolivarCanton = new String[]
            {
                    "GUARANDA","CHILLANES","CHIMBO","ECHEANDÍA","SAN MIGUEL","CALUMA","LAS NAVES"

            };
    public static final String[] cañarCanton =new String[]
            {
                    "AZOGUES","BIBLIÁN","CAÑAR","LA TRONCAL","EL TAMBO","DÉLEG","SUSCAL"

            };
    public static final String[] carchiCanton =new String[]
            {
                    "TULCÁN","BOLÍVAR","ESPEJO","MIRA","MONTÚFAR","SAN PEDRO DE HUACA"


            };
    public static final String[] cotopaxiCanton = new String[]
            {
                    "LATACUNGA","LA MANÁ","PANGUA","PUJILI","SALCEDO","SAQUISILÍ","CANTÒN SIGCHOS"

            };

    public static final String[] chimborazoCanton = new String[]
            {
                    "RIOBAMBA","ALAUSI","COLTA","CHAMBO","CHUNCHI","GUAMOTE","GUANO","PALLATANGA","PENIPE","CUMANDÁ"

            };
    public static final String[] eloroCanton = new String[]
            {
                    "ARENILLAS","ATAHUALPA","BALSAS","CHILLA","EL GUABO","HUAQUILLAS","MARCABELÍ","PASAJE","PIÑAS","PORTOVELO","SANTA ROSA","ZARUMA","LAS LAJAS"

            };
    public static final String[] esmeraldasCanton = new String[]
            {
                    "ESMERALDAS","ELOY ALFARO","MUISNE","QUININDÉ","SAN LORENZO","ATACAMES","RIOVERDE","LA CONCORDIA"


            };
    public static final String[] guayasCanton = new String[]
            {
                    "GUAYAQUIL","ALFREDO BAQUERIZO MORENO (JUJÁN)","BALAO","BALZAR","COLIMES",
                    "DAULE","DURÁN","EL EMPALME","EL TRIUNFO","MILAGRO","NARANJAL","NARANJITO",
                    "PALESTINA","PEDRO CARBO","SAMBORONDÓN","SANTA LUCÍA","SALITRE (URBINA JADO)",
                    "SAN JACINTO DE YAGUACHI","PLAYAS","SIMÓN BOLÍVAR","CORONEL MARCELINO MARIDUEÑA","LOMAS DE SARGENTILLO",
                    "NOBOL","GENERAL ANTONIO ELIZALDE","ISIDRO AYORA"
            };
    public static final String[] imbaburaCanton = new String[]
            {
                    "IBARRA","ANTONIO ANTE","COTACACHI","OTAVALO","PIMAMPIRO","SAN MIGUEL DE URCUQUÍ"
            };
    public static final String[] lojaCanton = new String[]
            {
                    "LOJA","CALVAS","CATAMAYO  ","CELICA","CHAGUARPAMBA","ESPÍNDOLA","GONZANAMÁ","MACARÁ","PALTAS","PUYANGO","SARAGURO","SOZORANGA","ZAPOTILLO","PINDAL","QUILANGA","OLMEDO"

            };
    public static final String[] losriosCanton = new String[]
            {
                    "BABAHOYO","BABA","MONTALVO","PUEBLOVIEJO","QUEVEDO","URDANETA","VENTANAS","VÍNCES","PALENQUE","BUENA FÉ","VALENCIA","MOCACHE","QUINSALOMA"

            };
    public static final String[] manabiCanton = new String[]
            {
                    "PORTOVIEJO","BOLÍVAR","CHONE","EL CARMEN","FLAVIO ALFARO","JIPIJAPA","JUNÍN",
                    "MANTA","MONTECRISTI","PAJÁN","PICHINCHA","ROCAFUERTE","SANTA ANA","SUCRE","TOSAGUA",
                    "24 DE MAYO","PEDERNALES","OLMEDO","PUERTO LÓPEZ","JAMA","JARAMIJÓ","SAN VICENTE"


            };
    public static final String[] moronaCanton = new String[]
            {
                    "MORONA","GUALAQUIZA","LIMÓN INDANZA","PALORA","SANTIAGO",
                    "SUCUA","HUAMBOYA","SAN JUAN BOSCO","TAISHA","LOGROÑO","PABLO SEXTO","CANTON TIWINTZA"
            };
    public static final String[] napoCanton = new String[]
            {
                    "TENA","ARCHIDONA","EL CHACO","QUIJOS","CARLOS JULIO AROSEMENA TOLA"
            };
    public static final String[] pastazaCanton = new String[]
            {
                    "PASTAZA","MERA","SANTA CLARA","ARAJUNO"

            };
    public static final String[] pichinchaCanton = new String[]
            {
                    "QUITO","CAYAMBE","MEJIA","PEDRO MONCAYO","RUMIÑAHUI","SAN MIGUEL DE LOS BANCOS","PEDRO VICENTE MALDONADO","PUERTO QUITO"

            };
    public static final String[] tungurahuaCanton = new String[]
            {
                    "AMBATO","BAÑOS DE AGUA SANTA","CEVALLOS","MOCHA","PATATE","QUERO","SAN PEDRO DE PELILEO","SANTIAGO DE PÍLLARO","TISALEO"

            };
    public static final String[] zamorachinchipeCanton = new String[]
            {
                    "ZAMORA","CHINCHIPE","NANGARITZA","YACUAMBI","YANTZAZA (YANZATZA)","EL PANGUI","CENTINELA DEL CÓNDOR","PALANDA","PAQUISHA"

            };
    public static final String[] galapagosCanton = new String[]
            {
                    "SAN CRISTÓBAL","ISABELA","SANTA CRUZ"

            };
    public static final String[] sucumbiosCanton = new String[]
            {
                    "LAGO AGRIO","GONZALO PIZARRO","PUTUMAYO","SHUSHUFINDI","SUCUMBÍOS","CASCALES","CUYABENO"

            };
    public static final String[] orellanaCanton = new String[]
            {
                    "ORELLANA","AGUARICO","LA JOYA DE LOS SACHAS","LORETO"

            };
    public static final String[] santodomingotsachilasCanton = new String[]
            {
                    "SANTO DOMINGO"
            };
    public static final String[] santaelenaCanton = new String[]
            {
                    "SANTA ELENA","LA LIBERTAD","SALINAS"

            };
//*******************************************************************************************************
    /*
    Sentencia SQL para la inserción de Artistas
     */
    public static final String INSERT_CANTON_SCRIPT =
            "insert into "+CANTON_TABLE_NAME+" values " +
                    "(null,\""+azuayCanton[0]+"\","+CantonValues[0]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[1]+"\","+CantonValues[1]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[2]+"\","+CantonValues[2]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[3]+"\","+CantonValues[3]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[4]+"\","+CantonValues[4]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[5]+"\","+CantonValues[5]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[6]+"\","+CantonValues[6]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[7]+"\","+CantonValues[7]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[8]+"\","+CantonValues[8]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[9]+"\","+CantonValues[9]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[10]+"\","+CantonValues[10]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[11]+"\","+CantonValues[11]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[12]+"\","+CantonValues[12]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[13]+"\","+CantonValues[13]+","+CantonValues[0]+"),"+
                    "(null,\""+azuayCanton[14]+"\","+CantonValues[14]+","+CantonValues[0]+"),"+

                    "(null,\""+bolivarCanton[0]+"\","+CantonValues[0]+","+CantonValues[1]+"),"+
                    "(null,\""+bolivarCanton[1]+"\","+CantonValues[1]+","+CantonValues[1]+"),"+
                    "(null,\""+bolivarCanton[2]+"\","+CantonValues[2]+","+CantonValues[1]+"),"+
                    "(null,\""+bolivarCanton[3]+"\","+CantonValues[3]+","+CantonValues[1]+"),"+
                    "(null,\""+bolivarCanton[4]+"\","+CantonValues[4]+","+CantonValues[1]+"),"+
                    "(null,\""+bolivarCanton[5]+"\","+CantonValues[5]+","+CantonValues[1]+"),"+
                    "(null,\""+bolivarCanton[6]+"\","+CantonValues[6]+","+CantonValues[1]+"),"+

                    "(null,\""+cañarCanton[0]+"\","+CantonValues[0]+","+CantonValues[2]+"),"+
                    "(null,\""+cañarCanton[1]+"\","+CantonValues[1]+","+CantonValues[2]+"),"+
                    "(null,\""+cañarCanton[2]+"\","+CantonValues[2]+","+CantonValues[2]+"),"+
                    "(null,\""+cañarCanton[3]+"\","+CantonValues[3]+","+CantonValues[2]+"),"+
                    "(null,\""+cañarCanton[4]+"\","+CantonValues[4]+","+CantonValues[2]+"),"+
                    "(null,\""+cañarCanton[5]+"\","+CantonValues[5]+","+CantonValues[2]+"),"+
                    "(null,\""+cañarCanton[6]+"\","+CantonValues[6]+","+CantonValues[2]+"),"+

                    "(null,\""+carchiCanton[0]+"\","+CantonValues[0]+","+CantonValues[3]+"),"+
                    "(null,\""+carchiCanton[1]+"\","+CantonValues[1]+","+CantonValues[3]+"),"+
                    "(null,\""+carchiCanton[2]+"\","+CantonValues[2]+","+CantonValues[3]+"),"+
                    "(null,\""+carchiCanton[3]+"\","+CantonValues[3]+","+CantonValues[3]+"),"+
                    "(null,\""+carchiCanton[4]+"\","+CantonValues[4]+","+CantonValues[3]+"),"+
                    "(null,\""+carchiCanton[5]+"\","+CantonValues[5]+","+CantonValues[3]+"),"+

                    "(null,\""+cotopaxiCanton[0]+"\","+CantonValues[0]+","+CantonValues[4]+"),"+
                    "(null,\""+cotopaxiCanton[1]+"\","+CantonValues[1]+","+CantonValues[4]+"),"+
                    "(null,\""+cotopaxiCanton[2]+"\","+CantonValues[2]+","+CantonValues[4]+"),"+
                    "(null,\""+cotopaxiCanton[3]+"\","+CantonValues[3]+","+CantonValues[4]+"),"+
                    "(null,\""+cotopaxiCanton[4]+"\","+CantonValues[4]+","+CantonValues[4]+"),"+
                    "(null,\""+cotopaxiCanton[5]+"\","+CantonValues[5]+","+CantonValues[4]+"),"+
                    "(null,\""+cotopaxiCanton[6]+"\","+CantonValues[6]+","+CantonValues[4]+"),"+

                    "(null,\""+chimborazoCanton[0]+"\","+CantonValues[0]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[1]+"\","+CantonValues[1]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[2]+"\","+CantonValues[2]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[3]+"\","+CantonValues[3]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[4]+"\","+CantonValues[4]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[5]+"\","+CantonValues[5]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[6]+"\","+CantonValues[6]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[7]+"\","+CantonValues[7]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[8]+"\","+CantonValues[8]+","+CantonValues[5]+"),"+
                    "(null,\""+chimborazoCanton[9]+"\","+CantonValues[9]+","+CantonValues[5]+"),"+

                    "(null,\""+eloroCanton[0]+"\","+CantonValues[0]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[1]+"\","+CantonValues[1]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[2]+"\","+CantonValues[2]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[3]+"\","+CantonValues[3]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[4]+"\","+CantonValues[4]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[5]+"\","+CantonValues[5]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[6]+"\","+CantonValues[6]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[7]+"\","+CantonValues[7]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[8]+"\","+CantonValues[8]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[9]+"\","+CantonValues[9]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[10]+"\","+CantonValues[10]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[11]+"\","+CantonValues[11]+","+CantonValues[6]+"),"+
                    "(null,\""+eloroCanton[12]+"\","+CantonValues[12]+","+CantonValues[6]+"),"+

                    "(null,\""+esmeraldasCanton[0]+"\","+CantonValues[0]+","+CantonValues[7]+"),"+
                    "(null,\""+esmeraldasCanton[1]+"\","+CantonValues[1]+","+CantonValues[7]+"),"+
                    "(null,\""+esmeraldasCanton[2]+"\","+CantonValues[2]+","+CantonValues[7]+"),"+
                    "(null,\""+esmeraldasCanton[3]+"\","+CantonValues[3]+","+CantonValues[7]+"),"+
                    "(null,\""+esmeraldasCanton[4]+"\","+CantonValues[4]+","+CantonValues[7]+"),"+
                    "(null,\""+esmeraldasCanton[5]+"\","+CantonValues[5]+","+CantonValues[7]+"),"+
                    "(null,\""+esmeraldasCanton[6]+"\","+CantonValues[6]+","+CantonValues[7]+"),"+
                    "(null,\""+esmeraldasCanton[7]+"\","+CantonValues[7]+","+CantonValues[7]+"),"+

                    "(null,\""+guayasCanton[0]+"\","+CantonValues[0]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[1]+"\","+CantonValues[1]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[2]+"\","+CantonValues[2]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[3]+"\","+CantonValues[3]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[4]+"\","+CantonValues[4]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[5]+"\","+CantonValues[5]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[6]+"\","+CantonValues[6]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[7]+"\","+CantonValues[7]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[8]+"\","+CantonValues[8]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[9]+"\","+CantonValues[9]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[10]+"\","+CantonValues[10]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[11]+"\","+CantonValues[11]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[12]+"\","+CantonValues[12]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[13]+"\","+CantonValues[13]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[14]+"\","+CantonValues[14]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[15]+"\","+CantonValues[15]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[16]+"\","+CantonValues[16]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[17]+"\","+CantonValues[17]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[18]+"\","+CantonValues[18]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[19]+"\","+CantonValues[19]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[20]+"\","+CantonValues[20]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[21]+"\","+CantonValues[21]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[22]+"\","+CantonValues[22]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[23]+"\","+CantonValues[23]+","+CantonValues[8]+"),"+
                    "(null,\""+guayasCanton[24]+"\","+CantonValues[24]+","+CantonValues[8]+"),"+

                    "(null,\""+imbaburaCanton[0]+"\","+CantonValues[0]+","+CantonValues[9]+"),"+
                    "(null,\""+imbaburaCanton[1]+"\","+CantonValues[1]+","+CantonValues[9]+"),"+
                    "(null,\""+imbaburaCanton[2]+"\","+CantonValues[2]+","+CantonValues[9]+"),"+
                    "(null,\""+imbaburaCanton[3]+"\","+CantonValues[3]+","+CantonValues[9]+"),"+
                    "(null,\""+imbaburaCanton[4]+"\","+CantonValues[4]+","+CantonValues[9]+"),"+
                    "(null,\""+imbaburaCanton[5]+"\","+CantonValues[5]+","+CantonValues[9]+"),"+

                    "(null,\""+lojaCanton[0]+"\","+CantonValues[0]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[1]+"\","+CantonValues[1]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[2]+"\","+CantonValues[2]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[3]+"\","+CantonValues[3]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[4]+"\","+CantonValues[4]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[5]+"\","+CantonValues[5]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[6]+"\","+CantonValues[6]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[7]+"\","+CantonValues[7]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[8]+"\","+CantonValues[8]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[9]+"\","+CantonValues[9]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[10]+"\","+CantonValues[10]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[11]+"\","+CantonValues[11]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[12]+"\","+CantonValues[12]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[13]+"\","+CantonValues[13]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[14]+"\","+CantonValues[14]+","+CantonValues[10]+"),"+
                    "(null,\""+lojaCanton[15]+"\","+CantonValues[15]+","+CantonValues[10]+"),"+

                    "(null,\""+losriosCanton[0]+"\","+CantonValues[0]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[1]+"\","+CantonValues[1]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[2]+"\","+CantonValues[2]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[3]+"\","+CantonValues[3]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[4]+"\","+CantonValues[4]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[5]+"\","+CantonValues[5]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[6]+"\","+CantonValues[6]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[7]+"\","+CantonValues[7]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[8]+"\","+CantonValues[8]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[9]+"\","+CantonValues[9]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[10]+"\","+CantonValues[10]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[11]+"\","+CantonValues[11]+","+CantonValues[11]+"),"+
                    "(null,\""+losriosCanton[12]+"\","+CantonValues[12]+","+CantonValues[11]+"),"+

                    "(null,\""+manabiCanton[0]+"\","+CantonValues[0]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[1]+"\","+CantonValues[1]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[2]+"\","+CantonValues[2]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[3]+"\","+CantonValues[3]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[4]+"\","+CantonValues[4]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[5]+"\","+CantonValues[5]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[6]+"\","+CantonValues[6]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[7]+"\","+CantonValues[7]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[8]+"\","+CantonValues[8]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[9]+"\","+CantonValues[9]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[10]+"\","+CantonValues[10]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[11]+"\","+CantonValues[11]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[12]+"\","+CantonValues[12]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[13]+"\","+CantonValues[13]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[14]+"\","+CantonValues[14]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[15]+"\","+CantonValues[15]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[16]+"\","+CantonValues[16]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[17]+"\","+CantonValues[17]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[18]+"\","+CantonValues[18]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[19]+"\","+CantonValues[19]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[20]+"\","+CantonValues[20]+","+CantonValues[12]+"),"+
                    "(null,\""+manabiCanton[21]+"\","+CantonValues[21]+","+CantonValues[12]+"),"+

                    "(null,\""+moronaCanton[0]+"\","+CantonValues[0]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[1]+"\","+CantonValues[1]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[2]+"\","+CantonValues[2]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[3]+"\","+CantonValues[3]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[4]+"\","+CantonValues[4]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[5]+"\","+CantonValues[5]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[6]+"\","+CantonValues[6]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[7]+"\","+CantonValues[7]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[8]+"\","+CantonValues[8]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[9]+"\","+CantonValues[9]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[10]+"\","+CantonValues[10]+","+CantonValues[13]+"),"+
                    "(null,\""+moronaCanton[11]+"\","+CantonValues[11]+","+CantonValues[13]+"),"+

                    "(null,\""+napoCanton[0]+"\","+CantonValues[0]+","+CantonValues[14]+"),"+
                    "(null,\""+napoCanton[1]+"\","+CantonValues[1]+","+CantonValues[14]+"),"+
                    "(null,\""+napoCanton[2]+"\","+CantonValues[2]+","+CantonValues[14]+"),"+
                    "(null,\""+napoCanton[3]+"\","+CantonValues[3]+","+CantonValues[14]+"),"+
                    "(null,\""+napoCanton[4]+"\","+CantonValues[4]+","+CantonValues[14]+"),"+

                    "(null,\""+pastazaCanton[0]+"\","+CantonValues[0]+","+CantonValues[15]+"),"+
                    "(null,\""+pastazaCanton[1]+"\","+CantonValues[1]+","+CantonValues[15]+"),"+
                    "(null,\""+pastazaCanton[2]+"\","+CantonValues[2]+","+CantonValues[15]+"),"+
                    "(null,\""+pastazaCanton[3]+"\","+CantonValues[3]+","+CantonValues[15]+"),"+

                    "(null,\""+pichinchaCanton[0]+"\","+CantonValues[0]+","+CantonValues[16]+"),"+
                    "(null,\""+pichinchaCanton[1]+"\","+CantonValues[1]+","+CantonValues[16]+"),"+
                    "(null,\""+pichinchaCanton[2]+"\","+CantonValues[2]+","+CantonValues[16]+"),"+
                    "(null,\""+pichinchaCanton[3]+"\","+CantonValues[3]+","+CantonValues[16]+"),"+
                    "(null,\""+pichinchaCanton[4]+"\","+CantonValues[4]+","+CantonValues[16]+"),"+
                    "(null,\""+pichinchaCanton[5]+"\","+CantonValues[5]+","+CantonValues[16]+"),"+
                    "(null,\""+pichinchaCanton[6]+"\","+CantonValues[6]+","+CantonValues[16]+"),"+
                    "(null,\""+pichinchaCanton[7]+"\","+CantonValues[7]+","+CantonValues[16]+"),"+

                    "(null,\""+tungurahuaCanton[0]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[1]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[2]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[3]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[4]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[5]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[6]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[7]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+
                    "(null,\""+tungurahuaCanton[8]+"\","+CantonValues[0]+","+CantonValues[17]+"),"+

                    "(null,\""+zamorachinchipeCanton[0]+"\","+CantonValues[0]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[1]+"\","+CantonValues[1]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[2]+"\","+CantonValues[2]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[3]+"\","+CantonValues[3]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[4]+"\","+CantonValues[4]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[5]+"\","+CantonValues[5]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[6]+"\","+CantonValues[6]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[7]+"\","+CantonValues[7]+","+CantonValues[18]+"),"+
                    "(null,\""+zamorachinchipeCanton[8]+"\","+CantonValues[8]+","+CantonValues[18]+"),"+

                    "(null,\""+galapagosCanton[0]+"\","+CantonValues[0]+","+CantonValues[19]+"),"+
                    "(null,\""+galapagosCanton[1]+"\","+CantonValues[1]+","+CantonValues[19]+"),"+
                    "(null,\""+galapagosCanton[2]+"\","+CantonValues[2]+","+CantonValues[19]+"),"+

                    "(null,\""+sucumbiosCanton[0]+"\","+CantonValues[0]+","+CantonValues[20]+"),"+
                    "(null,\""+sucumbiosCanton[1]+"\","+CantonValues[1]+","+CantonValues[20]+"),"+
                    "(null,\""+sucumbiosCanton[2]+"\","+CantonValues[2]+","+CantonValues[20]+"),"+
                    "(null,\""+sucumbiosCanton[3]+"\","+CantonValues[3]+","+CantonValues[20]+"),"+
                    "(null,\""+sucumbiosCanton[4]+"\","+CantonValues[4]+","+CantonValues[20]+"),"+
                    "(null,\""+sucumbiosCanton[5]+"\","+CantonValues[5]+","+CantonValues[20]+"),"+
                    "(null,\""+sucumbiosCanton[6]+"\","+CantonValues[6]+","+CantonValues[20]+"),"+

                    "(null,\""+orellanaCanton[0]+"\","+CantonValues[0]+","+CantonValues[21]+"),"+
                    "(null,\""+orellanaCanton[1]+"\","+CantonValues[1]+","+CantonValues[21]+"),"+
                    "(null,\""+orellanaCanton[2]+"\","+CantonValues[2]+","+CantonValues[21]+"),"+
                    "(null,\""+orellanaCanton[3]+"\","+CantonValues[3]+","+CantonValues[21]+"),"+

                    "(null,\""+santodomingotsachilasCanton[0]+"\","+CantonValues[0]+","+CantonValues[22]+"),"+

                    "(null,\""+santaelenaCanton[0]+"\","+CantonValues[0]+","+CantonValues[23]+"),"+
                    "(null,\""+santaelenaCanton[1]+"\","+CantonValues[1]+","+CantonValues[23]+"),"+
                    "(null,\""+santaelenaCanton[2]+"\","+CantonValues[2]+","+CantonValues[23]+")";
        //******************************************************************************************
        public static final String[] cuencaParroquia = new String[]
                {
                        "SANTA ELENA","LA LIBERTAD","SALINAS"

                };
        public static final String INSERT_PARRO_SCRIPT =
                "insert into "+PARRO_TABLE_NAME+" values " +
                        "(null,\""+cuencaParroquia[0]+"\","+CantonValues[0]+","+CantonValues[0]+","+CantonValues[0]+"),"+
                        "(null,\""+cuencaParroquia[1]+"\","+CantonValues[1]+","+CantonValues[0]+","+CantonValues[0]+"),"+
                        "(null,\""+cuencaParroquia[2]+"\","+CantonValues[2]+","+CantonValues[0]+","+CantonValues[0]+")";
                      //  "(null,\""+santaelenaCanton[2]+"\","+CantonValues[2]+","+CantonValues[23]+")";


}