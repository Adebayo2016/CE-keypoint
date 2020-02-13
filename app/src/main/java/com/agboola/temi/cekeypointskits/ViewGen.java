package com.agboola.temi.cekeypointskits;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ViewGen extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpdf);


        pdfView=(PDFView)findViewById(R.id.pdf);
        pdfView.fromAsset("gns111.pdf").swipeHorizontal(true).load();




    }
}