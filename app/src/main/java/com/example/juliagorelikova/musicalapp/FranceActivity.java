package com.example.juliagorelikova.musicalapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FranceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("La Peau de chagrin", "Honoré de Balzac", "Novel"));
        books.add(new Book("Dangerous Liaisons", "Pierre Choderlos de Laclos", "Epistolary novel"));
        books.add(new Book("The Three Musketeers","Alexandre Dumas", "Historical novel"));
        books.add(new Book("The Little Prince","Antoine de Saint-Exupéry", "Novella"));
        books.add(new Book("Madame Bovary", "Gustave Flaubert", "Realist novel"));
        books.add(new Book("Bel Ami", "Guy de Maupassant", "Novel"));
        books.add(new Book("Les Misérables", "Victor Hugo", "Historical novel"));
        books.add(new Book("The Hunchback of Notre-Dame", "Victor Hugo", "Gothic fiction"));

        BookAdapter adapter = new BookAdapter(this, books);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
