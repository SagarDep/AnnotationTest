package kr.co.sangcomz.annotationtest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import kr.co.sangcomz.annotationtest.R;
import kr.co.sangcomz.annotationtest.core.lifecycle.CycleControllerActivity;
import kr.co.sangcomz.annotationtest.core.transfer.BundleField;
import kr.co.sangcomz.annotationtest.core.transfer.BundleMapper;
import kr.co.sangcomz.annotationtest.view.DeclareView;


public class MainActivity extends CycleControllerActivity implements View.OnClickListener{

    @DeclareView(id = R.id.txt, setText = "안녕하세요 ANNOTATION Test입니다.", click = "this")
    TextView txt;

    @BundleField(name = "bundleField")
    public String bundleField = "ANNOTATION~TEST";

    @BundleField(name = "a")
    public String a = "aaaaaaaaa~";

    @BundleField(name = "b")
    public String b = "bbbbbbbbb~";

    @BundleField(name = "c")
    public String c = "ccccccccc~";




    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.txt:
                Intent i = new Intent(this, NextActivity.class);
                i.putExtra(null, BundleMapper.toBundle(this)); //setBundle
                startActivity(i);
                break;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main, true); //setViewMap
        bundleField = "ANNOTATION TEST";

        
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
