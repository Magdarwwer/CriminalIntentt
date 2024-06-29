package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CrimeFragment extends Fragment {

    private Button crimeDateButton;
    private CheckBox crimeSolvedCheckBox;
    private EditText crimeTitleEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        crimeDateButton = view.findViewById(R.id.crime_date);
        crimeSolvedCheckBox = view.findViewById(R.id.crime_solved);
        crimeTitleEditText = view.findViewById(R.id.crime_title);

        // Set a click listener on the button
        crimeDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click event
                Toast.makeText(getActivity(), "Button clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
