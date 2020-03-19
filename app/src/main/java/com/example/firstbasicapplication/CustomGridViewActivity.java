package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomGridViewActivity extends AppCompatActivity {

    GridView gv1;
    ArrayList<Student> a1 = new ArrayList<>();
    StudentAdapter ad;
    int[] imgid={
            R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img6
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);
        a1.add(new Student(1,"Adam",11.11,imgid));
        a1.add(new Student(2,"Nathan",22.22,imgid));
        a1.add(new Student(1,"James",33.33,imgid));
        a1.add(new Student(2,"Ricoh",44.44,imgid));
        gv1=findViewById(R.id.gridview1);
        ad=new StudentAdapter();
        gv1.setAdapter(ad);
        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student st = a1.get(position);

                Toast.makeText(CustomGridViewActivity.this, "Rollno: " + st.rollno + "\nName :" + st.name
                        + "\nMarks : " + st.marks, Toast.LENGTH_SHORT).show();
            }
    });
}

class StudentAdapter extends BaseAdapter {

        @Override
        public int getCount(){
            return a1.size();
        }
        @Override
        public Object getItem (int position) {
            return a1.get(position);
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View singleView, ViewGroup parent) {
            LayoutInflater inflater=getLayoutInflater();
            singleView=inflater.inflate(R.layout.single_grid_view_item,parent,false);

            TextView tvRollno=singleView.findViewById(R.id.tvrollno);
            TextView tvName=singleView.findViewById(R.id.tvname);
            TextView tvMarks=singleView.findViewById(R.id.tvmarks);
            ImageView imageView=singleView.findViewById(R.id.iv1);

            tvRollno.setText(a1.get(position).rollno +
                    "");
            tvName.setText(a1.get(position).name);
            tvMarks.setText(a1.get(position).marks + "");
            imageView.setImageResource(imgid[position]);

            return singleView;
        }
    }

    class Student {
        int rollno;
        String name;
        double marks;
        int imgId[];

        public Student(int r, String n,double m, int[] id) {
            rollno=r;
            name=n;
            marks=m;
            imgId=id;
        }
    }
}