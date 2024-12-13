package com.example.daftar_mahasiswa1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private List<Student> studentList;

    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student currentStudent = studentList.get(position);
        holder.nimTextView.setText(currentStudent.getNim());
        holder.namaTextView.setText(currentStudent.getNama());
        holder.emailTextView.setText(currentStudent.getEmail());
        holder.tanggalLahirTextView.setText(currentStudent.getTanggalLahir());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView nimTextView, namaTextView, emailTextView, tanggalLahirTextView;

        public StudentViewHolder(View itemView) {
            super(itemView);
            nimTextView = itemView.findViewById(R.id.nim);
            namaTextView = itemView.findViewById(R.id.nama);
            emailTextView = itemView.findViewById(R.id.email);
            tanggalLahirTextView = itemView.findViewById(R.id.tanggalLahir);
        }
    }
}
