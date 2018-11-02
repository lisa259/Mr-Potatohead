package com.example.mylenovo.potato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // If checkbox is clicked by user, call function checkClicked with parameter v
    public void checkClicked(View v) {
        // v is the clicked checkbox
        CheckBox checkbox = (CheckBox) v;
        // Get the name of the checkbox
        String element = checkbox.getText().toString();

        // Define a imageview, dont use it yet
        ImageView image = null;

        // Compare name checkbox, to see witch view should be used
        switch (element) {
            // If name of checkbox = Arms, view of arms image should be used
            case "Arms" :
                image = (ImageView) findViewById(R.id.arms);
                break;
            case "Ears" :
                image = (ImageView) findViewById(R.id.ears);
                break;
            case "Eyebrows" :
                image = (ImageView) findViewById(R.id.eyebrows);
                break;
            case "Eyes" :
                image = (ImageView) findViewById(R.id.eyes);
                break;
            case "Glasses" :
                image = (ImageView) findViewById(R.id.glasses);
                break;
            case "Hat" :
                image = (ImageView) findViewById(R.id.hat);
                break;
            case "Mouth" :
                image = (ImageView) findViewById(R.id.mouth);
                break;
            case "Mustache" :
                image = (ImageView) findViewById(R.id.mustache);
                break;
            case "Nose" :
                image = (ImageView) findViewById(R.id.nose);
                break;
            case "Shoes" :
                image = (ImageView) findViewById(R.id.shoes);
                break;
        }

        // If no case match the checkboxs name (no image to use) return aka do nothing
        if (image == null) {
            return;
        }

        // If image is found, change visible to invisible and vice versa
        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }

    // Safe current state of images in outstate
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        outState.putInt("arms", findViewById(R.id.arms).getVisibility());
        outState.putInt("ears", findViewById(R.id.ears).getVisibility());
        outState.putInt("eyebrows", findViewById(R.id.eyebrows).getVisibility());
        outState.putInt("eyes", findViewById(R.id.eyes).getVisibility());
        outState.putInt("glasses", findViewById(R.id.glasses).getVisibility());
        outState.putInt("hat", findViewById(R.id.hat).getVisibility());
        outState.putInt("mouth", findViewById(R.id.mouth).getVisibility());
        outState.putInt("mustache", findViewById(R.id.mustache).getVisibility());
        outState.putInt("nose", findViewById(R.id.nose).getVisibility());
        outState.putInt("shoes", findViewById(R.id.shoes).getVisibility());
    }

    // By entering app or turning device, apply last state of images
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        findViewById(R.id.arms).setVisibility(inState.getInt("arms"));
        findViewById(R.id.ears).setVisibility(inState.getInt("ears"));
        findViewById(R.id.eyebrows).setVisibility(inState.getInt("eyebrows"));
        findViewById(R.id.eyes).setVisibility(inState.getInt("eyes"));
        findViewById(R.id.glasses).setVisibility(inState.getInt("glasses"));
        findViewById(R.id.hat).setVisibility(inState.getInt("hat"));
        findViewById(R.id.mouth).setVisibility(inState.getInt("mouth"));
        findViewById(R.id.mustache).setVisibility(inState.getInt("mustache"));
        findViewById(R.id.nose).setVisibility(inState.getInt("nose"));
        findViewById(R.id.shoes).setVisibility(inState.getInt("shoes"));
    }
}

