package com.example.principleofelectronics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class biik extends AppCompatActivity {
    public PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biik);

        pdfView =(PDFView) findViewById(R.id.pdfbook);
        // first create copy your pdf and pest in assets folder
        // here you set your paf file name with .pdf
        pdfView.fromAsset("eee.pdf").defaultPage(0)
                .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(this))
                .load();
    }
}