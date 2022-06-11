package com.example.shaxy;

import org.json.JSONArray;

import java.util.ArrayList;

public class jsonList {
    private JSONArray classes = new JSONArray();
    private String classesString, room, subject, teacher, start, end, uid, description, updated;
    private String hours;

    public jsonList(JSONArray classes, String classesString, String room, String subject, String teacher, String start,
                    String end, String uid, String hours, String description, String updated){
        this.room = room;
        this.classes = classes;
        this.classesString = classesString;
        this.subject = subject;
        this.teacher = teacher;
        this.start = start;
        this.end = end;
        this.uid = uid;
        this.hours = hours;
        this.description = description;
        this.updated = updated;
    }

    public JSONArray getClasses() { return classes; }
    public String getClassesString(){ return classesString; }
    public String getRoom() { return room; }
    public String getSubject() { return subject; }
    public String getTeacher() {return teacher; }
    public String getStart() { return start; }
    public String getEnd() { return end; }
    public String getUid() { return uid; }
    public String getHours() { return hours; }
    public String getDescription() { return description; }
    public String getUpdated() { return updated; }

    public void setClassesString(String classesString) { this.classesString = classesString; }
    public void setClasses(JSONArray classes) { this.classes = classes; }
    public void setRoom(String room) { this.room = room; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTeacher(String teacher) { this.teacher = teacher; }
    public void setStart(String start) { this.start = start; }
    public void setEnd(String end) { this.end = end; }
    public void setUid(String uid) { this.uid = uid; }
    public void setHours(String hours) { this.hours = hours; }
    public void setDescription(String description) { this.description = description; }
    public void setUpdated(String updated) { this.updated = updated; }
}
