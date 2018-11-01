package com.example.computer.vstopmotion;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;


    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder {
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                //1.
                if (modellist.get(postition).getTitle().equals("ยำใหญ่")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailMeActivity.class);

                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("แกงอ่อม")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailMe1Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("แกงไตปลา")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailMe2Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("พล่าเนื้อ")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailMe3Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ตับเหล็ก")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailMe4Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ข้าวเหนียวสังขยา")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailSwActivity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ซ่าหริ่ม")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailSw1Activity.class);

                    mContext.startActivity(intent);
                }if (modellist.get(postition).getTitle().equals("ฝอยทอง")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailSw2Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("บัวลอย")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailSw3Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ลำเจียก")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailSw4Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("น้อยหน่า")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailFrActivity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ทุเรียน")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailFr1Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("เงาะ")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailFr2Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("มะม่วง")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailFr3Activity.class);

                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ผลเกด")) {
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailFr4Activity.class);

                    mContext.startActivity(intent);
                }



            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}