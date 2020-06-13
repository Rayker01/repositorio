package com.example.aplicacionproyectoale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registro extends AppCompatActivity {
    EditText editcedula, editnombre, editape, editedad, ediddiscapa, editcelu;
    Button btnguardar, btncomenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editcedula = (EditText) findViewById(R.id.txtcedula);

        //Limitador de Caracteres
        InputFilter filter = new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) { if (!Character.isLetterOrDigit(source.charAt(i))) { return "10"; } }
                return null; } }; editcedula.setFilters(new InputFilter[] { filter });

        editnombre = (EditText) findViewById(R.id.txtdisca);
        editape = (EditText) findViewById(R.id.txtnombres);
        editedad = (EditText) findViewById(R.id.txtape);

        InputFilter filter2 = new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) { if (!Character.isLetterOrDigit(source.charAt(i))) { return "3"; } }
                return null; } }; editcedula.setFilters(new InputFilter[] { filter2 });

        editcelu = (EditText) findViewById(R.id.txtedad);

        //Limitador de Caracteres
        InputFilter filter1 = new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) { if (!Character.isLetterOrDigit(source.charAt(i))) { return "10"; } }
                return null; } }; editcelu.setFilters(new InputFilter[] { filter1 });

        ediddiscapa = (EditText) findViewById(R.id.txtcelular);



        btnguardar = (Button) findViewById(R.id.btn_guardarinfo);
        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               limpiar();
               enablebutton();
            }
        });

        btncomenzar = (Button) findViewById(R.id.btn_comenzarpru);
        btncomenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro.this, eleccion.class);
            }
        });

    }
public void enablebutton(){
       btncomenzar.setEnabled(false);
       btnguardar.setEnabled(true);
}
public void limpiar(){
        editcedula.setText("");
        editnombre.setText("");
        editape.setText("");
        editedad.setText("");
        editcelu.setText("");
        ediddiscapa.setText("");
}
}
