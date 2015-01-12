package makeApplication.omikuji;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OmikujiActivity extends Activity {
	
	// おみくじ棚の配列
	private OmikujiParts[] omikujiShelf = new OmikujiParts[20];
	private OmikujiBox omikujibox = new OmikujiBox();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.omikuji);
		
		this.omikujibox.setImageView((ImageView)findViewById(R.id.imageView1));
		
		// おみくじ棚の準備
		for (int i = 0; i < 20; i++) {
			omikujiShelf[i] = new OmikujiParts(R.drawable.result2, R.string.contents1);
		}
		omikujiShelf[0].drawID = R.drawable.result1;
		omikujiShelf[0].fortuneID = R.string.contents2;

		omikujiShelf[1].drawID = R.drawable.result3;
		omikujiShelf[1].fortuneID = R.string.contents9;

		omikujiShelf[2].fortuneID = R.string.contents3;
		omikujiShelf[3].fortuneID = R.string.contents4;
		omikujiShelf[4].fortuneID = R.string.contents5;
		omikujiShelf[5].fortuneID = R.string.contents6;

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
	
	public void drawResult() {
		
		// おみくじ棚から取得
		OmikujiParts op = omikujiShelf[omikujibox.getNumber()];
		
		// レイアウトを運勢表示に変更
		setContentView(R.layout.fortune);
		
		// 画像とテキストを変更
		ImageView imageView = (ImageView)findViewById(R.id.imageView1);
		imageView.setImageResource(op.drawID);
		TextView textView = (TextView)findViewById(R.id.textView1);
		textView.setTextColor(Color.BLACK);
		textView.setText(op.fortuneID);
	}
	
	public void onButtonClick(View v) {
		
		this.omikujibox.shake();
		
		/*
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
		*/
		
		/*
		ImageView image = new ImageView(this);
		image.setImageResource(R.drawable.result1);
		setContentView(image);
		*/		
	}
}
