package com.sundyn.www.gitresp001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
	private static final String TAG = "MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG, "onCreate: first commit!");
		Log.i(TAG, "onCreate: second commit!");
		Log.i(TAG, "onCreate: third commit!");
		Log.d(TAG, "onCreate: fourth commit!");
		// 添加了注释，观察branch与master之间的联系
		Log.i(TAG, "onCreate: back to initialized!");
		/**
		 *
		 */
		test();
	}

	private void test(){

	}
}
