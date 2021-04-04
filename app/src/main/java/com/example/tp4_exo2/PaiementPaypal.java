package com.example.tp4_exo2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PaiementPaypal extends DialogFragment {
    private TextView pseudo , mot_passe;
    private EditText input_pseudo,input_passe;
    private PaiementPaypalListener listener;
    private Button btn;



    public PaiementPaypal() {
        // le fragment est créé par la méthode newInstance
    }

    public static PaiementPaypal newInstance(String title) {

        PaiementPaypal frag = new PaiementPaypal();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_paypal, container);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listener = (PaiementPaypalListener) getActivity();
        pseudo = view.findViewById(R.id.pseudo);
        input_pseudo = view.findViewById(R.id.pseudo1);
        mot_passe = view.findViewById(R.id.mot_passe);
        input_passe = view.findViewById(R.id.mot_passe1);
        btn = (Button) view.findViewById(R.id.valide);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOkClickDialog1(input_pseudo.getText().toString());
            }
        });

    }




}
