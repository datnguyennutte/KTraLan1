package dat.project.ktraapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListDetailActivity extends AppCompatActivity {
    ListView listView;
    String mFoodName[] = {"Rượu vang", "Thịt heo", "Thịt gà", "Thịt bò"};
    String mPrice[] = {"$33", "$33","$33","$33",};
    int images[] = {R.drawable.anh1, R.drawable.anh2, R.drawable.anh2, R.drawable.anh3,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);
        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mFoodName, mPrice, images);
        listView.setAdapter(adapter);

    }
}