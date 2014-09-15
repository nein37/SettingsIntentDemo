package nein37.apps.android.settingsintentdemo;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ListView listView = (ListView)findViewById(android.R.id.list);
       final MyAdapter adapter = createAdapter();
listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyAdapter.AdapterClass item = adapter.getItem(position);
Intent intent=                 item.createIntent();
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }
            }
        });
    }

    public MyAdapter createAdapter(){
        List<MyAdapter.AdapterClass> itemList = new ArrayList<MyAdapter.AdapterClass>();

        itemList.add(new MyAdapter.AdapterClass("ユーザ補助", "ACTION_ACCESSIBILITY_SETTINGS : API level 5",Settings.ACTION_ACCESSIBILITY_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("アカウントの追加", "ACTION_ADD_ACCOUNT : API level 8",Settings.ACTION_ADD_ACCOUNT));
        itemList.add(new MyAdapter.AdapterClass("無線とネットワーク(機内モード設定)", "ACTION_AIRPLANE_MODE_SETTINGS : API level 3",Settings.ACTION_AIRPLANE_MODE_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("APN", "ACTION_APN_SETTINGS : API level 1",Settings.ACTION_APN_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("指定アプリの詳細情報", "ACTION_APPLICATION_DETAILS_SETTINGS : API level 9",Settings.ACTION_APPLICATION_DETAILS_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("開発者向けオプション", "ACTION_APPLICATION_DEVELOPMENT_SETTINGS : API level 3",Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("アプリ", "ACTION_APPLICATION_SETTINGS : API level 1",Settings.ACTION_APPLICATION_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("Bluetooth", "ACTION_BLUETOOTH_SETTINGS : API level 1",Settings.ACTION_BLUETOOTH_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("字幕", "ACTION_CAPTIONING_SETTINGS : API level 19",Settings.ACTION_CAPTIONING_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("モバイルネットワーク設定(データローミング設定)", "ACTION_DATA_ROAMING_SETTINGS : API level 3",Settings.ACTION_DATA_ROAMING_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("日付と時刻", "ACTION_DATE_SETTINGS : API level 1",Settings.ACTION_DATE_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("端末の状態", "ACTION_DEVICE_INFO_SETTINGS : API level 8",Settings.ACTION_DEVICE_INFO_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("ディスプレイ", "ACTION_DISPLAY_SETTINGS : API level 1",Settings.ACTION_DISPLAY_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("スクリーンセーバー", "ACTION_DREAM_SETTINGS : API level 18",Settings.ACTION_DREAM_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("言語と入力", "ACTION_INPUT_METHOD_SETTINGS : API level 3",Settings.ACTION_INPUT_METHOD_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("Googleキーボードの入力言語設定(端末依存？)", "ACTION_INPUT_METHOD_SUBTYPE_SETTINGS : API level 11",Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("ストレージの設定(内部ストレージ設定)", "ACTION_INTERNAL_STORAGE_SETTINGS : API level 3",Settings.ACTION_INTERNAL_STORAGE_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("言語", "ACTION_LOCALE_SETTINGS : API level 1",Settings.ACTION_LOCALE_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("位置情報アクセス", "ACTION_LOCATION_SOURCE_SETTINGS : API level 1",Settings.ACTION_LOCATION_SOURCE_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("アプリ(すべて)", "ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS : API level 9",Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("アプリ", "ACTION_MANAGE_APPLICATIONS_SETTINGS : API level 3",Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("ストレージの設定(外部ストレージ設定)", "ACTION_MEMORY_CARD_SETTINGS : API level 3",Settings.ACTION_MEMORY_CARD_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("利用可能なネットワーク", "ACTION_NETWORK_OPERATOR_SETTINGS : API level 3",Settings.ACTION_NETWORK_OPERATOR_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("Androidビーム", "ACTION_NFCSHARING_SETTINGS : API level 14",Settings.ACTION_NFCSHARING_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("タップ&ペイ", "ACTION_NFC_PAYMENT_SETTINGS : API level 19",Settings.ACTION_NFC_PAYMENT_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("無線とネットワーク(NFC設定)", "ACTION_NFC_SETTINGS : API level 16",Settings.ACTION_NFC_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("印刷", "ACTION_PRINT_SETTINGS : API level 19",Settings.ACTION_PRINT_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("バックアップとリセット", "ACTION_PRIVACY_SETTINGS : API level 5",Settings.ACTION_PRIVACY_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("クイック起動", "ACTION_QUICK_LAUNCH_SETTINGS : API level 3",Settings.ACTION_QUICK_LAUNCH_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("Google検索アプリ設定", "ACTION_SEARCH_SETTINGS : API level 8",Settings.ACTION_SEARCH_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("セキュリティ", "ACTION_SECURITY_SETTINGS : API level 1",Settings.ACTION_SECURITY_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("設定アプリの立ち上げ", "ACTION_SETTINGS : API level 1",Settings.ACTION_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("音", "ACTION_SOUND_SETTINGS : API level 1",Settings.ACTION_SOUND_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("同期設定ダイアログ", "ACTION_SYNC_SETTINGS : API level 3",Settings.ACTION_SYNC_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("ユーザー辞書", "ACTION_USER_DICTIONARY_SETTINGS : API level 3",Settings.ACTION_USER_DICTIONARY_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("IP設定", "ACTION_WIFI_IP_SETTINGS : API level 3",Settings.ACTION_WIFI_IP_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("Wi-Fi", "ACTION_WIFI_SETTINGS : API level 1",Settings.ACTION_WIFI_SETTINGS));
        itemList.add(new MyAdapter.AdapterClass("無線とネットワーク", "ACTION_WIRELESS_SETTING : API level 1",Settings.ACTION_WIRELESS_SETTINGS));

        return new MyAdapter(this,itemList);
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
