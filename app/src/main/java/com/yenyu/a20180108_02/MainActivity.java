package com.yenyu.a20180108_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList <Map<String,Object>> mylist= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.listView);
        HashMap<String,Object> m1= new HashMap<>();
        m1.put("city","台北"); //放入(key,value)
        m1.put("code","02");
        m1.put("img",R.drawable.taipei);
        mylist.add(m1); //再將HashMap放入ArrayList

        HashMap<String,Object> m2= new HashMap<>();
        m2.put("city","台中");
        m2.put("code","04");
        m2.put("img",R.drawable.taichun);
        mylist.add(m2);

        HashMap<String,Object> m3= new HashMap<>();
        m3.put("city","台南");
        m3.put("code","06");
        m3.put("img",R.drawable.tainan);
        mylist.add(m3);

        HashMap<String,Object> m4= new HashMap<>();
        m4.put("city","高雄");
        m4.put("code","06");
        m4.put("img",R.drawable.kaohsian);
        mylist.add(m3);

        SimpleAdapter adapter= new SimpleAdapter(MainActivity.this,
                mylist,R.layout.myitem,
                new String[] {"city","code","img"},new int[] {R.id.textView,R.id.textView2,R.id.imageView});
        //利用SimpleAdapter 帶出item
        //new SimpleAdapter(介面,內容位置,layout名稱,字串陣列{"key","key"},整數陣列{ID名稱})
        //可放入自己的layout
        lv.setAdapter(adapter);


    }
}
