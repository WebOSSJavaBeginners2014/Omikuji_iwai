package makeApplication.omikuji;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OmikujiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// 文字を表示する
		TextView tv = (TextView) findViewById(R.id.hello_view);
		
		String str = "大吉";
		Random rnd = new Random();
		int number = rnd.nextInt(3);
		if (number == 0) {
			str = "吉";
		}
		else if (number == 1) {
			str = "凶";
		}
		tv.setText(str);
	}
}
