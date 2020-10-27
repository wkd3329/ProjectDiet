package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.security.identity.CipherSuiteNotSupportedException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag_add extends Fragment {

    private  static final int IMAGE = 672;
    private String imagePath;
    private Uri imgUri;


    Button btn_addpic;
    Button btn_addtxt;
    Button btn_addexer;
    Button btn_addalbum;



    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_add, container, false);

        btn_addpic = view.findViewById(R.id.btn_addbyPic);
        btn_addalbum = view.findViewById(R.id.btn_addbyalbum);
        btn_addtxt = view.findViewById(R.id.btn_addbytxt);
        btn_addexer = view.findViewById(R.id.btn_addexer);

        btn_addpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            }
        });

        btn_addalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 101);
            }

            });


        return view;

    }
}

