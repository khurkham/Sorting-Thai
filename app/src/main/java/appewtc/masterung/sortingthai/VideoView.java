package appewtc.masterung.sortingthai;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;

public class VideoView extends AppCompatActivity {

    private android.widget.VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        videoView = (android.widget.VideoView) findViewById(R.id.videoView);

        try {

            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
            videoView.setMediaController(mediaController);
            videoView.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }   // Main Method

}   // Main Class
