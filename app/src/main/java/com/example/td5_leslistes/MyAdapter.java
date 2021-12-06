package com.example.td5_leslistes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import com.bumptech.glide.Glide;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Viewholder> {

    private Context context;
    private ArrayList<Contact> contacts;

    // Constructor
    public MyAdapter(Context context, ArrayList<Contact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null );
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        Contact model = contacts.get(position);
        holder.nomContact.setText(contacts.get(position).getNom());
        holder.prenomContact.setText(contacts.get(position).getPrenom());
       // holder.imageContact.setImageResource(contacts.get(position).getImage());
        Glide.with(context).load(model.getImage()).into(holder.imageContact);
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return contacts.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView imageContact;
        private TextView  nomContact, prenomContact;
        CardView cv;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            cv=itemView.findViewById(R.id.haha);
            imageContact = itemView.findViewById(R.id.imageView);
            nomContact = itemView.findViewById(R.id.textViewNom);
            prenomContact = itemView.findViewById(R.id.textViewPrenom);
        }
    }
}
