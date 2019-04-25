package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CelsiusFragment extends Fragment implements View.OnClickListener{

    private Button btncelsius;
    private EditText etfah,etresult;

    public CelsiusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_celsius,container,false);

        etfah=view.findViewById(R.id.etfah);
        etresult=view.findViewById(R.id.etresult);
        btncelsius=view.findViewById(R.id.btncelsius);

        btncelsius.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float far=Float.parseFloat(etfah.getText().toString());
        float result=(far-32)*5/9;
        etresult.setText(Float.toString(result));

        Toast.makeText(getActivity(),"Fahrenheit into celsius is"+result,Toast.LENGTH_SHORT).show();


    }
}

