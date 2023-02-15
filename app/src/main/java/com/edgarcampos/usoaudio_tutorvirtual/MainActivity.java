package com.edgarcampos.usoaudio_tutorvirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer reproductor;
    ImageView cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, zero, one, two, three, four, five, six, seven, eigth, nine, ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cero = findViewById(R.id.iBtnCero);
        uno = findViewById(R.id.iBtnUno);
        dos = findViewById(R.id.iBtnDos);
        tres = findViewById(R.id.iBtnTres);
        cuatro = findViewById(R.id.iBtnCuatro);
        cinco = findViewById(R.id.iBtnCinco);
        seis = findViewById(R.id.iBtnSeis);
        siete = findViewById(R.id.iBtnSiete);
        ocho = findViewById(R.id.iBtnOcho);
        nueve = findViewById(R.id.iBtnNueve);
        diez = findViewById(R.id.iBtnDiez);
        zero = findViewById(R.id.iBtnZero);
        one = findViewById(R.id.iBtnOne);
        two = findViewById(R.id.iBtnTwo);
        three = findViewById(R.id.iBtnThree);
        four = findViewById(R.id.iBtnFour);
        five = findViewById(R.id.iBtnFive);
        six = findViewById(R.id.iBtnSix);
        seven = findViewById(R.id.iBtnSeven);
        eigth = findViewById(R.id.iBtnEigth);
        nine = findViewById(R.id.iBtnNine);
        ten = findViewById(R.id.iBtnTen);

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.cero);
                reproductor.start();
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.uno);
                reproductor.start();
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.dos);
                reproductor.start();
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.tres);
                reproductor.start();
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.cuatro);
                reproductor.start();
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.cinco);
                reproductor.start();
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.seis);
                reproductor.start();
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.siete);
                reproductor.start();
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.ocho);
                reproductor.start();
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.nueve);
                reproductor.start();
            }
        });

        diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.diez);
                reproductor.start();
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.zero);
                reproductor.start();
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.one);
                reproductor.start();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.two);
                reproductor.start();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.three);
                reproductor.start();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.four);
                reproductor.start();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.five);
                reproductor.start();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.six);
                reproductor.start();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.seven);
                reproductor.start();
            }
        });

        eigth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.eight);
                reproductor.start();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.nine);
                reproductor.start();
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(MainActivity.this, R.raw.ten);
                reproductor.start();
            }
        });

    }
}