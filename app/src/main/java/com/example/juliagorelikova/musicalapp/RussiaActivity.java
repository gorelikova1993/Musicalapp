package com.example.juliagorelikova.musicalapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.juliagorelikova.musicalapp.Book;
import com.example.juliagorelikova.musicalapp.BookAdapter;
import com.example.juliagorelikova.musicalapp.R;

import java.util.ArrayList;

public class RussiaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        //Create a list of books
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("War and Peace", "Leo Tolstoy", "Historical novel"));
        books.add(new Book("The Master and Margarita", "Mikhail Bulgakov", "Fantastic satire"));
        books.add(new Book("Dubrovsky", "Alexander Pushkin", "Novel"));
        books.add(new Book("Dead Souls", "Nikolai Gogol", "Political satire"));
        books.add(new Book("The Cherry Orchard", "Anton Chekhov", "Drama"));
        books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", "Philosophical novel"));
        books.add(new Book("Oblomov", "Ivan Goncharov", "Novel"));
        books.add(new Book("Woe from Wit","Alexander Griboyedov", "Comedy"));
        books.add(new Book("Doctor Zhivago", "Boris Pasternak", "Historical, romantic novel"));




        BookAdapter adapter = new BookAdapter(this, books);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);




    }
}
