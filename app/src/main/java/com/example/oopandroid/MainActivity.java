package com.example.oopandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txtName, txtUTS, txtUAS, txtTugas;
    private Button btnProses;
    private TextView txtHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.textNama);
        txtUTS = findViewById(R.id.textUTS);
        txtUAS = findViewById(R.id.textUAS);
        txtTugas = findViewById(R.id.textTugas);
        btnProses = findViewById(R.id.btnProses);
        btnProses.setOnClickListener(this);
        txtHasil = findViewById(R.id.textHasil);
    }

    @Override
    public void onClick(View view) {
        if(view == btnProses) {
            Siswa s = new Siswa();
            s.setNama(txtName.getText().toString());
            s.setUts(Double.parseDouble(txtUTS.getText().toString()));
            s.setUas(Double.parseDouble(txtUAS.getText().toString()));
            s.setTugas(Double.parseDouble(txtTugas.getText().toString()));
            double hasil = s.getNA();
            txtHasil.setText("Hasil : " + hasil);

        }

    }
}