package com.example.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {
        EditText messageView=(EditText)findViewById(R.id.message);
        String messageText=messageView.getText().toString();
        //Intent intent = new Intent(this,ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello");
        startActivity(intent);
    }
}