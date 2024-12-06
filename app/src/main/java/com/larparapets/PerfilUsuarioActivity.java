
package com.larparapets;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class PerfilUsuarioActivity extends AppCompatActivity {

    private TextView nomeCompleto;
    private TextView username;
    private TextView petsAdotados;
    private TextView petsPatrocinados;
    private TextView horasVoluntariado;
    private Switch voluntariadoSwitch;
    private Switch notificacoesSwitch;
    private ImageView perfilImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        nomeCompleto = findViewById(R.id.nomeCompleto);
        username = findViewById(R.id.username);
        petsAdotados = findViewById(R.id.petsAdotados);
        petsPatrocinados = findViewById(R.id.petsPatrocinados);
        horasVoluntariado = findViewById(R.id.horasVoluntariado);
        voluntariadoSwitch = findViewById(R.id.voluntariadoSwitch);
        notificacoesSwitch = findViewById(R.id.notificacoesSwitch);
        perfilImage = findViewById(R.id.perfilImage);

        // Set initial values
        nomeCompleto.setText("Maria Silva");
        username.setText("@mariasilva");
        petsAdotados.setText("2");
        petsPatrocinados.setText("3");
        horasVoluntariado.setText("50");
        voluntariadoSwitch.setChecked(true);
        notificacoesSwitch.setChecked(true);
    }
}