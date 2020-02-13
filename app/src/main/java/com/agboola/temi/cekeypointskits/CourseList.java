package com.agboola.temi.cekeypointskits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CourseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
    }

    public void gns111(View view) {

        Intent intent=new Intent(this, ViewGen.class);
        startActivity(intent);

    }

    public void sta110(View view) {
        Intent intent=new Intent(this, ViewSTA.class);
        startActivity(intent);

    }

    public void eec112(View view) {
        Intent intent=new Intent(this, ViewEec.class);
        startActivity(intent);

    }

    public void mth110(View view) {
        Intent intent=new Intent(this, viewMTS.class);
        startActivity(intent);

    }

    public void cte121(View view) {
        Intent intent=new Intent(this, ViewCTE.class);
        startActivity(intent);

    }

    public void gns101(View view) {
        Intent intent=new Intent(this, viewGNS.class);
        startActivity(intent);

    }
}
