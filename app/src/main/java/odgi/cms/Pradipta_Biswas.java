package odgi.cms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Pradipta_Biswas extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pradipta__biswas);

        Intent i = new Intent(Intent.ACTION_VIEW);
        //i.setData(Uri.parse("http://goo.gl/forms/cUy0n1dUcG"));
        //startActivity(i);
        //startActivity(Intent.createChooser(i, "Choose: (Recomended Google Chrome)"));

    }

}
