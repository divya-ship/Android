package com.example.greendiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
private ImageView Greendicy1;
private ImageView Greendicy2;
private Button button;
private Random randomnumber=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rolldice();
            }
        });
        Greendicy1=findViewById(R.id.imageView);
        Greendicy1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
        Greendicy2=findViewById(R.id.imageView2);
        Greendicy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
public void Rolldice()
{

    int myrannumber= randomnumber.nextInt(6)+1;
    switch(myrannumber)
    {
        case 1:
            Greendicy1.setImageResource(R.drawable.dicy1);
            Context context=getApplicationContext();
            String text="good keep going Divya";
            int duration= Toast.LENGTH_SHORT;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();
            break;
        case 2:
            Greendicy1.setImageResource(R.drawable.dicy2);
            break;
        case 3:
            Greendicy1.setImageResource(R.drawable.dicy3);
            break;
        case 4:
            Greendicy1.setImageResource(R.drawable.dicy4);
            break;
        case 5:
            Greendicy1.setImageResource(R.drawable.dicy5);
            break;
        case 6:
            Greendicy1.setImageResource(R.drawable.dicy6);
    }
    int randoomnumber=randomnumber.nextInt(6)+1;
    switch (randoomnumber)
    {
        case 1:
            Greendicy2.setImageResource(R.drawable.dicy1copy);
            break;
        case 2:
            Greendicy2.setImageResource(R.drawable.dicy2copy);
            break;
        case 3:
            Greendicy2.setImageResource(R.drawable.dicy3copy);
            break;
        case 4:
            Greendicy2.setImageResource(R.drawable.dicy4copy);
            break;
        case 5:
            Greendicy2.setImageResource(R.drawable.dicy5copy);
            break;
        case 6:
            Greendicy2.setImageResource(R.drawable.dicy6opy);
            break;
    }
}

}
