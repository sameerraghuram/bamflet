package com.google.android.gms.samples.vision.ocrreader.ui.camera;

import android.util.Log;

import org.ocpsoft.prettytime.nlp.PrettyTimeParser;

import java.util.Date;
import java.util.List;

/**
 * Created by Sameer on 2/18/2017.
 */

public class NaturalTimeLogger {
    private List<String> lines;

    public NaturalTimeLogger(List<String> lines){
        this.lines = lines;
    }

    public void logDates(){
        for(String line: lines){
            List<Date> dates = new PrettyTimeParser().parse(line);
            Log.d("myApp", "For line: " + line + "\nDates are:\n"+dates.toString());
        }
    }
}
