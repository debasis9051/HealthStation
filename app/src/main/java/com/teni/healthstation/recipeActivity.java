package com.teni.healthstation;



import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class recipeActivity extends AppCompatActivity {


VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int startColor = getWindow().getStatusBarColor();
            int endColor = ContextCompat.getColor(recipeActivity.this, R.color.recipe);
            ObjectAnimator.ofArgb(getWindow(), "statusBarColor", startColor, endColor).start();
        }
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FAD02E"));
        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);

        videoView=findViewById(R.id.videoView2);
         MediaController mediaController=new MediaController(this);
         mediaController.setAnchorView(videoView);
         Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/video-945da.appspot.com/o/Protein%20Salad%20.mp4?alt=media&token=d64b4ca0-f9aa-4adb-b614-009a520cbeb7");
         videoView.setMediaController(mediaController);
         videoView.setVideoURI(uri);
         videoView.start();



    }


}
