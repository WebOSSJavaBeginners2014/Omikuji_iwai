package makeApplication.omikuji;

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
		tv.setText("おみくじアプリ");
	}
}
