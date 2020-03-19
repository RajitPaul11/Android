package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentlistActivity extends AppCompatActivity {
    ListView lv;
    int imgid[] = {R.drawable.img1, R.drawable.img2};
    ArrayList<Student> al = new ArrayList<>();
    StudentAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlist);
        lv = findViewById(R.id.lv1);
        al.add(new Student(1, "Raquel", 93.6, imgid));
        al.add(new Student(2, "Richie", 94.6, imgid));
        ad = new StudentAdapter();
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Student st = al.get(position);
                Toast.makeText(StudentlistActivity.this, "Rollno:" + st.rollNo + "\nName :" + st.name + "Marks : " + st.marks, Toast.LENGTH_LONG).show();
            }
        });


    }
        class Student {
            int rollNo;
            String name;
            double marks;
            int[] imgId;

            Student(int a, String nam, double d, int[] imgId) {
                rollNo = a;
                name = nam;
                d = marks;
                this.imgId = imgId;
            }

        }

        class StudentAdapter extends BaseAdapter {
            public int getCount() {
                return al.size();
            }

            public Object getItem(int position) {
                return al.get(position);
            }

            public long getItemId(int position) {
                return position;
            }


        public View getView ( int position, View singleView, ViewGroup parent){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());//staticfunction called with class
            singleView = inflater.inflate(R.layout.student_list_item, parent, false);// false means i donot want to attach the xml file rightnow, true in case of attaching fragments
            TextView tvName = singleView.findViewById(R.id.tvi2);
            TextView tvRollNo = singleView.findViewById(R.id.tvi3);
            TextView tvMarks = singleView.findViewById(R.id.tvi4);
            ImageView iv1 = singleView.findViewById(R.id.iv1);

            tvRollNo.setText(al.get(position).rollNo + "");
            tvName.setText(al.get(position).name);
            tvMarks.setText(al.get(position).marks + "");
            iv1.setImageResource(imgid[position]);
            return singleView;
        }
    }


    }


//putting the
