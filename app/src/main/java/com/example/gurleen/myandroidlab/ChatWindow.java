package com.example.gurleen.myandroidlab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatWindow extends Activity {
ListView listView;
EditText editText;
Button sendButton;
final ChatAdapter messageAdapter = new ChatAdapter(this);

ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);
       listView = findViewById(R.id.listView);
       editText= findViewById(R.id.editTextChatWindow);
       sendButton = findViewById(R.id.sendButton);
       listView.setAdapter(messageAdapter);
        sendButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String msg = editText.getText().toString();
                if(!msg.isEmpty()){
                    arrayList.add(msg);
                    editText.setText("");
                    messageAdapter.notifyDataSetChanged();
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
            LayoutInflater inflater = ChatWindow.this.getLayoutInflater();
            View result= null;
            if(position%2 == 0)
                result = inflater.inflate(R.layout.chat_row_incoming, null);
            else
                result = inflater.inflate(R.layout.chat_row_outgoing, null);

            TextView message = (TextView)result.findViewById(R.id.message_text);
            message.setText(getItem(position));
            return result;


        }


    }
}