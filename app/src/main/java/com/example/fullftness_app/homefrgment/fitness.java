package com.example.fullftness_app.homefrgment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.fullftness_app.R;
import com.example.fullftness_app.homefrgment.wingsExercise.wingFirstExercise;

public class fitness extends Fragment
{
   private View view;
   private CardView chest_Button;
   private CardView wing_button1;
    public fitness() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fitness,container,false);
      //  chest_Button = (CardView) view.findViewById(R.id.chest_id);
        wing_button1 = (CardView) view.findViewById(R.id.wing_id);
//        chest_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                otherActivity nextFrag= new otherActivity();
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fr, nextFrag, "nextfrgment")
//                        .addToBackStack(null)
//                        .commit();
//            }
//
//
//
//        });
      //   wings frgment1 open code
        wing_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                wingFirstExercise wingFirstExercise = new wingFirstExercise();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fr, wingFirstExercise, "newframe")
                        .addToBackStack(null)
                        .commit();

            }
        });

        return view;
    }


}
