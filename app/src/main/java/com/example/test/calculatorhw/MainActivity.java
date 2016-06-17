package com.example.test.calculatorhw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private void  initialize()
    {



        tvPartial=(TextView)findViewById(R.id.tv_partial_disp);

        EdTotalDisplay=(EditText)findViewById(R.id.et_display_total);


        btnOpA=(Button)findViewById(R.id.btn_add);
        btnOpS=(Button)findViewById(R.id.btn_sub);
        btnOpM=(Button)findViewById(R.id.btn_mul);
        btnOpD=(Button)findViewById(R.id.btn_divide);


        btnKeypad0=(Button)findViewById(R.id.keypad_0);
        btnKeypad1=(Button)findViewById(R.id.keypad_1);
        btnKeypad2=(Button)findViewById(R.id.keypad_2);
        btnKeypad3=(Button)findViewById(R.id.keypad_3);
        btnKeypad4=(Button)findViewById(R.id.keypad_4);
        btnKeypad5=(Button)findViewById(R.id.keypad_5);
        btnKeypad6=(Button)findViewById(R.id.keypad_6);
        btnKeypad7=(Button)findViewById(R.id.keypad_7);
        btnKeypad8=(Button)findViewById(R.id.keypad_8);
        btnKeypad9=(Button)findViewById(R.id.keypad_9);
        btnKeypadeq=(Button)findViewById(R.id.keypad_equal);
        btnKeypadmulti=(Button)findViewById(R.id.keypad_multi);

        EdTotalDisplay.setInputType(InputType.TYPE_NULL);

         EdTotalDisplay.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);





    }


    private TextView tvPartial;
    private EditText EdTotalDisplay;
    private Button btnOpA,btnOpS,btnOpM,btnOpD,btnKeypad7,btnKeypad8,btnKeypad9,btnKeypad4,btnKeypad5
           , btnKeypad6,btnKeypad1,btnKeypad2,btnKeypad3,btnKeypadmulti,btnKeypad0,btnKeypadeq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String prev=EdTotalDisplay.getText().toString();
                switch(v.getId())
                {

                    case R.id.btn_add:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="+";
                        EdTotalDisplay.setText(prev);

                        break;


                    case R.id.btn_sub:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="-";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.btn_mul:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="*";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.btn_divide:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="/";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_0:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="0";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_1:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="1";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_2:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="2";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_3:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="3";
                        EdTotalDisplay.setText(prev);
                        break;

                    case R.id.keypad_4:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="4";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_5:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="5";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_6:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="6";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_7:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="7";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_8:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="8";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_9:
                         prev=EdTotalDisplay.getText().toString();
                        prev+="9";
                        EdTotalDisplay.setText(prev);
                        break;
                    case R.id.keypad_equal:
                        break;
                    case R.id.keypad_multi:
                        if(btnKeypadmulti.getText().equals("."))
                        {   prev=EdTotalDisplay.getText().toString();
                            prev+=".";
                            EdTotalDisplay.setText(prev);}
                        else

                        {
                            if(prev.isEmpty())
                                break;
                            prev=EdTotalDisplay.getText().toString();
                            prev=prev.substring(0,prev.length()-1);
                            EdTotalDisplay.setText(prev);

                        }
                        break;




                }





            }
        };


        View.OnLongClickListener longClickListener=new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if(btnKeypadmulti.getText().equals("."))
                btnKeypadmulti.setText("C");
                else
                btnKeypadmulti.setText(".");
                return false;
            }
        };


        btnKeypadmulti.setOnLongClickListener(longClickListener);
        btnOpA.setOnClickListener(onClickListener);
        btnOpS.setOnClickListener(onClickListener);
        btnOpM.setOnClickListener(onClickListener);
        btnOpD.setOnClickListener(onClickListener);
        btnKeypad0.setOnClickListener(onClickListener);
        btnKeypad1.setOnClickListener(onClickListener);
        btnKeypad2.setOnClickListener(onClickListener);
        btnKeypad3.setOnClickListener(onClickListener);
        btnKeypad4.setOnClickListener(onClickListener);
        btnKeypad5.setOnClickListener(onClickListener);
        btnKeypad6.setOnClickListener(onClickListener);
        btnKeypad7.setOnClickListener(onClickListener);
        btnKeypad8.setOnClickListener(onClickListener);
        btnKeypad9.setOnClickListener(onClickListener);
        btnKeypadeq.setOnClickListener(onClickListener);
        btnKeypadmulti.setOnClickListener(onClickListener);





    }
}
