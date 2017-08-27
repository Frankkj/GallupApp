package com.example.frank.gallupapp;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kommunerto extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kommunerto);

        listView = (ExpandableListView)findViewById(R.id.expKomm);
        initData();
        listAdapter = new com.example.frank.gallupapp.ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("6372 Bylderup-Bov");
        listDataHeader.add("6230 Rødekro");
        listDataHeader.add("6360 Tinglev");
        listDataHeader.add("6200 Aabenraa");
        listDataHeader.add("6270 Tinglev");
        listDataHeader.add("6261 Bredebro");
        listDataHeader.add("6280 Højer");
        listDataHeader.add("6240 Løgum Kloster");
        listDataHeader.add("6780 Skærbæk");

        List<String> bov = new ArrayList<>();
        bov.add("Bov hører til 6200 Aabenraa!");

        List<String> rodekro = new ArrayList<>();
        rodekro.add("Rødekro hører til 6200 Aabenraa!");

        List<String> tinglev = new ArrayList<>();
        tinglev.add("Tinglev hører til 6200 Aabenraa!");

        List<String> aabenraa = new ArrayList<>();
        aabenraa.add("Aabenraa er bare 6200 Aabenraa!");

        List<String> tonder = new ArrayList<>();
        tonder.add("Tønder er bare 6270 Tønder!");

        List<String> bredebro = new ArrayList<>();
        bredebro.add("Bredebro hører til 6270 Tønder!");

        List<String> hojer = new ArrayList<>();
        hojer.add("Højer hører til 6270 Tønder!");

        List<String> logumkloster = new ArrayList<>();
        logumkloster.add("Løgum Kloster hører til 6270 Tønder!");

        List<String> skaerbaek = new ArrayList<>();
        skaerbaek.add("Skærbæk hører til 6270 Tønder!");

        listHash.put(listDataHeader.get(0),bov);
        listHash.put(listDataHeader.get(1),rodekro);
        listHash.put(listDataHeader.get(2),tinglev);
        listHash.put(listDataHeader.get(3),aabenraa);
        listHash.put(listDataHeader.get(4),tonder);
        listHash.put(listDataHeader.get(5),bredebro);
        listHash.put(listDataHeader.get(6),hojer);
        listHash.put(listDataHeader.get(7),logumkloster);
        listHash.put(listDataHeader.get(8),skaerbaek);

    }


}
