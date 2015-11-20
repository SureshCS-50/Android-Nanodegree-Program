package udacity.suresh.mynanodegreecatalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        String message = "";
        switch(view.getId()){
            case R.id.btn_spotify:
                message = "This button will launch Spotify streamer";
                break;
            case R.id.btn_scores:
                message = "This button will launch Scores Application";
                break;
            case R.id.btn_library:
                message = "This button will launch My Library Application";
                break;
            case R.id.btn_bigger:
                message = "This button will launch an Application that will be built something bigger!";
                break;
            case R.id.btn_xyz_reader:
                message = "This button will launch a reader";
                break;
            case R.id.btn_my_own_app:
                message = "This button will launch My own application";
                break;
            default:
                return;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
