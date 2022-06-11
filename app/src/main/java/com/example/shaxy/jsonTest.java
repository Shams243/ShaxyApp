package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.AdapterView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jsonTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_test);

        ListView lv = findViewById(R.id.listView);

        InputStream is = null;
        try {
            is = getApplicationContext().getAssets().open("json");
            String jsonString = (new Scanner(is)).useDelimiter("\\Z").next();
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray jsonArray = jsonObject.getJSONArray("data");

            List<jsonList> details = getListData(jsonArray);
            lv.setAdapter(new CustomListAdapter(this, details));

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    private List<jsonList> getListData(JSONArray jsonArray) throws JSONException {
        List<jsonList> list = new ArrayList<jsonList>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject scheduleObject = jsonArray.getJSONObject(i);
            JSONArray classesAray = scheduleObject.getJSONArray("classes");
            int sizeClases = classesAray.length();
            String classesString = ""; String separateur = ", "; int j = 0;
             while (j < sizeClases) {
                if (j == sizeClases - 1)
                    separateur = "";
                classesString = classesString + classesAray.getString(j) + separateur;
                j++;
            }
            JSONArray classes = scheduleObject.getJSONArray("classes");
            String room = scheduleObject.getString("room");
            String subject = scheduleObject.getString("subject");
            String teacherAbbreviation = scheduleObject.getString("teacherAbbreviation");
            String start = scheduleObject.getString("start");
            String end = scheduleObject.getString("end");
            String uid = scheduleObject.getString("uid");
            String hoursMask = scheduleObject.getString("hoursMask");
            String description = scheduleObject.getString("description");
            String updatedAt = scheduleObject.getString("updatedAt");
            jsonList ob = new jsonList(classes,classesString,room, subject, teacherAbbreviation,
                    start, end, uid, hoursMask, description, updatedAt);
            list.add(ob);
        }
        return list;
    }
}