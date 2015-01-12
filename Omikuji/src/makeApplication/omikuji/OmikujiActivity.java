package makeApplication.omikuji;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class OmikujiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.omikuji);
		/*
		TextView tv = (TextView) findViewById(R.id.hello_view);
		
		// くじ番号の取得
		Random rnd = new Random();
		int number = rnd.nextInt(20);

		// おみくじ棚の準備
		String[] omikujiShelf = new String[20];
		for (int i = 0; i < 20; i++) {
			omikujiShelf[i] = "吉";
		}
		omikujiShelf[0] = "大吉";
		omikujiShelf[19] = "凶";
		
		// おみくじ棚から取得
		String str = omikujiShelf[number];
		
		tv.setText(str);
		*/
	}
	
	public void onButtonClick(View v) {
		TranslateAnimation translate = new TranslateAnimation(0, 0, 0, -100);
		translate.setRepeatMode(Animation.REVERSE);
		translate.setRepeatCount(5);
		translate.setDuration(100);
		
		ImageView imageview = (ImageView)findViewById(R.id.imageView1);
		
		RotateAnimation rotate = new RotateAnimation(0, -36, imageview.getWidth() / 2, imageview.getHeight() / 2);
		rotate.setDuration(200);
		
		AnimationSet set = new AnimationSet(true);
		set.addAnimation(rotate);
		set.addAnimation(translate);
		
		imageview.startAnimation(set);
		
		/*
		ImageView image = new ImageView(this);
		image.setImageResource(R.drawable.result1);
		setContentView(image);
		*/		
	}
}
