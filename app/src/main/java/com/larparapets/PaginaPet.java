
package com.larparapets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PaginaPet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_pet);

        ImageView petImage = findViewById(R.id.petImage);
        TextView petName = findViewById(R.id.petName);
        TextView petBreed = findViewById(R.id.petBreed);
        TextView petLocation = findViewById(R.id.petLocation);
        TextView petAge = findViewById(R.id.petAge);
        TextView petGender = findViewById(R.id.petGender);
        TextView petDescription = findViewById(R.id.petDescription);
        Button adoptButton = findViewById(R.id.adoptButton);

        // Set data
        petName.setText("Rex");
        petBreed.setText("Beagle");
        petLocation.setText("Itajaí-SC");
        petAge.setText("1 ano");
        petGender.setText("Macho");
        petDescription.setText("Rex é um adorável Labrador Retriever cheio de energia e amor para dar. Ele adora brincar ao ar livre, especialmente com bolas de tênis. Rex é muito sociável e se dá bem com crianças e outros animais. Ele está procurando por uma família amorosa que possa lhe dar muita atenção e exercícios regulares.");

        adoptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaPet.this, PaginaONG.class);
                startActivity(intent);
            }
        });
    }
}