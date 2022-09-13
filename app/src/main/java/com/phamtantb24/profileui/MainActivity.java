package com.phamtantb24.profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView userName,location,followers,followings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mapping();
        setContentView(R.layout.activity_main);
//        Intent inten = this.getIntent();
//        User user = (User)inten.getSerializableExtra("user");
//        userName.setText(user.getUserName());
//        location.setText(user.getLocation());
//        followers.setText("" + user.getFollowers());
//        followings.setText("" + user.getFollowing());

    }

    private void mapping() {
        userName = findViewById(R.id.userName);
        location = findViewById(R.id.location);
        followers = findViewById(R.id.followers);
        followings = findViewById(R.id.followings);
    }
}