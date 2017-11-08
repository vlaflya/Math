package com.example.math;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button plus;
    public Button min;
    public Button div;
    public Button mult;
    public Button sqrt;
    public Button step;
    public Button cos;
    public Button sin;
    public Button tan;
    public Button ctan;
    public Button lg;
    public Button ln;
    public Button open;
    public Button close;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button noll;
    public Button del;
    public Button clear;
    public Button eql;
    public Button dot;
    public Button pi;
    public TextView ex;
    public TextView eq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button)findViewById(R.id.plus);
        min = (Button)findViewById(R.id.min);
        mult = (Button)findViewById(R.id.mult);
        div = (Button)findViewById(R.id.div);
        sqrt = (Button)findViewById(R.id.sqrt);
        step = (Button)findViewById(R.id.step);
        cos = (Button)findViewById(R.id.cos);
        sin = (Button)findViewById(R.id.sin);
        tan = (Button)findViewById(R.id.tan);
        ctan = (Button)findViewById(R.id.ctan);
        lg = (Button)findViewById(R.id.lg);
        ln = (Button)findViewById(R.id.ln);
        open = (Button)findViewById(R.id.open);
        close = (Button)findViewById(R.id.close);
        eql = (Button)findViewById(R.id.eql);
        clear = (Button)findViewById(R.id.clear);
        dot = (Button)findViewById(R.id.dot);
        pi = (Button)findViewById(R.id.pi);
        del = (Button)findViewById(R.id.del);
        noll = (Button)findViewById(R.id.noll);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);

        ex = (TextView) findViewById(R.id.ex);
        eq = (TextView) findViewById(R.id.eq);


        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"+");
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"-");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"/");
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"sqrt(");
            }
        });
        step.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"^");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"cos(");
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"sin(");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"tan(");
            }
        });
        ctan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"ctan(");
            }
        });

        open.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"(");
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+")");
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"ln(");
            }
        });
        lg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"lg(");
            }
        });



        // цифры
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"9");
            }
        });
        noll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText(ex.getText()+".");
            }
        });


        eql.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{if(ex.getText().toString().length() == 1)
                    ex.setText("");
                else if(ex.getText().toString().charAt(ex.getText().length()-1) == '('){
                try {
                    if(ex.getText().toString().substring(ex.length()-3,ex.length()).equals("ln(")||ex.getText().toString().substring(ex.length()-3,ex.length()).equals("lg(")){
                        ex.setText(ex.getText().toString().substring(0,(ex.length()-3)));
                    }

                    else if(ex.getText().toString().substring(ex.length()-4,ex.length()).equals("cos(")||ex.getText().toString().substring(ex.length()-4,ex.length()).equals("sin(")){
                        ex.setText(ex.getText().toString().substring(0,(ex.length()-4)));
                    }
                    else if((ex.getText().toString().substring(ex.length()-4,ex.length()).equals("tan("))){
                        ex.setText(ex.getText().toString().substring(0,(ex.length()-4)));
                        if(ex.getText().charAt(ex.length()-1) == 'c')
                            ex.setText(ex.getText().toString().substring(0,ex.length()-1));
                    }
                    else if(ex.getText().toString().substring(ex.length()-5,ex.length()).equals("sqrt(")){
                        ex.setText(ex.getText().toString().substring(0,(ex.length()-5)));
                    }


                    else if(!(ex.getText().toString().charAt(ex.length()-2)== 't')||!(ex.getText().toString().charAt(ex.length()-2)== 'n')||!(ex.getText().toString().charAt(ex.length()-2)== 'g')){
                        ex.setText(ex.getText().toString().substring(0,ex.length()-1));
                    }

                }
                catch (Throwable e){}
            }
                else{
                    try{
                        ex.setText(ex.getText().toString().substring(0,ex.length()-1));
                    }
                    catch (Throwable e){}
                }
            }
            catch (Throwable e){}
            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ex.setText("");
            }
        });




    }
}
