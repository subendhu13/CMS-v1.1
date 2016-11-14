package odgi.cms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;



public class Bus extends Activity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);



        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.buslist);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                "Bus No : 1",
                "Bus No : 2",
                "Bus No : 3",
                "Bus No : 4",
                "Bus No : 5",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String)listView.getItemAtPosition(position);

                //show alert
                Toast.makeText(getApplicationContext(),
                        "--> Redirecting to : " + itemValue, Toast.LENGTH_LONG).show();

                switch(itemPosition){

                case 0 :Intent r1 = new Intent(Bus.this, Route1.class);
                startActivity(r1);
                break;

                case 1 :Intent r2 = new Intent(Bus.this, Route2.class);
                    startActivity(r2);
                break;

                case 2 :Intent r3 = new Intent(Bus.this, Route3.class);
                startActivity(r3);
                break;

                case 3 :Intent r4 = new Intent(Bus.this, Route4.class);
                startActivity(r4);
                break;

                case 4 :Intent r5 = new Intent(Bus.this, Route5.class);
                startActivity(r5);
                break;


            }}

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_bus, menu);
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
