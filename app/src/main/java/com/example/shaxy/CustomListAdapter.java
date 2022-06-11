package com.example.shaxy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private List<jsonList> listJson;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context acontext, List<jsonList> listJson){
        this.context = acontext;
        this.listJson = listJson;
        layoutInflater = LayoutInflater.from(acontext);
    }

    @Override
    public int getCount() { return listJson.size(); }

    @Override
    public Object getItem(int i) { return listJson.get(i); }

    @Override
    public long getItemId(int i) { return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            view = layoutInflater.inflate(R.layout.list_item, null);
            holder =new ViewHolder();

            holder.classesView =(TextView)view.findViewById(R.id.textViewClasses);
            holder.roomView = view.findViewById(R.id.textViewRoom);
            holder.subjectView = view.findViewById(R.id.textViewSubject);
            holder.teacherView = view.findViewById(R.id.textViewTeacher);
            holder.startView = view.findViewById(R.id.textViewStart);
            holder.endView = view.findViewById(R.id.textViewEnd);
            holder.uidView = view.findViewById(R.id.textViewUid);
            holder.hoursView = view.findViewById(R.id.textViewHours);
            holder.descriptionView = view.findViewById(R.id.textViewDescription);
            holder.updatedView = view.findViewById(R.id.textViewUpdated);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        jsonList listJson =this.listJson.get(i);

        holder.classesView.setText("Classes :"+listJson.getClassesString());
        holder.roomView.setText("room :"+listJson.getRoom());
        holder.subjectView.setText("subject :"+listJson.getSubject());
        holder.teacherView.setText("teacher :"+listJson.getTeacher());
        holder.startView.setText("start :"+listJson.getStart());
        holder.endView.setText("end :"+listJson.getEnd());
        holder.uidView.setText("uid :"+listJson.getUid());
        holder.hoursView.setText("hourse :"+listJson.getHours());
        holder.descriptionView.setText("description :"+listJson.getDescription());
        holder.updatedView.setText("update :"+listJson.getUpdated());


        return view;
    }

    static class ViewHolder {
        TextView classesView, roomView,subjectView, teacherView, startView,
                endView, uidView, descriptionView, updatedView, hoursView;
    }
}
