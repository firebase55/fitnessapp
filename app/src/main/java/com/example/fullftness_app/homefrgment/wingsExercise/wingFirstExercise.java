package com.example.fullftness_app.homefrgment.wingsExercise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.fullftness_app.R;

public class wingFirstExercise extends Fragment
{
    private CardView wing1;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.wing_allexercise,container,false);
        wing1 = (CardView) view.findViewById(R.id.wing_id);
        wing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                wingFirstExerciseClass wingFirstExercise = new wingFirstExerciseClass();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fr, wingFirstExercise, "newframe")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}
