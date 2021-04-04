package com.example.tp4_exo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements PaiementCarteListener,PaiementPaypalListener{

    Button PaiementPaypal1;
    Button PaiementCartes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PaiementCartes = findViewById(R.id.button);
        PaiementPaypal1 = findViewById(R.id.button2);

        PaiementCartes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager carte = getSupportFragmentManager();
                PaiementCarte paiementCarte = PaiementCarte.newInstance("Titre");
                paiementCarte.show(carte,"fragment_carte");

            }
        });

        PaiementPaypal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager paypal = getSupportFragmentManager();
                PaiementPaypal PaiementPaypal = com.example.tp4_exo2.PaiementPaypal.newInstance("Titre");
                PaiementPaypal.show(paypal,"fragment_carte");

            }
        });

    }

    public void onOkClickDialog(String nom) {
        Toast.makeText(this, "Hi, " + nom, Toast.LENGTH_SHORT).show();
    }

    public void onOkClickDialog1(String pseudo) {
        Toast.makeText(this, "Hi, " +pseudo, Toast.LENGTH_SHORT).show();
    }


}