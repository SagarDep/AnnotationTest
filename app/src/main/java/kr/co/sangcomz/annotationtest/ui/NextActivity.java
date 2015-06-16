package kr.co.sangcomz.annotationtest.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import kr.co.sangcomz.annotationtest.R;
import kr.co.sangcomz.annotationtest.core.lifecycle.CycleControllerActivity;
import kr.co.sangcomz.annotationtest.core.transfer.BundleField;
import kr.co.sangcomz.annotationtest.core.transfer.BundleMapper;
import kr.co.sangcomz.annotationtest.view.DeclareView;


public class NextActivity extends CycleControllerActivity {

    @DeclareView(id = R.id.txttt, setText = "아하하하하하")
    TextView txttt;

    @BundleField(name = "bundleField")
    public String bundleField;

    @BundleField(name = "a")
    public String a;

    @BundleField(name = "b")
    public String b;

    @BundleField(name = "c")
    public String c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BundleMapper.fromBundle(this, getIntent().getBundleExtra(null));
        setContentView(R.layout.activity_next, true);

        txttt.setText(bundleField);

        System.out.println("a ::::: " + a);
        System.out.println("b ::::: " + b);
        System.out.println("c ::::: " + c);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_next, menu);
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
