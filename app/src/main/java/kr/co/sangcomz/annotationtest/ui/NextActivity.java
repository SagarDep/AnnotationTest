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

    @DeclareView(id = R.id.txttt)
    TextView textView;

    @BundleField(name = "et1Str")
    public String et1Str;

    @BundleField(name = "et2Str")
    public String et2Str;

    @BundleField(name = "et3Str")
    public String et3Str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BundleMapper.fromBundle(this, getIntent().getBundleExtra(null));
        setContentView(R.layout.activity_next, true);

        textView.setText("e1Str :::: " + et1Str + "\ne2Str :::: " + et2Str+ "\ne3Str :::: " + et3Str);
    }
}
