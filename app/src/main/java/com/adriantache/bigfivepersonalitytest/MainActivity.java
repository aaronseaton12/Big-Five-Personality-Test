package com.adriantache.bigfivepersonalitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //define answers array
    int[] answers = new int[51];
    //define all radio buttons for later use
    RadioButton question1radioButton1;
    RadioButton question1radioButton2;
    RadioButton question1radioButton3;
    RadioButton question1radioButton4;
    RadioButton question1radioButton5;
    RadioButton question2radioButton1;
    RadioButton question2radioButton2;
    RadioButton question2radioButton3;
    RadioButton question2radioButton4;
    RadioButton question2radioButton5;
    RadioButton question3radioButton1;
    RadioButton question3radioButton2;
    RadioButton question3radioButton3;
    RadioButton question3radioButton4;
    RadioButton question3radioButton5;
    RadioButton question4radioButton1;
    RadioButton question4radioButton2;
    RadioButton question4radioButton3;
    RadioButton question4radioButton4;
    RadioButton question4radioButton5;
    RadioButton question5radioButton1;
    RadioButton question5radioButton2;
    RadioButton question5radioButton3;
    RadioButton question5radioButton4;
    RadioButton question5radioButton5;
    RadioButton question6radioButton1;
    RadioButton question6radioButton2;
    RadioButton question6radioButton3;
    RadioButton question6radioButton4;
    RadioButton question6radioButton5;
    RadioButton question7radioButton1;
    RadioButton question7radioButton2;
    RadioButton question7radioButton3;
    RadioButton question7radioButton4;
    RadioButton question7radioButton5;
    RadioButton question8radioButton1;
    RadioButton question8radioButton2;
    RadioButton question8radioButton3;
    RadioButton question8radioButton4;
    RadioButton question8radioButton5;
    RadioButton question9radioButton1;
    RadioButton question9radioButton2;
    RadioButton question9radioButton3;
    RadioButton question9radioButton4;
    RadioButton question9radioButton5;
    RadioButton question10radioButton1;
    RadioButton question10radioButton2;
    RadioButton question10radioButton3;
    RadioButton question10radioButton4;
    RadioButton question10radioButton5;
    RadioButton question11radioButton1;
    RadioButton question11radioButton2;
    RadioButton question11radioButton3;
    RadioButton question11radioButton4;
    RadioButton question11radioButton5;
    RadioButton question12radioButton1;
    RadioButton question12radioButton2;
    RadioButton question12radioButton3;
    RadioButton question12radioButton4;
    RadioButton question12radioButton5;
    RadioButton question13radioButton1;
    RadioButton question13radioButton2;
    RadioButton question13radioButton3;
    RadioButton question13radioButton4;
    RadioButton question13radioButton5;
    RadioButton question14radioButton1;
    RadioButton question14radioButton2;
    RadioButton question14radioButton3;
    RadioButton question14radioButton4;
    RadioButton question14radioButton5;
    RadioButton question15radioButton1;
    RadioButton question15radioButton2;
    RadioButton question15radioButton3;
    RadioButton question15radioButton4;
    RadioButton question15radioButton5;
    RadioButton question16radioButton1;
    RadioButton question16radioButton2;
    RadioButton question16radioButton3;
    RadioButton question16radioButton4;
    RadioButton question16radioButton5;
    RadioButton question17radioButton1;
    RadioButton question17radioButton2;
    RadioButton question17radioButton3;
    RadioButton question17radioButton4;
    RadioButton question17radioButton5;
    RadioButton question18radioButton1;
    RadioButton question18radioButton2;
    RadioButton question18radioButton3;
    RadioButton question18radioButton4;
    RadioButton question18radioButton5;
    RadioButton question19radioButton1;
    RadioButton question19radioButton2;
    RadioButton question19radioButton3;
    RadioButton question19radioButton4;
    RadioButton question19radioButton5;
    RadioButton question20radioButton1;
    RadioButton question20radioButton2;
    RadioButton question20radioButton3;
    RadioButton question20radioButton4;
    RadioButton question20radioButton5;
    RadioButton question21radioButton1;
    RadioButton question21radioButton2;
    RadioButton question21radioButton3;
    RadioButton question21radioButton4;
    RadioButton question21radioButton5;
    RadioButton question22radioButton1;
    RadioButton question22radioButton2;
    RadioButton question22radioButton3;
    RadioButton question22radioButton4;
    RadioButton question22radioButton5;
    RadioButton question23radioButton1;
    RadioButton question23radioButton2;
    RadioButton question23radioButton3;
    RadioButton question23radioButton4;
    RadioButton question23radioButton5;
    RadioButton question24radioButton1;
    RadioButton question24radioButton2;
    RadioButton question24radioButton3;
    RadioButton question24radioButton4;
    RadioButton question24radioButton5;
    RadioButton question25radioButton1;
    RadioButton question25radioButton2;
    RadioButton question25radioButton3;
    RadioButton question25radioButton4;
    RadioButton question25radioButton5;
    RadioButton question26radioButton1;
    RadioButton question26radioButton2;
    RadioButton question26radioButton3;
    RadioButton question26radioButton4;
    RadioButton question26radioButton5;
    RadioButton question27radioButton1;
    RadioButton question27radioButton2;
    RadioButton question27radioButton3;
    RadioButton question27radioButton4;
    RadioButton question27radioButton5;
    RadioButton question28radioButton1;
    RadioButton question28radioButton2;
    RadioButton question28radioButton3;
    RadioButton question28radioButton4;
    RadioButton question28radioButton5;
    RadioButton question29radioButton1;
    RadioButton question29radioButton2;
    RadioButton question29radioButton3;
    RadioButton question29radioButton4;
    RadioButton question29radioButton5;
    RadioButton question30radioButton1;
    RadioButton question30radioButton2;
    RadioButton question30radioButton3;
    RadioButton question30radioButton4;
    RadioButton question30radioButton5;
    RadioButton question31radioButton1;
    RadioButton question31radioButton2;
    RadioButton question31radioButton3;
    RadioButton question31radioButton4;
    RadioButton question31radioButton5;
    RadioButton question32radioButton1;
    RadioButton question32radioButton2;
    RadioButton question32radioButton3;
    RadioButton question32radioButton4;
    RadioButton question32radioButton5;
    RadioButton question33radioButton1;
    RadioButton question33radioButton2;
    RadioButton question33radioButton3;
    RadioButton question33radioButton4;
    RadioButton question33radioButton5;
    RadioButton question34radioButton1;
    RadioButton question34radioButton2;
    RadioButton question34radioButton3;
    RadioButton question34radioButton4;
    RadioButton question34radioButton5;
    RadioButton question35radioButton1;
    RadioButton question35radioButton2;
    RadioButton question35radioButton3;
    RadioButton question35radioButton4;
    RadioButton question35radioButton5;
    RadioButton question36radioButton1;
    RadioButton question36radioButton2;
    RadioButton question36radioButton3;
    RadioButton question36radioButton4;
    RadioButton question36radioButton5;
    RadioButton question37radioButton1;
    RadioButton question37radioButton2;
    RadioButton question37radioButton3;
    RadioButton question37radioButton4;
    RadioButton question37radioButton5;
    RadioButton question38radioButton1;
    RadioButton question38radioButton2;
    RadioButton question38radioButton3;
    RadioButton question38radioButton4;
    RadioButton question38radioButton5;
    RadioButton question39radioButton1;
    RadioButton question39radioButton2;
    RadioButton question39radioButton3;
    RadioButton question39radioButton4;
    RadioButton question39radioButton5;
    RadioButton question40radioButton1;
    RadioButton question40radioButton2;
    RadioButton question40radioButton3;
    RadioButton question40radioButton4;
    RadioButton question40radioButton5;
    RadioButton question41radioButton1;
    RadioButton question41radioButton2;
    RadioButton question41radioButton3;
    RadioButton question41radioButton4;
    RadioButton question41radioButton5;
    RadioButton question42radioButton1;
    RadioButton question42radioButton2;
    RadioButton question42radioButton3;
    RadioButton question42radioButton4;
    RadioButton question42radioButton5;
    RadioButton question43radioButton1;
    RadioButton question43radioButton2;
    RadioButton question43radioButton3;
    RadioButton question43radioButton4;
    RadioButton question43radioButton5;
    RadioButton question44radioButton1;
    RadioButton question44radioButton2;
    RadioButton question44radioButton3;
    RadioButton question44radioButton4;
    RadioButton question44radioButton5;
    RadioButton question45radioButton1;
    RadioButton question45radioButton2;
    RadioButton question45radioButton3;
    RadioButton question45radioButton4;
    RadioButton question45radioButton5;
    RadioButton question46radioButton1;
    RadioButton question46radioButton2;
    RadioButton question46radioButton3;
    RadioButton question46radioButton4;
    RadioButton question46radioButton5;
    RadioButton question47radioButton1;
    RadioButton question47radioButton2;
    RadioButton question47radioButton3;
    RadioButton question47radioButton4;
    RadioButton question47radioButton5;
    RadioButton question48radioButton1;
    RadioButton question48radioButton2;
    RadioButton question48radioButton3;
    RadioButton question48radioButton4;
    RadioButton question48radioButton5;
    RadioButton question49radioButton1;
    RadioButton question49radioButton2;
    RadioButton question49radioButton3;
    RadioButton question49radioButton4;
    RadioButton question49radioButton5;
    RadioButton question50radioButton1;
    RadioButton question50radioButton2;
    RadioButton question50radioButton3;
    RadioButton question50radioButton4;
    RadioButton question50radioButton5;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find all radio button views for later use
        question1radioButton1 = findViewById(R.id.question1radioButton1);
        question1radioButton2 = findViewById(R.id.question1radioButton2);
        question1radioButton3 = findViewById(R.id.question1radioButton3);
        question1radioButton4 = findViewById(R.id.question1radioButton4);
        question1radioButton5 = findViewById(R.id.question1radioButton5);
        question2radioButton1 = findViewById(R.id.question2radioButton1);
        question2radioButton2 = findViewById(R.id.question2radioButton2);
        question2radioButton3 = findViewById(R.id.question2radioButton3);
        question2radioButton4 = findViewById(R.id.question2radioButton4);
        question2radioButton5 = findViewById(R.id.question2radioButton5);
        question3radioButton1 = findViewById(R.id.question3radioButton1);
        question3radioButton2 = findViewById(R.id.question3radioButton2);
        question3radioButton3 = findViewById(R.id.question3radioButton3);
        question3radioButton4 = findViewById(R.id.question3radioButton4);
        question3radioButton5 = findViewById(R.id.question3radioButton5);
        question4radioButton1 = findViewById(R.id.question4radioButton1);
        question4radioButton2 = findViewById(R.id.question4radioButton2);
        question4radioButton3 = findViewById(R.id.question4radioButton3);
        question4radioButton4 = findViewById(R.id.question4radioButton4);
        question4radioButton5 = findViewById(R.id.question4radioButton5);
        question5radioButton1 = findViewById(R.id.question5radioButton1);
        question5radioButton2 = findViewById(R.id.question5radioButton2);
        question5radioButton3 = findViewById(R.id.question5radioButton3);
        question5radioButton4 = findViewById(R.id.question5radioButton4);
        question5radioButton5 = findViewById(R.id.question5radioButton5);
        question6radioButton1 = findViewById(R.id.question6radioButton1);
        question6radioButton2 = findViewById(R.id.question6radioButton2);
        question6radioButton3 = findViewById(R.id.question6radioButton3);
        question6radioButton4 = findViewById(R.id.question6radioButton4);
        question6radioButton5 = findViewById(R.id.question6radioButton5);
        question7radioButton1 = findViewById(R.id.question7radioButton1);
        question7radioButton2 = findViewById(R.id.question7radioButton2);
        question7radioButton3 = findViewById(R.id.question7radioButton3);
        question7radioButton4 = findViewById(R.id.question7radioButton4);
        question7radioButton5 = findViewById(R.id.question7radioButton5);
        question8radioButton1 = findViewById(R.id.question8radioButton1);
        question8radioButton2 = findViewById(R.id.question8radioButton2);
        question8radioButton3 = findViewById(R.id.question8radioButton3);
        question8radioButton4 = findViewById(R.id.question8radioButton4);
        question8radioButton5 = findViewById(R.id.question8radioButton5);
        question9radioButton1 = findViewById(R.id.question9radioButton1);
        question9radioButton2 = findViewById(R.id.question9radioButton2);
        question9radioButton3 = findViewById(R.id.question9radioButton3);
        question9radioButton4 = findViewById(R.id.question9radioButton4);
        question9radioButton5 = findViewById(R.id.question9radioButton5);
        question10radioButton1 = findViewById(R.id.question10radioButton1);
        question10radioButton2 = findViewById(R.id.question10radioButton2);
        question10radioButton3 = findViewById(R.id.question10radioButton3);
        question10radioButton4 = findViewById(R.id.question10radioButton4);
        question10radioButton5 = findViewById(R.id.question10radioButton5);
        question11radioButton1 = findViewById(R.id.question11radioButton1);
        question11radioButton2 = findViewById(R.id.question11radioButton2);
        question11radioButton3 = findViewById(R.id.question11radioButton3);
        question11radioButton4 = findViewById(R.id.question11radioButton4);
        question11radioButton5 = findViewById(R.id.question11radioButton5);
        question12radioButton1 = findViewById(R.id.question12radioButton1);
        question12radioButton2 = findViewById(R.id.question12radioButton2);
        question12radioButton3 = findViewById(R.id.question12radioButton3);
        question12radioButton4 = findViewById(R.id.question12radioButton4);
        question12radioButton5 = findViewById(R.id.question12radioButton5);
        question13radioButton1 = findViewById(R.id.question13radioButton1);
        question13radioButton2 = findViewById(R.id.question13radioButton2);
        question13radioButton3 = findViewById(R.id.question13radioButton3);
        question13radioButton4 = findViewById(R.id.question13radioButton4);
        question13radioButton5 = findViewById(R.id.question13radioButton5);
        question14radioButton1 = findViewById(R.id.question14radioButton1);
        question14radioButton2 = findViewById(R.id.question14radioButton2);
        question14radioButton3 = findViewById(R.id.question14radioButton3);
        question14radioButton4 = findViewById(R.id.question14radioButton4);
        question14radioButton5 = findViewById(R.id.question14radioButton5);
        question15radioButton1 = findViewById(R.id.question15radioButton1);
        question15radioButton2 = findViewById(R.id.question15radioButton2);
        question15radioButton3 = findViewById(R.id.question15radioButton3);
        question15radioButton4 = findViewById(R.id.question15radioButton4);
        question15radioButton5 = findViewById(R.id.question15radioButton5);
        question16radioButton1 = findViewById(R.id.question16radioButton1);
        question16radioButton2 = findViewById(R.id.question16radioButton2);
        question16radioButton3 = findViewById(R.id.question16radioButton3);
        question16radioButton4 = findViewById(R.id.question16radioButton4);
        question16radioButton5 = findViewById(R.id.question16radioButton5);
        question17radioButton1 = findViewById(R.id.question17radioButton1);
        question17radioButton2 = findViewById(R.id.question17radioButton2);
        question17radioButton3 = findViewById(R.id.question17radioButton3);
        question17radioButton4 = findViewById(R.id.question17radioButton4);
        question17radioButton5 = findViewById(R.id.question17radioButton5);
        question18radioButton1 = findViewById(R.id.question18radioButton1);
        question18radioButton2 = findViewById(R.id.question18radioButton2);
        question18radioButton3 = findViewById(R.id.question18radioButton3);
        question18radioButton4 = findViewById(R.id.question18radioButton4);
        question18radioButton5 = findViewById(R.id.question18radioButton5);
        question19radioButton1 = findViewById(R.id.question19radioButton1);
        question19radioButton2 = findViewById(R.id.question19radioButton2);
        question19radioButton3 = findViewById(R.id.question19radioButton3);
        question19radioButton4 = findViewById(R.id.question19radioButton4);
        question19radioButton5 = findViewById(R.id.question19radioButton5);
        question20radioButton1 = findViewById(R.id.question20radioButton1);
        question20radioButton2 = findViewById(R.id.question20radioButton2);
        question20radioButton3 = findViewById(R.id.question20radioButton3);
        question20radioButton4 = findViewById(R.id.question20radioButton4);
        question20radioButton5 = findViewById(R.id.question20radioButton5);
        question21radioButton1 = findViewById(R.id.question21radioButton1);
        question21radioButton2 = findViewById(R.id.question21radioButton2);
        question21radioButton3 = findViewById(R.id.question21radioButton3);
        question21radioButton4 = findViewById(R.id.question21radioButton4);
        question21radioButton5 = findViewById(R.id.question21radioButton5);
        question22radioButton1 = findViewById(R.id.question22radioButton1);
        question22radioButton2 = findViewById(R.id.question22radioButton2);
        question22radioButton3 = findViewById(R.id.question22radioButton3);
        question22radioButton4 = findViewById(R.id.question22radioButton4);
        question22radioButton5 = findViewById(R.id.question22radioButton5);
        question23radioButton1 = findViewById(R.id.question23radioButton1);
        question23radioButton2 = findViewById(R.id.question23radioButton2);
        question23radioButton3 = findViewById(R.id.question23radioButton3);
        question23radioButton4 = findViewById(R.id.question23radioButton4);
        question23radioButton5 = findViewById(R.id.question23radioButton5);
        question24radioButton1 = findViewById(R.id.question24radioButton1);
        question24radioButton2 = findViewById(R.id.question24radioButton2);
        question24radioButton3 = findViewById(R.id.question24radioButton3);
        question24radioButton4 = findViewById(R.id.question24radioButton4);
        question24radioButton5 = findViewById(R.id.question24radioButton5);
        question25radioButton1 = findViewById(R.id.question25radioButton1);
        question25radioButton2 = findViewById(R.id.question25radioButton2);
        question25radioButton3 = findViewById(R.id.question25radioButton3);
        question25radioButton4 = findViewById(R.id.question25radioButton4);
        question25radioButton5 = findViewById(R.id.question25radioButton5);
        question26radioButton1 = findViewById(R.id.question26radioButton1);
        question26radioButton2 = findViewById(R.id.question26radioButton2);
        question26radioButton3 = findViewById(R.id.question26radioButton3);
        question26radioButton4 = findViewById(R.id.question26radioButton4);
        question26radioButton5 = findViewById(R.id.question26radioButton5);
        question27radioButton1 = findViewById(R.id.question27radioButton1);
        question27radioButton2 = findViewById(R.id.question27radioButton2);
        question27radioButton3 = findViewById(R.id.question27radioButton3);
        question27radioButton4 = findViewById(R.id.question27radioButton4);
        question27radioButton5 = findViewById(R.id.question27radioButton5);
        question28radioButton1 = findViewById(R.id.question28radioButton1);
        question28radioButton2 = findViewById(R.id.question28radioButton2);
        question28radioButton3 = findViewById(R.id.question28radioButton3);
        question28radioButton4 = findViewById(R.id.question28radioButton4);
        question28radioButton5 = findViewById(R.id.question28radioButton5);
        question29radioButton1 = findViewById(R.id.question29radioButton1);
        question29radioButton2 = findViewById(R.id.question29radioButton2);
        question29radioButton3 = findViewById(R.id.question29radioButton3);
        question29radioButton4 = findViewById(R.id.question29radioButton4);
        question29radioButton5 = findViewById(R.id.question29radioButton5);
        question30radioButton1 = findViewById(R.id.question30radioButton1);
        question30radioButton2 = findViewById(R.id.question30radioButton2);
        question30radioButton3 = findViewById(R.id.question30radioButton3);
        question30radioButton4 = findViewById(R.id.question30radioButton4);
        question30radioButton5 = findViewById(R.id.question30radioButton5);
        question31radioButton1 = findViewById(R.id.question31radioButton1);
        question31radioButton2 = findViewById(R.id.question31radioButton2);
        question31radioButton3 = findViewById(R.id.question31radioButton3);
        question31radioButton4 = findViewById(R.id.question31radioButton4);
        question31radioButton5 = findViewById(R.id.question31radioButton5);
        question32radioButton1 = findViewById(R.id.question32radioButton1);
        question32radioButton2 = findViewById(R.id.question32radioButton2);
        question32radioButton3 = findViewById(R.id.question32radioButton3);
        question32radioButton4 = findViewById(R.id.question32radioButton4);
        question32radioButton5 = findViewById(R.id.question32radioButton5);
        question33radioButton1 = findViewById(R.id.question33radioButton1);
        question33radioButton2 = findViewById(R.id.question33radioButton2);
        question33radioButton3 = findViewById(R.id.question33radioButton3);
        question33radioButton4 = findViewById(R.id.question33radioButton4);
        question33radioButton5 = findViewById(R.id.question33radioButton5);
        question34radioButton1 = findViewById(R.id.question34radioButton1);
        question34radioButton2 = findViewById(R.id.question34radioButton2);
        question34radioButton3 = findViewById(R.id.question34radioButton3);
        question34radioButton4 = findViewById(R.id.question34radioButton4);
        question34radioButton5 = findViewById(R.id.question34radioButton5);
        question35radioButton1 = findViewById(R.id.question35radioButton1);
        question35radioButton2 = findViewById(R.id.question35radioButton2);
        question35radioButton3 = findViewById(R.id.question35radioButton3);
        question35radioButton4 = findViewById(R.id.question35radioButton4);
        question35radioButton5 = findViewById(R.id.question35radioButton5);
        question36radioButton1 = findViewById(R.id.question36radioButton1);
        question36radioButton2 = findViewById(R.id.question36radioButton2);
        question36radioButton3 = findViewById(R.id.question36radioButton3);
        question36radioButton4 = findViewById(R.id.question36radioButton4);
        question36radioButton5 = findViewById(R.id.question36radioButton5);
        question37radioButton1 = findViewById(R.id.question37radioButton1);
        question37radioButton2 = findViewById(R.id.question37radioButton2);
        question37radioButton3 = findViewById(R.id.question37radioButton3);
        question37radioButton4 = findViewById(R.id.question37radioButton4);
        question37radioButton5 = findViewById(R.id.question37radioButton5);
        question38radioButton1 = findViewById(R.id.question38radioButton1);
        question38radioButton2 = findViewById(R.id.question38radioButton2);
        question38radioButton3 = findViewById(R.id.question38radioButton3);
        question38radioButton4 = findViewById(R.id.question38radioButton4);
        question38radioButton5 = findViewById(R.id.question38radioButton5);
        question39radioButton1 = findViewById(R.id.question39radioButton1);
        question39radioButton2 = findViewById(R.id.question39radioButton2);
        question39radioButton3 = findViewById(R.id.question39radioButton3);
        question39radioButton4 = findViewById(R.id.question39radioButton4);
        question39radioButton5 = findViewById(R.id.question39radioButton5);
        question40radioButton1 = findViewById(R.id.question40radioButton1);
        question40radioButton2 = findViewById(R.id.question40radioButton2);
        question40radioButton3 = findViewById(R.id.question40radioButton3);
        question40radioButton4 = findViewById(R.id.question40radioButton4);
        question40radioButton5 = findViewById(R.id.question40radioButton5);
        question41radioButton1 = findViewById(R.id.question41radioButton1);
        question41radioButton2 = findViewById(R.id.question41radioButton2);
        question41radioButton3 = findViewById(R.id.question41radioButton3);
        question41radioButton4 = findViewById(R.id.question41radioButton4);
        question41radioButton5 = findViewById(R.id.question41radioButton5);
        question42radioButton1 = findViewById(R.id.question42radioButton1);
        question42radioButton2 = findViewById(R.id.question42radioButton2);
        question42radioButton3 = findViewById(R.id.question42radioButton3);
        question42radioButton4 = findViewById(R.id.question42radioButton4);
        question42radioButton5 = findViewById(R.id.question42radioButton5);
        question43radioButton1 = findViewById(R.id.question43radioButton1);
        question43radioButton2 = findViewById(R.id.question43radioButton2);
        question43radioButton3 = findViewById(R.id.question43radioButton3);
        question43radioButton4 = findViewById(R.id.question43radioButton4);
        question43radioButton5 = findViewById(R.id.question43radioButton5);
        question44radioButton1 = findViewById(R.id.question44radioButton1);
        question44radioButton2 = findViewById(R.id.question44radioButton2);
        question44radioButton3 = findViewById(R.id.question44radioButton3);
        question44radioButton4 = findViewById(R.id.question44radioButton4);
        question44radioButton5 = findViewById(R.id.question44radioButton5);
        question45radioButton1 = findViewById(R.id.question45radioButton1);
        question45radioButton2 = findViewById(R.id.question45radioButton2);
        question45radioButton3 = findViewById(R.id.question45radioButton3);
        question45radioButton4 = findViewById(R.id.question45radioButton4);
        question45radioButton5 = findViewById(R.id.question45radioButton5);
        question46radioButton1 = findViewById(R.id.question46radioButton1);
        question46radioButton2 = findViewById(R.id.question46radioButton2);
        question46radioButton3 = findViewById(R.id.question46radioButton3);
        question46radioButton4 = findViewById(R.id.question46radioButton4);
        question46radioButton5 = findViewById(R.id.question46radioButton5);
        question47radioButton1 = findViewById(R.id.question47radioButton1);
        question47radioButton2 = findViewById(R.id.question47radioButton2);
        question47radioButton3 = findViewById(R.id.question47radioButton3);
        question47radioButton4 = findViewById(R.id.question47radioButton4);
        question47radioButton5 = findViewById(R.id.question47radioButton5);
        question48radioButton1 = findViewById(R.id.question48radioButton1);
        question48radioButton2 = findViewById(R.id.question48radioButton2);
        question48radioButton3 = findViewById(R.id.question48radioButton3);
        question48radioButton4 = findViewById(R.id.question48radioButton4);
        question48radioButton5 = findViewById(R.id.question48radioButton5);
        question49radioButton1 = findViewById(R.id.question49radioButton1);
        question49radioButton2 = findViewById(R.id.question49radioButton2);
        question49radioButton3 = findViewById(R.id.question49radioButton3);
        question49radioButton4 = findViewById(R.id.question49radioButton4);
        question49radioButton5 = findViewById(R.id.question49radioButton5);
        question50radioButton1 = findViewById(R.id.question50radioButton1);
        question50radioButton2 = findViewById(R.id.question50radioButton2);
        question50radioButton3 = findViewById(R.id.question50radioButton3);
        question50radioButton4 = findViewById(R.id.question50radioButton4);
        question50radioButton5 = findViewById(R.id.question50radioButton5);

    }

    public void submit (View view) {
        verify();
    }

    //todo function that verifies all checkboxes and codifies them into an array
    public void verify (){
        if (question1radioButton1.isChecked()) answers[1]=1;
        else if (question1radioButton2.isChecked()) answers[1]=2;
        else if (question1radioButton3.isChecked()) answers[1]=3;
        else if (question1radioButton4.isChecked()) answers[1]=4;
        else if (question1radioButton5.isChecked()) answers[1]=5;
        else {
            notCompleted(1, question1radioButton1);
            return;
        }




    }

    //shows a message with the first question that hasn't been answered
    //todo move ScrollView to that question
    public void notCompleted(int i, View v){
        Toast toast = Toast.makeText(MainActivity.this,"Please answer question "+i+" before proceeding!",Toast.LENGTH_SHORT);
        toast.show();

        // moves to first unanswered question
        // get position of a View
        int nY_Pos = v.getTop(); // getBottom(); X_pos  getLeft(); getRight();
        // scroll to top of hEdit
        ScrollView scroll = findViewById(R.id.scrollView2);
        scroll.scrollTo(0,nY_Pos);

    }
    //todo function that calculates score using mod 5 and a flippable boolean

    //todo function that creates score display (use graphs?)

    //todo function that hides test and shows results

    //todo reset function




}