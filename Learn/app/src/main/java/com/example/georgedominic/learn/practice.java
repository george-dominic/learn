package com.example.georgedominic.learn;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.georgedominic.learn.QA.average.average;
import com.example.georgedominic.learn.QA.numbersystem.numbersystem;
import com.example.georgedominic.learn.QA.percentage.percentage;
import com.example.georgedominic.learn.QA.probability.probability;
import com.example.georgedominic.learn.QA.simplification.simplification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class practice extends AppCompatActivity{

    Intent intent;
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    Intent i1=new Intent(practice.this, MainActivity.class);
                    startActivity(i1);
                    return true;
                case R.id.navigation_practice:

                    return true;
                case R.id.navigation_test:

                    Intent i2=new Intent(practice.this,test.class);
                    startActivity(i2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Menu menu=navigation.getMenu();
        MenuItem menuItem =menu.getItem(1);
        menuItem.setChecked(true);
        //CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) navigation.getLayoutParams();
        //layoutParams.setBehavior(new BottomNavigationViewBehavior());

        listView=(ExpandableListView)findViewById(R.id.lvexp);
        initData();
        listAdapter=new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                 switch(i){
                     case 0:

                     switch(i1){
                         case 0:
                             intent = new Intent(practice.this, numbersystem.class);
                             break;
                         case 1:
                             intent = new Intent(practice.this, simplification.class);
                                break;
                         case 2:
                             intent = new Intent(practice.this, average.class);
                             break;
                         case 3:
                             intent = new Intent(practice.this, percentage.class);
                             break;
                         case 4:
                             intent = new Intent(practice.this, probability.class);
                             break;
                     }
                     startActivity(intent);




                }

                return false;
            }
        });

    }

    private void initData() {
    listDataHeader = new ArrayList<>();
    listHash = new HashMap<>();

    listDataHeader.add("Quantative Aptitude");
    listDataHeader.add("Logical Reasoning");
    listDataHeader.add("English");

    List<String> qa=new ArrayList<>();
    qa.add("Number System");
    qa.add("Simplification");
    qa.add("Average");
    qa.add("Percentage");
    qa.add("Probability");
    qa.add("Algebra");
    qa.add("Ratio and Proportion");
    qa.add("Interest");
    qa.add("Profit and Loss");
    qa.add("Time and Work");
    qa.add("Speed Time and Distance");
    qa.add("Data Sufficiency");
    qa.add("Mixture Problems");
    qa.add("Number Series");
    qa.add("Permutation and Combination");
    qa.add("Mensuration");


    List<String> lr=new ArrayList<>();
    lr.add("Analogy");
    lr.add("Series");
    lr.add("Blood Relations");
    lr.add("Ordering and Ranking");
    lr.add("Syllogism");
    lr.add("Grouping and Selections");
    lr.add("Double Lineup");
    lr.add("Puzzle");
    lr.add("Direction and Distance");
    lr.add("Logical deductions");
    lr.add("Clock and Calendar");
    lr.add("Coding Decoding");

    List<String> eng=new ArrayList<>();
    eng.add("Grammar");
    eng.add("Vocabulary");
    eng.add("Verbal Ability");
    eng.add("Reading Comprehension");

    listHash.put(listDataHeader.get(0),qa);
    listHash.put(listDataHeader.get(1),lr);
    listHash.put(listDataHeader.get(2),eng);




    }



}
