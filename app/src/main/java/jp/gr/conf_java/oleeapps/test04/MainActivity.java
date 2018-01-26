package jp.gr.conf_java.oleeapps.test04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // prepare data for list
        String contents[] = {"おはよう", "こんにちは", "こんばんは", "寝る", "体調不良"};
        String timestamps[] = {"2018/01/26 00:58", "2018/01/23 12:34", "2018/01/19 11:11", "2018/01/15 15:32", "2018/01/11 09:31"};

        // arrays -> ArrayList
        ArrayList<ListItem> data = new ArrayList<>();
        for (int i = 0; i < contents.length; i++){
            ListItem item = new ListItem();
            item.setId((new Random()).nextLong());
            item.setContent(contents[i]);
            item.setTimestamp(timestamps[i]);
            data.add(item);
        }

        // relate ListItem to layout
        MyListAdapter adapter = new MyListAdapter(MainActivity.this, data, R.layout.list_item);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
