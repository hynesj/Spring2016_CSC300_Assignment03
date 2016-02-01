package com.example.awesomefat.linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        LinearLayout svLL = (LinearLayout)this.findViewById(R.id.scrollViewLL);
        LinkedList ll = new LinkedList(svLL);
        ll.display();
        //////////////////////////////////////////////////////added tests
        ll.addFront("AAAAAAA");
        System.out.println("Added 1 Front");
        ll.display();
        ll.addFront("BBBBBBB");
        System.out.println("Added 2nd Front");
        ll.display();
        Node n;
        n = ll.removeFront();
        if (n != null)
            n.display();
        else
            System.out.println("null");
        System.out.println("removed front");
        ll.display();
        n = ll.removeFront();
        if (n != null)
            n.display();
        else
            System.out.println("null");
        System.out.println("removed front");
        ll.display();
        ll.removeFront();
        ll.removeFront();
        ll.removeFront();
        System.out.println("attempted to remove nonexistent front 3 times");
        ll.display();
        /////////////////////////////////////////////////////////////////



        View v;
        for(int i = 0; i < 1000; i++)
        {
            v = this.getLayoutInflater().inflate(R.layout.node, null);
            svLL.addView(v);
        }

    }

    public void theButtonClicked(View sender)
    {
        //I want to change the text on my label
    }
}
