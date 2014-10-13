package com.nvee.first;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button loginButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*
		 * 初始化控件
		 */
		loginButton = (Button) findViewById(R.id.button1);
		/*
		 * 通过监听方式实现匿名内部类
		 */
		
		loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showProt("登陆成功");
			}
		});
	
	}
	
	public void showProt(String str){
		Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
	}
//	public void onClickBtn(View view){
//
//		System.out.println("登陆成功");
//	}
}
