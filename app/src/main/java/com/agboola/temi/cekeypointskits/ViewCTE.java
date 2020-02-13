package com.agboola.temi.cekeypointskits;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ViewCTE  extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpdf);


        pdfView=(PDFView)findViewById(R.id.pdf);
        pdfView.fromAsset("cte121.pdf").swipeHorizontal(true).load();




    }
}
