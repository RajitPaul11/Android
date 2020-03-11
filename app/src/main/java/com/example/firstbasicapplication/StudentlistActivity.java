package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentlistActivity extends AppCompatActivity {
    ListView lv;
    int imgid[]={R.drawable.img1,R.drawable.img2};
    ArrayList<Student> al=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlist);
        lv=findViewById(R.id.lv1);
        al.add(new Student(1,"Raquel",93.6,imgid));
        al.add(new Student(2,"Richie",94.6,imgid));
    }

}
class Student
{
    int rollNo;
    String name;
    double marks;
    int[] imgId;

    Student(int a,String nam,double d,int[] imgId)
    {
        rollNo=a;
        name=nam;
        d=marks;
        this.imgId=imgId;
    }

}
class StudentAdapter extends BaseAdapter
{
    public int getcount() {
        return al.Size();
    }
    public Object getItem(int position)
        {
            return al.get(position);
        }
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View singleView, ViewGroup parent)
        {
            LayoutInflater  inflater=LayoutInflater.from(parent.getContext());
            inflater.inflate(R.layout.student_list_item,parent,false);
            TextView tvName=singleView.findViewById(R.id.tvi2);
            TextView tvRollNo=singleView.findViewById(R.id.tvi3);
            TextView tvMarks=singleView.findViewById(R.id.tvi4);
            ImageView iv1=singleView.findViewById(R.id.iv1);

            tvRollNo.setText(al.get(position).tvi2);
        }

}
