package jp.gr.conf_java.oleeapps.test04;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by orisa on 2018/01/26.
 */

public class MyListAdapter extends BaseAdapter {
    private Context context = null;
    private ArrayList<ListItem> data = null;
    private int resource = 0;

    // context
    public MyListAdapter(Context context, ArrayList<ListItem> data, int resource) {
        this.context = context;
        this.data = data;
        this.resource = resource;
    }

    // returns # of data
    @Override
    public int getCount() {
        return data.size();
    }

    // returns item at position
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    // returns id of item
    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    // get view to show list
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Activity activity = (Activity)context;
        ListItem item = (ListItem)getItem(position);
        if (convertView == null) {
            convertView = activity.getLayoutInflater().inflate(resource, null);
        }
        ((TextView)convertView.findViewById(R.id.content)).setText(item.getContent());
        ((TextView)convertView.findViewById(R.id.timetstamp)).setText(item.getTimestamp());
        return convertView;
    }
}
