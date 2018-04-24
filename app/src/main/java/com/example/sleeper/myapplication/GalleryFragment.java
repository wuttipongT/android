package com.example.sleeper.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {


    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_gallery, container, false);
        editText2 = (EditText) v.findViewById(R.id.editText2);
        editText3 = (EditText) v.findViewById(R.id.editText3);
        editText4 = (EditText) v.findViewById(R.id.editText4);

//        editText2.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                editText2.setFocusable(true);
//                editText2.setFocusableInTouchMode(true);
//                return false;
//            }
//
//        });
//        editText2.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
//
//                    if(editText2.getText().toString().equals("bed")){
//                        editText2.clearFocus();
//                        editText4.requestFocus();
//                        return true;
//                    }
//                }
//
//                return false;
//            }
//        });

        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE || event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    if(editText2.getText().toString().equals("D0GF204ZA023")){
                        return true;
                    }
                }

                return false;
            }
        });

        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE || event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    if(editText3.getText().toString().equals("bed")){
                        return true;
                    }
                }

                return false;
            }
        });
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

}
