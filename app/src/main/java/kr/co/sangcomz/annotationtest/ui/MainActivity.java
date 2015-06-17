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


public class MainActivity extends CycleControllerActivity implements View.OnClickListener {

    @DeclareView(id = R.id.txt, setText = "안녕하세요 ANNOTATION Test입니다.")
    TextView txt;

    @DeclareView(id = R.id.et1)
    EditText et1;
    @DeclareView(id = R.id.et2)
    EditText et2;
    @DeclareView(id = R.id.et3)
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
        switch (id) {
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

<<<<<<< HEAD

=======
>>>>>>> 736938b5df5381c57e8f6a5da032a8fa7389232e
    }
}
