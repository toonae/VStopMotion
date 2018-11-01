package com.example.computer.vstopmotion;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ค้นหารายการอาหาร...!!");

        title = new String[]{"ยำใหญ่", "แกงอ่อม", "แกงไตปลา", "พล่าเนื้อ", "ตับเหล็ก","ข้าวเหนียวสังขยา","ซ่าหริ่ม","ฝอยทอง","บัวลอย","ลำเจียก","น้อยหน่า","ทุเรียน","เงาะ","มะม่วง","ผลเกด"};
        description = new String[]{"ยำใหญ่...", "แกงอ่อม...", "แกงไตปลา...", "พล่าเนื้อ...", "ตับเหล็ก...","ข้าวเหนียวสังขยา...","ซ่าหริ่ม...",
                "ฝอยทอง...","บัวลอย...","ลำเจียก...","น้อยหน่า...","ทุเรียน...","เงาะ...","มะม่วง...","ผลเกด..."};
        icon = new int[]{R.drawable.yamm, R.drawable.goom, R.drawable.taipla, R.drawable.pal, R.drawable.tub,
                R.drawable.kaya,R.drawable.salim,R.drawable.tong,R.drawable.bua,R.drawable.lam
        ,R.drawable.noy,R.drawable.turian,R.drawable.rbt,R.drawable.ma,R.drawable.gad};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //ปุ่มกลับไปหน้าเมนู
    public void backToMain(View view) {
        Intent backtomain = new Intent(MainActivity.this, MainMenuActivity.class);
        startActivity(backtomain);
    }
    }

