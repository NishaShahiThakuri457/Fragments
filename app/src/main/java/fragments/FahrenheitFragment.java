package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.e.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FahrenheitFragment extends Fragment implements View.OnClickListener{

private Button btnfah;
private EditText etcel,etrlt;

    public FahrenheitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_fahrenheit,container,false);

        etcel=view.findViewById(R.id.etcel);
        etrlt=view.findViewById(R.id.etrlt);
        btnfah=view.findViewById(R.id.btnfah);

        btnfah.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float cel=Float.parseFloat(etcel.getText().toString());
        float result=(cel*1.8f)+32;
        etrlt.setText(Float.toString(result));
    }

}
