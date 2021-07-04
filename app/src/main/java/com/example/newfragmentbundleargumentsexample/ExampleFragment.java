package com.example.newfragmentbundleargumentsexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExampleFragment extends Fragment {
    private static final String BUNDLE_TEXT_ARGUMENT = "BundleTextArgument";
//    private static final String BUNDLE_NUMBER_ARGUMENT = "BundleNumberArgument";

    private String text;
    private int number;

//    public static ExampleFragment newInstance(String text, int number) {
public static ExampleFragment newInstance(String text) {
        ExampleFragment fragment = new ExampleFragment();
        Bundle args = new Bundle();
        args.putString(BUNDLE_TEXT_ARGUMENT, text);
//        args.putInt(BUNDLE_NUMBER_ARGUMENT, number);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.example_fragment, container, false);
        TextView textView = v.findViewById(R.id.text_view_fragment);
        if (getArguments() != null) {
            text = getArguments().getString(BUNDLE_TEXT_ARGUMENT);
//            number = getArguments().getInt(BUNDLE_NUMBER_ARGUMENT);
        }
        textView.setText(text + number);
        return v;
    }
}