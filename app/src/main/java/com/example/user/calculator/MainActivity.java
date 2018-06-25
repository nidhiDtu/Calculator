package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean isEqbtn=true;
    private boolean isDecimal=false;
    private Button buttonPrev,buttonMod,buttonPow,buttonDot,buttonAdd,buttonSubtract,buttonMux,buttonEquals,buttonCLR,buttonDivide,button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    private TextView textQuery,textResult;
    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char MULTIPLICATION='*';
    private final char DIVISION='/';
    private final char EQUALS='=';
    private final char POWER='^';
    private final char MOD='%';
    private static final char DOT = '.';
    private double val1=Double.NaN;
    private double val2;
    private char action;
    private String prev=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUIViews();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEqbtn==true){
                    textResult.setText(null);
                    textQuery.setText("0");
                    isEqbtn=false;
                }else
                textQuery.setText(textQuery.getText().toString()+"9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textQuery.getText().equals("")){
                    isEqbtn=false;
                    compute();
                    action=ADDITION;
                    textResult.setText(String.valueOf(val1)+"+");
                    textQuery.setText(null);
                }else{
                    textResult.setText(null);
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textQuery.getText().equals("")) {
                    isEqbtn=false;
                    compute();
                    action=SUBTRACTION;
                    textResult.setText(String.valueOf(val1)+"-");
                    textQuery.setText(null);
                }else{
//                    textQuery.setText(String.valueOf(val1));
                    textResult.setText(null);
                }
            }
        });

        buttonMux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textQuery.getText().equals("")){
                    isEqbtn=false;
                    compute();
                    action=MULTIPLICATION;
                    textResult.setText(String.valueOf(val1)+"x");
                    textQuery.setText(null);
                }else{
                    textResult.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textQuery.getText().equals("")){
                    isEqbtn=false;
                    compute();
                    action=DIVISION;
                    textResult.setText(String.valueOf(val1)+"/");
                    textQuery.setText(null);
                }else{
                    textResult.setText(null);
                }
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textQuery.getText().equals("")){
                    compute();
                    action=EQUALS;
                    if(isEqbtn==true){
                        textResult.setText(textResult.getText().toString());
//                        buttonCLR.callOnClick();
//                        textQuery.setText(null);
                    }else {
//                action=EQUALS;
                        textResult.setText(textResult.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                        textQuery.setText(null);
                    }
                    //5 + 4 =9
                    isEqbtn=true;
                }else{
                    prev=textResult.getText().toString();
                    textResult.setText(null);
                }
            }
        });

        buttonCLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isEqbtn=false;
                isDecimal=false;
                if(textQuery.getText().length()>0){
                    CharSequence name = textQuery.getText().toString();
                    textQuery.setText(name.subSequence(0,name.length()-1));
                }else{
                    val1=Double.NaN;
                    val2=Double.NaN;
                    textQuery.setText(null);
                    prev=textResult.getText().toString();
                    textResult.setText(null);
                }
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(!isDecimal){
                        isEqbtn=false;
                        compute();
                        action=DOT;
                        textQuery.setText(String.valueOf(val1));
//                   textQuery.setText(null);
                    }else{
                        textQuery.setText(String.valueOf(val1));
                    }
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textQuery.getText().equals("")){
                    isEqbtn=false;
                    compute();
                    action=MOD;
                    textResult.setText(String.valueOf(val1+"%"));
                    textQuery.setText(null);
                }else{
                    textResult.setText(null);
                }
            }
        });

        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textQuery.getText().equals("")){
                    isEqbtn=false;
                    compute();
                    action=POWER;
                    textResult.setText(String.valueOf(val1)+"^");
                    textQuery.setText(null);
                }else{
                    textResult.setText(null);
//                    textQuery.setText(null);
                }
            }
        });

        buttonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textResult.setText(prev);
            }
        });
    }

    private void setUpUIViews(){
        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttonAdd=(Button)findViewById(R.id.buttonAdd);
        buttonSubtract=(Button)findViewById(R.id.buttonSubtract);
        buttonDivide=(Button)findViewById(R.id.buttonDivide);
        buttonMux=(Button)findViewById(R.id.buttonMux);
        buttonEquals=(Button)findViewById(R.id.buttonEquals);
        buttonCLR=(Button)findViewById(R.id.buttonCLR);
        buttonPrev=(Button)findViewById(R.id.buttonPrev);
        buttonPow=(Button)findViewById(R.id.buttonPow);
        buttonMod=(Button)findViewById(R.id.buttonMod);
        buttonDot=(Button)findViewById(R.id.buttonDot);

        textQuery=(TextView)findViewById(R.id.textQuery);
        textResult=(TextView)findViewById(R.id.textResult);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(textQuery.getText().toString());

            switch (action){
                case ADDITION:
                    val1+=val2;
                    break;
                case SUBTRACTION:
                    val1-=val2;
                    break;
                case MULTIPLICATION:
                    val1*=val2;
                    break;
                case DIVISION:
                    val1/=val2;
                    break;
                case POWER:
                    val1=Math.pow(val1,val2);
                    break;
//                case MOD:
//                    val1=val1/100;
//                    break;
//                case DOT:
//                    val1 = (int)val1 + GetFraction(val2);
//                    return;
                case EQUALS:
                    break;
            }
        }else{
            val1=Double.parseDouble(textQuery.getText().toString());
        }
    }

    private Double GetFraction(Double val2){
        Double ans=val2;
        int prec=0;
        for(int i = (int) (val2%10); val2>0;val2=val2/10){
            prec++;
        }
        ans=ans/prec;
        return ans;
    }
}