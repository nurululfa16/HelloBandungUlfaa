package com.example.hellobandung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBack, btnFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);
        btnFoto = findViewById(R.id.btn_foto);
        btnFoto.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                finish();
                break;
            case R.id.btn_foto:
                startActivity(new Intent(this, FotoActivity.class));
                break;

        }
    }
}
