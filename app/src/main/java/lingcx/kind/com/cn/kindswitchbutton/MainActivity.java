package lingcx.kind.com.cn.kindswitchbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import lingcx.kind.com.cn.library.KindSwitchButton;

/**
 * @author ling_cx
 * @version 1.0
 * @Description 开关控件demo
 * @date 2018/5/26 0025.
 * @Copyright: 2018 www.kind.com.cn Inc. All rights reserved.
 */
public class MainActivity extends AppCompatActivity {
    protected final String TAG = this.getClass().getSimpleName();
    private KindSwitchButton mKindSwitchButton;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mKindSwitchButton = findViewById(R.id.kind_sw);
        mKindSwitchButton.setOnStateChangedListener(new KindSwitchButton.OnStateChangedListener() {
            @Override
            public void toggleToOn() {
                Log.d(TAG, "toggleToOn: ");
            }

            @Override
            public void toggleToOff() {
                Log.d(TAG, "toggleToOff: ");
            }
        });
    }
}
