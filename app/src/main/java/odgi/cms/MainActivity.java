package odgi.cms;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBus (View view)
    {
        Intent bus = new Intent(this, Bus.class);
        startActivity(bus);
    }

    public void openRoutineDept (View view)
    {
        Intent routine = new Intent(this, RoutineDept.class);
        startActivity(routine);
    }

    public void openTeachers (View view)
    {
        Intent teachers = new Intent(this, Teachers.class);
        startActivity(teachers);
    }

    public void samplequestions (View view)
    {
        Intent sq = new Intent(this, SampleQuestions.class);
        startActivity(sq);

    }

    public void canteen (View view)
    {
        Intent cn = new Intent(this, Canteen.class);
        startActivity(cn);

    }

    public void exam (View view)
    {
        Intent ex = new Intent(this, Exam.class);
        startActivity(ex);
    }

    public void library (View view)
    {
        Intent lb = new Intent(this, Library.class);
        startActivity(lb);
    }

    public void notice (View view)
    {
        Intent nt = new Intent(this, Notice.class);
        startActivity(nt);
    }

    public void ebooks (View view)
    {
        Intent eb = new Intent(this, Ebooks.class);
        startActivity(eb);
    }

    public void notes (View view)
    {
        Intent nt = new Intent(this, Notes.class);
        startActivity(nt);
    }
    public void viewattendance (View view)
    {
        Intent va = new Intent(this, ViewAttendance.class);
        startActivity(va);
    }

    public void lessonplans (View view)
    {
        Intent lp = new Intent(this, Lessonplans.class);
        startActivity(lp);
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

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
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.facebook.com/OmWave-Softwares-1510764125917126/"));
            //startActivity(i);
            startActivity(Intent.createChooser(i,"Hi\uD83D\uDC4B,like us in social media\uD83D\uDC4D)"));

            //return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
