package ness.edu.innerclassesandcollections;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton fab;
    String name;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(this);

        Toast.makeText(this, "" + "avi".hashCode()
                , Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "" + "via".hashCode()
                , Toast.LENGTH_SHORT).show();


        HashSet<Person> people = new HashSet<>();
        people.add(new Person());


        String[] arr = {"a", "b", "c"};
        String s = Arrays.toString(arr);
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

        Toast.makeText(this, Arrays.toString(arr), Toast.LENGTH_SHORT).show();

        List<String> strings = Arrays.asList(arr);

        String[] lines = new String[10];
        Arrays.fill(lines, "*");



        Queue<String> l = new LinkedList<>();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Title").
                setMessage("").
                setPositiveButton("", null);

        AlertDialog alertDialog = builder.create();



        return super.onOptionsItemSelected(item);
    }




    @Override
    public void onClick(View v) {
        House.Builder b = new House.Builder();
        House newHouse = b.addRoom(10, 10).
                addRoom(20, 20).
                addRoom(10, 3).
                addRoom(10, 10) .
                setAddress("Ehad haam").build();

        Toast.makeText(this, newHouse.toString(), Toast.LENGTH_SHORT).show();

        fab.setOnClickListener(new View.OnClickListener() {
            private String s = "123";
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, this.getClass().getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static class MyFragment{
        //No Reference to the outer class.
        //No ref to MainActivity.this
    }
}
