package com.example.easychat;
import com.google.firebase.Timestamp;

import java.util.List;

public class ChatActivity {



    EditText messageInput;
    ImageButton sendMessageBtn;
    ImageButtone backBtn;
    TextView otherUsername;
    RecyclerView recyclerView;

    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Chat);

        otherUser= AndroidUtil.getUserModelFromIntent(getIntent());

        messageInput= findViewById(R.chat_message_input);
        sendMessageBtn=findViewById(R.sendMessageBtn);
        backBtn= findViewById(R.id.back_btn);
        otherUsername=findViewById(R.id.otherUsername);
        backBtn.setOnClickListener((v)->{
            onBackPressed();

        });
        otherUsername.setText(otherUser.getUsername());

        get



    }
}
