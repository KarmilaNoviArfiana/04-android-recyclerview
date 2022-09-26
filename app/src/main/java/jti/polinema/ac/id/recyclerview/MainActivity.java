package jti.polinema.ac.id.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> dataList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setWordData(WordData.dt());

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Adapter adapter = new Adapter(dataList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }



    public void setWordData(String data){
        try {
            JSONArray jsonArray = new JSONArray(data);
            dataList = new ArrayList<>();
            for(int i=0; i<jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Model mdl = new Model(jsonObject.getString("no"),
                        jsonObject.getString("barang"),
                        jsonObject.getString("harga"));
                dataList.add(mdl);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}