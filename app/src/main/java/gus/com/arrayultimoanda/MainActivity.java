package gus.com.arrayultimoanda;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import static java.lang.reflect.Array.get;

public class MainActivity extends Activity {

    EditText texto;
    TextView texto2;
    int a = 0;
    String cadena3;
    String cadena2;
    String cadena;
    int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (EditText) findViewById(R.id.texto);
        texto2 = (TextView) findViewById(R.id.texto2);

    }

    public void Abre(View view) {
        Resources res = this.getResources();
        String[] Tipos_Opciones = res.getStringArray(R.array.TiposOpciones);
        String[] Tipos_Dos = res.getStringArray(R.array.TiposDos);

        i = 0;
        cadena2 = texto.getText().toString();
        cadena = (String) get(Tipos_Opciones, 0);
        cadena3 = (String) get(Tipos_Opciones, 0);

        for (int x = 0; x <= Tipos_Opciones.length; x++) {
            cadena = (String) get(Tipos_Opciones, i);
            cadena3 = (String) get(Tipos_Dos, i);
            i = i + 1;
            if (i == Tipos_Opciones.length) {
                texto2.setText("");
                break;
            } else {

                if (!cadena.equals(cadena2)) {

                    texto.setText("distinto");
                } else {

                    texto2.setText(cadena3);
                    break;
                }


            }
            texto.setText("salió del For");
        }

    }}

