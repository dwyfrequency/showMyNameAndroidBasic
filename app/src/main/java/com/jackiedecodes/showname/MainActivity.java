package com.jackiedecodes.showname;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiresApi(api = Build.VERSION_CODES.R)
public class MainActivity extends AppCompatActivity {
    private Button showButton;
    private TextView displayName;
    private List<String> nameList = new ArrayList<>(List.of("Hannah", "Juanita", "John", "Jackie D"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.button);
        displayName = findViewById(R.id.textView);

        showButton.setOnClickListener(view -> displayName.setText(getRandomListItem()));
    }

    private String getRandomListItem() {
        return nameList.get(new Random().nextInt(nameList.size()));
    }
}