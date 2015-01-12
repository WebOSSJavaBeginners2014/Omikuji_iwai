package makeApplication.omikuji;

import java.util.Random;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class OmikujiBox implements AnimationListener {
	private int number;	// くじ番号
	private ImageView imageView;

	public void setImageView(ImageView imageView) {
		this.imageView = imageView;
	}

	public int getNumber() {
		return number;
	}

	public OmikujiBox() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.number = -1;
	}

	public void shake(){
		TranslateAnimation translate = new TranslateAnimation(0, 0, 0, -100);
		translate.setRepeatMode(Animation.REVERSE);
		translate.setRepeatCount(5);
		translate.setDuration(100);

		RotateAnimation rotate = new RotateAnimation(0, -36, this.imageView.getWidth() / 2, this.imageView.getHeight() / 2);
		rotate.setDuration(200);
		
		AnimationSet set = new AnimationSet(true);
		set.addAnimation(rotate);
		set.addAnimation(translate);

		set.setAnimationListener(this);
		this.imageView.startAnimation(set);
	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		this.number = rnd.nextInt(20);
		this.imageView.setImageResource(R.drawable.omikuji_result);
	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
