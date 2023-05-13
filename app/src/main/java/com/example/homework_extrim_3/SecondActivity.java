package com.example.homework_extrim_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Moto> motos = new ArrayList<Moto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_moto);
        MotoAdapter adapter = new MotoAdapter(this, motos);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        motos.add(new Moto("ИЖ Юпитер", "Выпускался с 1961 по 1966", "Всего выпущено 477747 ", R.drawable.iz_one));
        motos.add(new Moto("ИЖ Юпитер 2", "Выпускался с 1965 по 1971", "Всего выпущено 766487 ", R.drawable.iz_two));
        motos.add(new Moto("ИЖ Юпитер 3", "Выпускался с 1971 по 1977", "Всего выпущено 478496 ", R.drawable.iz_three));
        motos.add(new Moto("ИЖ Юпитер 4", "Выпускался с 1980 по 1985", "Всего выпущено более миллиона ", R.drawable.iz_four));
        motos.add(new Moto("ИЖ Юпитер 5", "Выпускался с 1985 по 2007", "Всего выпущено более миллиона ", R.drawable.iz_five));
        motos.add(new Moto("ИЖ Планета", "Выпускался с 1962 по 1966", "Всего выпущено 405303 ", R.drawable.iz_planeta_one));
        motos.add(new Moto("ИЖ Планета 2", "Выпускался с 1965 по 1971", "Всего выпущено 246486 ", R.drawable.iz_planeta_two));
        motos.add(new Moto("ИЖ Планета 3", "Выпускался с 1971 по 1977", "Всего выпущено 478496 ", R.drawable.iz_planeta_three));
        motos.add(new Moto("ИЖ Планета 4", "Выпускался с 1983 по 1987", "Всего выпущено 430000 ", R.drawable.iz_planeta_four));
        motos.add(new Moto("ИЖ Планета 5", "Выпускался с 1987 по 2008", "Всего выпущено более миллиона ", R.drawable.iz_planeta_five));
    }
}