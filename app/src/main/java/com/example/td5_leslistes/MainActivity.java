package com.example.td5_leslistes;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    MyAdapter adapter;
    RecyclerView rvContacts;
    RecyclerView.LayoutManager layoutManager;

    // Arraylist for storing data
    private ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvContacts = findViewById(R.id.idcontacts);
        rvContacts.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        rvContacts.setLayoutManager(layoutManager);

        // here we have created new array list and added data to it.
        contacts = new ArrayList<>();
        contacts.add(new Contact("Khalifi", "Wiam", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("Test", "Test1", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        MyAdapter adapter = new MyAdapter(this, contacts);
        rvContacts.setAdapter(adapter);

        // we are initializing our adapter class and passing our arraylist to it.


        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical


        // in below two lines we are setting layoutmanager and adapter to our recycler view.




    }
}

