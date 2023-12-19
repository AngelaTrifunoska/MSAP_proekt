package com.example.easychat;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class SearchUserActivity {
    EditText searchInput;
    ImageButton searchButton;
    ImageButton backButton;
    RecyclerView recyclerView;

    public SearchUserActivity() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
EditText messageInput;
    ImageButton sendMessafeBtn;
    TextView otherUsername;
    RecyclerView recyclerView;



    @Override
    protected  void onCreate(Bundle savedInstances){
        super.OnCreate(savedInstances);
        setContentView(R.layout.activity_search_user);


        searchInput= searchInput.findViewById();
        searchButton= searchButton.findViewById();
        backButton=findViewById(R.id.main_search_btn);


    }


    private void setContentView(int activitySearchUser) {
    }

}
