package com.example.tp4_exo2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PaiementCarte extends DialogFragment {
    private TextView nom, prenom, numéro_carte, code_cvc, date_expiration;
    private EditText input_name,input_prenom,input_carte,input_cvc,input_date;
    private PaiementCarteListener listener;
    private Button btn;



    public PaiementCarte() {
        // le fragment est créé par la méthode newInstance
    }

    public static PaiementCarte newInstance(String title) {

        PaiementCarte frag = new PaiementCarte();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_carte, container);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listener = (PaiementCarteListener) getActivity();
        /**nom = view.findViewById(R.id.edit_name);*/
        nom = view.findViewById(R.id.lbl_your_name);
        input_name = view.findViewById(R.id.txt_your_name);
        prenom = view.findViewById(R.id.lbl_your_name1);
        input_prenom = view.findViewById(R.id.txt_your_name1);
        numéro_carte = view.findViewById(R.id.lbl_your_name2);
        input_carte = view.findViewById(R.id.txt_your_name2);
        code_cvc = view.findViewById(R.id.lbl_your_name3);
        input_cvc = view.findViewById(R.id.txt_your_name3);
        date_expiration = view.findViewById(R.id.lbl_your_name4);
        input_date = view.findViewById(R.id.txt_your_name4);
        btn = (Button) view.findViewById(R.id.ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOkClickDialog(input_name.getText().toString());
            }
        });
       // numéro_carte = view.findViewById(R.id.lbl_your_name1);
        //code_cvc = view.findViewById(R.id.lbl_your_name2);
        //date_expiration = view.findViewById(R.id.lbl_your_name3);
    }




}

