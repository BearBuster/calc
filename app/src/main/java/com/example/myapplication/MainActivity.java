package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


        import android.app.Activity;
        import android.content.Intent;
        import android.text.TextUtils;

        import android.os.Bundle;

        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    TextView tvResult;

    String oper = "";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the elements
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        tvResult = (TextView) findViewById(R.id.tvResult);

        // set a listener
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        // check if the fields are empty
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        // read EditText and fill variables with numbers
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output
        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }

        // form the output line
        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub


        menu.add("Calculator");
        menu.add("Desene");
        menu.add("Main");
        menu.add("Camera");
        menu.add("GraphFun");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub


        if(item.getTitle()=="Main")
        {
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if(item.getTitle()=="Main")
        {

        }
        if(item.getTitle()=="GraphFun")
        {

        }
        if(item.getTitle()=="Camera")
        {
    	/*
    	try {
			Intent myIntentA1A2 = new Intent(MainActivity.this,
					MainActivity2.class);

			Bundle myData = new Bundle();
			myData.putString("myString1", "Hello Android");
			myData.putDouble("myDouble1", 3.141592);
			int[] myLittleArray = {2,1, 4 };
			myData.putIntArray("myIntArray1", myLittleArray);

			myIntentA1A2.putExtras(myData);

			startActivityForResult(myIntentA1A2,IPC_ID);
		} catch (Exception e) {
			Toast.makeText(getBaseContext(), e.getMessage(),
					Toast.LENGTH_LONG).show();
		}
		*/
        }
        if(item.getTitle()=="Desene")
        {

    	/*
			try {
				Intent myIntentA1A2 = new Intent(MainActivity.this,
						Intent2.class);

				Bundle myData = new Bundle();
				myData.putString("myString1", "Hello Android");
				myData.putDouble("myDouble1", 3.141592);
				int[] myLittleArray = { 50, 2, 3 };
				myData.putIntArray("myIntArray1", myLittleArray);

				myIntentA1A2.putExtras(myData);

				startActivityForResult(myIntentA1A2,IPC_ID);
			} catch (Exception e) {
				Toast.makeText(getBaseContext(), e.getMessage(),
						Toast.LENGTH_LONG).show();
			}
		*/

        }

        return super.onOptionsItemSelected(item);
    }
}

