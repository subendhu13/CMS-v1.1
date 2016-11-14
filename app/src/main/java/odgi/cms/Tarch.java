package odgi.cms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Tarch extends ActionBarActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarch);

        listView = (ListView) findViewById(R.id.arch_teachers_list);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                " Mr.Kalyan Kr Mukherjee ",
                " Mr.Bhaskar Chatterjee",
                " Mr.Arnab Jana",
                " Mrs.Suranjana Chaudhuri ",
                " Mr.Biswajit Chakrabarty",
                " Mr.Abhiroop Das",
                " Mrs.Suparna Bhattacharya",
                " Mr.Sandipan Sinha",
                " Mr.Kaustubh Das",
                " Mrs.Shalini Nag",
                " Mrs.Rituparna Dasgupta",
        };

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);




        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);

                //show alert
                Toast.makeText(getApplicationContext(),
                        "--> Redirecting to : " + itemValue, Toast.LENGTH_LONG).show();

                switch (itemPosition) {

                    case 0:
                        Intent r1 = new Intent(Tarch.this, Kalyan_Kr_Mukherjee.class);
                        startActivity(r1);
                        break;

                    case 1:
                        Intent r2 = new Intent(Tarch.this, Bhaskar_Chatterjee.class);
                        startActivity(r2);
                        break;

                    case 2:
                        Intent r3 = new Intent(Tarch.this, Arnab_Jana.class);
                        startActivity(r3);
                        break;

                    case 3:
                        Intent r4 = new Intent(Tarch.this, Suranjana_Chaudhuri.class);
                        startActivity(r4);
                        break;

                    case 4:
                        Intent r5 = new Intent(Tarch.this, Biswajit_Chakrabarty.class);
                        startActivity(r5);
                        break;

                    case 5:
                        Intent r6 = new Intent(Tarch.this, Abhiroop_Das.class);
                        startActivity(r6);
                        break;

                    case 7:
                        Intent r7 = new Intent(Tarch.this, Suparna_Bhattacharya.class);
                        startActivity(r7);
                        break;

                    case 8:
                        Intent r8 = new Intent(Tarch.this, Sandipan_Sinha.class);
                        startActivity(r8);
                        break;

                    case 9:
                        Intent r9 = new Intent(Tarch.this, Kaustubh_Das.class);
                        startActivity(r9);
                        break;

                    case 10:
                        Intent r10 = new Intent(Tarch.this, Shalini_Nag.class);
                        startActivity(r10);
                        break;

                    case 11:
                        Intent r11 = new Intent(Tarch.this, Rituparna_Dasgupta.class);
                        startActivity(r11);
                        break;






                }
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.menu.menu_tarch, menu);
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
