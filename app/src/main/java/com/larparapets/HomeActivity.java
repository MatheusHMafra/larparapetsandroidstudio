
package com.larparapets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class HomeActivity extends AppCompatActivity {

    private EditText searchEditText;
    private LinearLayout ongContainer;
    private LinearLayout foundLostPetsContainer;
    private ImageView favoriteIcon;
    private ImageView homeIcon;
    private ImageView profileIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        searchEditText = findViewById(R.id.searchEditText);
        ongContainer = findViewById(R.id.ongContainer);
        foundLostPetsContainer = findViewById(R.id.foundLostPetsContainer);
        favoriteIcon = findViewById(R.id.favoriteIcon);
        homeIcon = findViewById(R.id.homeIcon);
        profileIcon = findViewById(R.id.profileIcon);

        searchEditText.setHint("Buscar");

        addOngImage("https://adotar.com.br/uploadadm/logo_ong1689.jpg");
        addOngImage("https://adotar.com.br/uploadadm/logo_ong1277.jpg");

        foundLostPetsContainer.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, AchadosPerdidosActivity.class);
            startActivity(intent);
        });

        favoriteIcon.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, PetsFavoritosActivity.class);
            startActivity(intent);
        });

        profileIcon.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, PerfilUsuarioActivity.class);
            startActivity(intent);
        });
    }

    private void addOngImage(String imageUrl) {
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground));
        ongContainer.addView(imageView);
    }
}