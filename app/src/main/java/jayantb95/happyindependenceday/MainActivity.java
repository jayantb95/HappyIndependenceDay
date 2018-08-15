package jayantb95.happyindependenceday;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    private ImageView imgAshokaChakra;
    private LinearLayout linLayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        imgAshokaChakra = findViewById(R.id.img_ashoka_chakra);
        linLayText = findViewById(R.id.lin_lay_text);
        startAnimation();
    }

    private void startAnimation() {
        Animation animFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        linLayText.setAnimation(animFade);
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(5000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);

        imgAshokaChakra.startAnimation(rotateAnimation);
    }
}
