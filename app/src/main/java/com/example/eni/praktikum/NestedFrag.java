package com.example.eni.praktikum;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by ENI on 6/7/2018.
 */

public class NestedFrag extends Fragment {
    public NestedFrag() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_nested, container, false);

        Button doNestingButton = (Button) root.findViewById(R.id.image_button);
        doNestingButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                try {
                    ((LeftFrag) getParentFragment()).setChangeableText("***I saw `cout’ being shifted 'Hello World' times to the left and stopped right there. (Steve Gonedes)***");
                } catch
                        (ClassCastException e)
                {
                    try {
                        ((RightFrag) getParentFragment()).setChangeableText("***That’s what’s cool about working with computers. They don’t argue, they remember everything, and they don’t drink all your beer. (Paul Leary)***");
                    } catch
                            (ClassCastException e1) {
                    }
                }
                    destroyFragment();
                }
            });
        return root;
        }
        private void destroyFragment() {
            getChildFragmentManager().beginTransaction().hide(this).commit();
        }
    }