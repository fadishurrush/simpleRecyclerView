package com.example.complexrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
  private RecyclerView recyclerview;
    private RecyclerView.Adapter mAadpter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] myDataSet;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview=findViewById(R.id.review);
        myDataSet=new String[]{"lamaj","ydaf","jude","reshe"};
        layoutManager=new LinearLayoutManager(this );
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setHasFixedSize(true);
        mAadpter=new MyAdapter (myDataSet);
        recyclerview.setAdapter(mAadpter);
        Map<String,Object> user= new HashMap<>();
        user.put("Names:","lamaj,ydaf,jude,jde7man");
        db.collection("user")
                .add(user);
    }
}