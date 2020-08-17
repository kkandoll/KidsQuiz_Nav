package com.example.kidsquiz_nav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.NumberPicker;

public class FragmentHome extends Fragment {

    private NumberPicker AgePicker;
    private NumberPicker MinPicker;
    private NumberPicker SecPicker;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_home, container, false);
//
//        AgePicker = findViewById(R.id.numberpicker_age_picker);
//        MinPicker = findViewById(R.id.numberpicker_min_picker);
//        SecPicker = findViewById(R.id.numberpicker_sec_picker);
//
//        AgePicker.setMinValue(0);
//        AgePicker.setMaxValue(8);
//        MinPicker.setMinValue(0);
//        MinPicker.setMaxValue(60);
//        SecPicker.setMinValue(0);
//        SecPicker.setMaxValue(60);

//        AgePicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//            @Override
//            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
//                int valueAgePicker = AgePicker.getValue();
//            }
//        });
//
//        MinPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//            @Override
//            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
//                int valueAgePicker = MinPicker.getValue();
//            }
//        });
//
//        SecPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//            @Override
//            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
//                int valueAgePicker = SecPicker.getValue();
//            }
//        });

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}