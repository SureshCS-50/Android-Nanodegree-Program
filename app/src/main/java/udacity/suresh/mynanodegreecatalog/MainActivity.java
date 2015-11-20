package udacity.suresh.mynanodegreecatalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        if(mToast != null){
            mToast.cancel();
        }
        mToast = Toast.makeText(this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT);
        mToast.show();
    }
}
