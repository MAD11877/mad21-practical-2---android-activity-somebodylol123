package sg.edu.np.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button followBtn = findViewById(R.id.follow);
        User user  = new User(true);
        if (user.getFollowed() == true){
            followBtn.setText("UNFOLLOW");
        }
        else{
            followBtn.setText("FOLLOW");
        }
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getFollowed() == false){
                    user.setFollowed(true);
                    followBtn.setText("UNFOLLOW");
                }
                else{
                    user.setFollowed(false);
                    followBtn.setText("FOLLOW");
                }
            }
        });
    }
    
}