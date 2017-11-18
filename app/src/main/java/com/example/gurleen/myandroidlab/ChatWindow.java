package com.example.gurleen.myandroidlab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatWindow extends Activity {
ListView listView;
EditText editText;
Button sendButton;
ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);
       listView = findViewById(R.id.listView);
       editText= findViewById(R.id.editTextChatWindow);
       sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                for(int i=0; i< arrayList.size();i++) {

                    //arrayList.add((getText()));
                }

            }
        });
    }
    private class ChatAdapter extends ArrayAdapter<String>{

        public ChatAdapter(Context ctx) {
            super(ctx, 0);
        }
        public int getCount(){
            return arrayList.size();
        }

        public String getItem(int position){
            return arrayList.get(position);
        }
        public View getView(int position, View convertView, ViewGroup parent){

            return convertView;
        }


    }
}
