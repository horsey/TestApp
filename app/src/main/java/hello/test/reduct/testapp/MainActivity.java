package hello.test.reduct.testapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//Not imported by the default Studio template
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button helloButton;
    private View.OnClickListener helloListener;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialzeApp();
    }

    private void initialzeApp() {

        helloButton =  (Button) findViewById(R.id.button);

        helloListener = new View.OnClickListener() {
            public void onClick(View v) {
            sayHello();
            }
        };

        helloButton.setOnClickListener(helloListener);
    }

    private void sayHello() {
        text = (TextView) findViewById(R.id.text);

        text.setText("Hello World!");



    }

}
