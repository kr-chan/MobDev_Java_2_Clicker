package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    TextView mainTextView;
    Button mainButton;
    mainButton = findViewById(R.id.main_button);
    mainButton.setOnClickListener(this);

    EditText mainEditText;
    mainEditText = (EditText) findViewById(R.id.main_edittext);

    public void onClick(View v) { mainTextView.setText(mainEditText.getText().toString()
            + &quot; is learning Android development!&quot;);
    }

    ListView mainListView;
    ArrayAdapter mArrayAdapter;
    ArrayList mNameList = new ArrayList();

    mNameList.add(mainEditText.getText().toString());
    mArrayAdapter.notifyDataSetChanged();

    public class MainActivity extends AppCompatActivity implements View.OnClickListener,
            AdapterView.OnItemClickListener {
        mainListView.setOnItemClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");

        mainListView = findViewById(R.id.main_listview);
        mArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                mNameList);
        mainListView.setAdapter(mArrayAdapter);
    }

    @Override
    public void onClick(View v) {
        mainTextView.setText(&quot;Button pressed!&quot;);
    }

    @Override
    public void onItemClick(AdapterView&lt;?&gt; parent, View view, int position, long id) {
        Log.d(&quot;omg android&quot;, position + &quot;: &quot; + mNameList.get(position));
        mainTextView.setText(mNameList.get(position).toString()
                + &quot; is learning Android development!&quot;);
    }

    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.button);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s = "Кликов: " + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn.setOnClickListener(clickListener);

    }
}

