package kr.co.sangcomz.annotationtest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kr.co.sangcomz.annotationtest.R;
import kr.co.sangcomz.annotationtest.core.lifecycle.CycleControllerActivity;
import kr.co.sangcomz.annotationtest.core.transfer.BundleField;
import kr.co.sangcomz.annotationtest.core.transfer.BundleMapper;
import kr.co.sangcomz.annotationtest.view.DeclareView;


public class MainActivity extends CycleControllerActivity implements View.OnClickListener{

    @DeclareView(id = R.id.txt, setText = "안녕하세요 ANNOTATION Test입니다.")
    TextView txt;

    @DeclareView(id = R.id.et1)
    EditText et1;
    @DeclareView(id = R.id.et2)
    EditText et2;
    @DeclareView(id = R.id.et2)
    EditText et3;

    @DeclareView(id = R.id.btn, setText = "NextActivity", click = "this")
    Button btn;

    @BundleField(name = "et1Str")
    public String et1Str;

    @BundleField(name = "et2Str")
    public String et2Str;

    @BundleField(name = "et3Str")
    public String et3Str;




    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn:
                Intent i = new Intent(this, NextActivity.class);
                et1Str = et1.getText().toString();
                et2Str = et2.getText().toString();
                et3Str = et3.getText().toString();
                i.putExtra(null, BundleMapper.toBundle(this)); //setBundle
                startActivity(i);
                break;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main, true); //setViewMap

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
