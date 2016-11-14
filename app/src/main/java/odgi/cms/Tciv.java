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

public class Tciv extends ActionBarActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tciv);

        listView = (ListView) findViewById(R.id.civ_teachers_list);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                " Mr.Mrinal Mukherjee ",
                " Mr.Gautam Bondyopadhyay ",
                " Dr. S.N.Roy ",
                " Mr.Supravat Chatterjee ",
                " Mr.Srijan Mukherjee",
                " Mr.Subrata Haldar",
                " Mr.Nilmoni Goswami",
                " Mr.Jayanta Ghoshal",
                " Mrs.Pampa Sen",
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
                        Intent r1 = new Intent(Tciv.this, M_Mukherjee.class);
                        startActivity(r1);
                        break;

                    case 1:
                        Intent r2 = new Intent(Tciv.this, G_Bondyopadhyay.class);
                        startActivity(r2);
                        break;

                    case 2:
                        Intent r3 = new Intent(Tciv.this, SN_Roy.class);
                        startActivity(r3);
                        break;

                    case 3:
                        Intent r4 = new Intent(Tciv.this, Supravat_Chatterjee.class);
                        startActivity(r4);
                        break;

                    case 4:
                        Intent r5 = new Intent(Tciv.this, Srijan_Mukherjee.class);
                        startActivity(r5);
                        break;

                    case 5:
                        Intent r6 = new Intent(Tciv.this, Subrata_Haldar.class);
                        startActivity(r6);
                        break;

                    case 6:
                        Intent r7 = new Intent(Tciv.this, Nilmoni_Goswami.class);
                        startActivity(r7);
                        break;

                    case 7:
                        Intent r8 = new Intent(Tciv.this, Jayanta_Ghoshal.class);
                        startActivity(r8);
                        break;

                    case 8:
                        Intent r9 = new Intent(Tciv.this, Pampa_Sen.class);
                        startActivity(r9);
                        break;


                }
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.menu.menu_tciv, menu);
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
