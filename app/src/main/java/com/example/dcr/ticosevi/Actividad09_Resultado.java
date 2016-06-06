package com.example.dcr.ticosevi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Actividad09_Resultado extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad09__resultado);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nota();
        DialogoSiNo(findViewById(R.id.btndialogo));

        findViewById(R.id.button34).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Preguntas vg = Preguntas.getInstance();
                vg.reiniciar();

                startActivity(new Intent(Actividad09_Resultado.this, Actividad02.class));
            }
        });
    }

    public void nota() {
        Preguntas vg = Preguntas.getInstance();
        TextView tVBuenas = (TextView) findViewById(R.id.textView27);
        tVBuenas.setText(vg.getBuenas() + "0");

    }

    public void DialogoSiNo(View view) {
        Preguntas vg = Preguntas.getInstance();
        if (vg.getBuenas() >= 8) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(view.getContext());
            builder1.setMessage("Felicitaciones, ya estas listo para realizar la prueba " +
                    "teórica. ¿Deseas visitar la página del COSEVI para realizar el pago de tu prueba?");
            builder1.setCancelable(true);
            builder1.setPositiveButton("Si",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            Preguntas vg = Preguntas.getInstance();
                            vg.reiniciar();

                            WebView webView = (WebView) findViewById(R.id.webView2);
                            webView.setWebViewClient(new Callback());
                            WebSettings webSettings = webView.getSettings();
                            webSettings.setBuiltInZoomControls(true);
                            webView.loadUrl("https://www.csv.go.cr/matricula-de-pruebas-teoricas-y-practicas-licencias");
                        }
                    });
            builder1.setNegativeButton("No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Preguntas vg = Preguntas.getInstance();
                            vg.reiniciar();

                            TextView msm = (TextView) findViewById(R.id.textView22);
                            msm.setText( "");


                            TextView tVBuenas = (TextView) findViewById(R.id.textView27);
                            tVBuenas.setText( "¡HASTA PRONTO!");
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();
        } else {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(view.getContext());
            builder1.setMessage("Oops, al parecer necesitas un poco más de preparación. " +
                    "¿Deseas estudiar para la prueba nuevamente?");
            builder1.setCancelable(true);
            builder1.setPositiveButton("Si",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Preguntas vg = Preguntas.getInstance();
                            vg.reiniciar();

                            Intent intento = new Intent(getApplicationContext(), Actividad10_Estudiar.class);
                            startActivity(intento);
                        }
                    });
            builder1.setNegativeButton("No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            Preguntas vg = Preguntas.getInstance();
                            vg.reiniciar();

                            TextView msm = (TextView) findViewById(R.id.textView22);
                            msm.setText( "");


                            TextView tVBuenas = (TextView) findViewById(R.id.textView27);
                            tVBuenas.setText( "¡HASTA PRONTO!");
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();

        }
    }

    ;

    class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }
    }
}
