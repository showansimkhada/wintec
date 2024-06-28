package com.showansimkhada.quiz;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Quiz extends AppCompatActivity
{
    // assigning variables
    TextView displayProfileQuiz;
    TextView displayQuestionQuiz;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    public int Number = 1;
    int r = 0;

    // creating new questions and answers using the QuestionsAndAnswers
    private QuestionsAndAnswers QuestionsAndAnswers = new QuestionsAndAnswers();

    // creating string for storing the answer
    private String Answers;

    // storing the length of array
    private int size = QuestionsAndAnswers.Questioins.length;
    TextView displayScoreQuiz;

    // setting the score
    public static int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        displayScoreQuiz = (TextView) findViewById(R.id.displayScoreQuiz);
        displayQuestionQuiz = (TextView) findViewById(R.id.displayQuestionQuiz);
        option1 = (Button) findViewById(R.id.option1);
        option2 = (Button) findViewById(R.id.option2);
        option3 = (Button) findViewById(R.id.option3);
        option4 = (Button) findViewById(R.id.option4);

        getProfile();
        update(0);

        option1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(option1.getText() == Answers)
                {
                    // true will increase the score and increase the questions number too
                    Score++;
                    r++;
                    update(r);
                }
                else
                {
                    gameOver();
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(option2.getText() == Answers)
                {
                    Score++;
                    r++;
                    update(r);
                }
                else
                {
                    gameOver();
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(option3.getText() == Answers)
                {
                    Score++;
                    r++;
                    update(r);
                }
                else
                {
                    gameOver();
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(option4.getText() == Answers)
                {
                    Score++;
                    r++;
                    update(r);
                }
                else
                {
                    gameOver();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        // disabling the option
    }

    private void update(int x)
    {
        if (Number > 10)
        {
            gameOver();
        }
        else
        {

            displayQuestionQuiz.setText("" + Number + ". " + QuestionsAndAnswers.getQuestioins(x));
            option1.setText(QuestionsAndAnswers.getChoice1(x));
            option2.setText(QuestionsAndAnswers.getChoice2(x));
            option3.setText(QuestionsAndAnswers.getChoice3(x));
            option4.setText(QuestionsAndAnswers.getChoice4(x));
            displayScoreQuiz.setText("Score: "+Score);
            int highScore =0;

            // selecting the score form the database running the sql query
            Cursor c = Select_profile.editor.rawQuery("select "+Data.dataEntry.COLUMN_SCORE+" from "
                    +Data.dataEntry.TABLE_NAME +" where "+ Data.dataEntry._ID.toString() + "=?",
                    new String[]{ Data.dataEntry._ID.toString()} );
            if (c.moveToFirst()) {
                highScore = c.getInt(0);
            }
            // closing the cursor
            c.close();

            if( highScore < Score)
            {
                ContentValues update = new ContentValues();
                update.put(Data.dataEntry.COLUMN_SCORE, Score);
                String[] profile = new String[]{displayProfileQuiz.getText().toString()};
                Select_profile.editor.update(Data.dataEntry.TABLE_NAME, update, "profile=?", profile);
            }
            else
            {
                // do nothing
            }
            Number++;
            // getting answers form the questions and answers
            Answers = QuestionsAndAnswers.getAnswer(x);
        }
    }

    private void gameOver()
    {
        // creating the alert dialog for showing the results
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Congrats you have scored " + Quiz.Score + " out of 10");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Quit",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "Retry",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Quiz.Score = 0;
                        Intent Select_profile = new Intent(getBaseContext(), Select_profile.class);
                        startActivity(Select_profile);
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
//        Intent result = new Intent(this, Result.class);
//        startActivity(result);
    }

    private void getProfile()
    {
        displayProfileQuiz = (TextView) findViewById(R.id.displayProfileQuiz);
        // getting the extra information from the previous intent
        String p = getIntent().getStringExtra("profile");
        // setting the text
        displayProfileQuiz.setText(p);
    }

}
