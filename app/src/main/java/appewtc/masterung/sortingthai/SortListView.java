package appewtc.masterung.sortingthai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class SortListView extends AppCompatActivity {

    //Explicit
    private ListView listView;
    private String[] strings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_list_view);

        listView = (ListView) findViewById(R.id.sortListview);
        strings = getResources().getStringArray(R.array.soft);

        // Create ListView
        SortAdapter sortAdapter = new SortAdapter(this, strings);
        listView.setAdapter(sortAdapter);

    }   // Main Method

}   // Main Class
