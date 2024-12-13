package com.example.daftar_mahasiswa1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("2312501063", "Fidya Zahrani Nanduary", "2312500214@gmail.com", "2005-18-07"));
        studentList.add(new Student("2312502345", "Siti Aisyah", "siti@gmail.com", "2004-19-01"));
        studentList.add(new Student("2312503456", "Andi Setiawan", "andi@gmail.com", "2006-23-05"));
        studentList.add(new Student("2312504567", "Rina Wijaya", "rina@gmail.com", "2005-04-07"));
        studentList.add(new Student("2312505678", "Ali Nur", "ali@gmail.com", "2004-03-09"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        StudentAdapter adapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(adapter);
    }
}