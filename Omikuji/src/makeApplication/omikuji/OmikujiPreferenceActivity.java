package makeApplication.omikuji;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class OmikujiPreferenceActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference);
	}

}
