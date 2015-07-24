package com.alienske.short_stories;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView1);

        String[] values = new String[] {"The Lion's Whisker",
                "Why Anasi Has Eight Thin Legs",
                "King's Crown",
                "Memorial Tusk",
                "Black Snake And The Eggs",
                "The Spider And The Honey Tree",
                "The Chief Who Was No Fool",
                "The Man Who Never Lied"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue =(String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Story:" + " " + itemValue, Toast.LENGTH_SHORT)
                             .show();
                if (position == 0) {
                    Intent appInfo = new Intent(getBaseContext(), story1.class);
                    startActivity(appInfo);
                }
                if (position == 1) {
                    Intent appInfo = new Intent(getBaseContext(), story2.class);
                    startActivity(appInfo);
                }
                if (position == 2) {
                    Intent appInfo = new Intent(getBaseContext(), story3.class);
                    startActivity(appInfo);
                }
                if (position == 3) {
                    Intent appInfo = new Intent(getBaseContext(), story4.class);
                    startActivity(appInfo);
                }
                if (position == 4) {
                    Intent appInfo = new Intent(getBaseContext(), story5.class);
                    startActivity(appInfo);
                }
                if (position == 5) {
                    Intent appInfo = new Intent(getBaseContext(), story6.class);
                    startActivity(appInfo);
                }
                if (position == 6) {
                    Intent appInfo = new Intent(getBaseContext(), story7.class);
                    startActivity(appInfo);
                }
                if (position == 7) {
                    Intent appInfo = new Intent(getBaseContext(), story8.class);
                    startActivity(appInfo);
                }
            }
        });
    }
   
    

}
