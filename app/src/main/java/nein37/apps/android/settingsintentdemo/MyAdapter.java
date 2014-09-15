package nein37.apps.android.settingsintentdemo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nein37 on 2014/09/15.
 */
public class MyAdapter extends ArrayAdapter<MyAdapter.AdapterClass> {
    public MyAdapter(Context context, List<AdapterClass> objects) {
        super(context, android.R.layout.simple_list_item_2, android.R.id.text1,objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        ((TextView)view.findViewById(android.R.id.text1)).setText(getItem(position).description);
        ((TextView)view.findViewById(android.R.id.text2)).setText(getItem(position).actionName);
        return view;
    }

    static public class AdapterClass{

        public AdapterClass(String description,String actionName,String action){
            this.description  = description;
            this.actionName = actionName;
            this.action= action;
        }

        public Intent createIntent(){
            Intent intent = new Intent();
            intent.setAction(action);
            if(TextUtils.equals(action, Settings.ACTION_APPLICATION_DETAILS_SETTINGS)){
                intent.setData(Uri.parse("package:com.android.settings"));
            }
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            return intent;
        }

        public String description;
        public String actionName;
        public String action;
    }

}
