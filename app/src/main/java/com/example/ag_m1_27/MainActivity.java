package com.example.ag_m1_27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calbtn;
        EditText finp;
        TextView res;

        calbtn=findViewById(R.id.calbtn);
        finp=findViewById(R.id.finp);
        res=findViewById(R.id.res);

        calbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(finp.getText().toString());
                String str="Answer :";
                int num = wt, number, temp, total = 0;

                number = num;
                while (number != 0)
                {
                    temp = number % 10;
                    total = total + temp*temp*temp;
                    number /= 10;
                }

                if(total == num)
                {
                    str = "It is an Armstrong number";
                }
                else
                {
                    str = "It is not an Armstrong number";
                }

                if (wt%2==0)
                {
                    str = str + "\nIt is an even number";
                }
                else
                {
                    str = str + "\nIt is an odd number";
                }
                res.setText(str);
            }
        });

    }
}