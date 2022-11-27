package com.eldico.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Clarissa","clarrisa@gmail.com",R.drawable.a));
        items.add(new Item("Diana","Diana@gmail.com",R.drawable.b));
        items.add(new Item("Ronaldo","Ronaldo@gmail.com",R.drawable.c));
        items.add(new Item("John Cena","jonci@gmail.com",R.drawable.d));
        items.add(new Item("Benedict","Benedict@gmail.com",R.drawable.e));
        items.add(new Item("Merry Jane","Merryjei@gmail.com",R.drawable.f));
        items.add(new Item("Helen Wood","Holywood@gmail.com",R.drawable.g));
        items.add(new Item("Anna Sake","Asake@gmail.com",R.drawable.h));
        items.add(new Item("Vannessa J","nessavan@gmail.com",R.drawable.a));
        items.add(new Item("Princess","princess@gmail.com",R.drawable.b));
        items.add(new Item("Kylian Mbappe","bapepsg@gmail.com",R.drawable.c));
        items.add(new Item("Domunt Toretto","dototo@gmail.com",R.drawable.d));
        items.add(new Item("Stephen Jonas","sovajonas@gmail.com",R.drawable.e));
        items.add(new Item("Bella Rodriguez","bellaez@gmail.com",R.drawable.f));
        items.add(new Item("Nicky Fernando","Nindo@gmail.com",R.drawable.g));
        items.add(new Item("Rowsey Jr","Rowseyjr@gmail.com",R.drawable.h));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),items));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this,"Backup Success",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Contact has been shared",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Go to setting page",Toast.LENGTH_SHORT).show();
                return true;}
        return super.onOptionsItemSelected(item);
    }
}