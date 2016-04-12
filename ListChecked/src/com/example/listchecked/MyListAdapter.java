package com.example.listchecked;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter
{
    private LayoutInflater inflater;
    private List<ItemBean> items;
    private ItemBean item;
    private OnShowItemClickListener onShowItemClickListener;
    
    public MyListAdapter(List<ItemBean> list,Context context)
    {
	items=list;
	inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
	// TODO �Զ����ɵķ������
	return items.size();
    }

    @Override
    public Object getItem(int position) {
	// TODO �Զ����ɵķ������
	return items.get(position);
    }

    @Override
    public long getItemId(int position) {
	// TODO �Զ����ɵķ������
	return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
	// TODO �Զ����ɵķ������
	ViewHolder holder;
	if(convertView==null)
	{
	    holder=new ViewHolder();
	    convertView=inflater.inflate(R.layout.item_view, null);
	    holder.img=(ImageView) convertView.findViewById(R.id.imageView1);
	    holder.cb=(CheckBox) convertView.findViewById(R.id.checkBox1);
	    holder.title=(TextView)convertView.findViewById(R.id.title);
	    holder.teacher=(TextView) convertView.findViewById(R.id.teacher);
	    holder.time=(TextView) convertView.findViewById(R.id.time);
	    holder.poeple=(TextView)convertView.findViewById(R.id.peopleNum);
	    convertView.setTag(holder);
	}else
	{
	   holder=(ViewHolder) convertView.getTag();
	}
	item=items.get(position);
	if(item.isShow())
	{
	    holder.cb.setVisibility(View.VISIBLE);
	}
	else
	{
	    holder.cb.setVisibility(View.GONE);
	}
	holder.img.setImageResource(item.getImgRes());
	holder.title.setText(item.getTitle());
	holder.teacher.setText("������"+item.getTeacher());
	holder.time.setText("��ʱ��"+item.getTime()+"��");
	holder.poeple.setText("ѧϰ������"+item.getPeopleNum());
	
	holder.cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	    
	   

	    @Override
	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(isChecked)
		{
		    item.setChecked(true);
		}
		else
		{
		    item.setChecked(false);
		}
		//�ص���������item������ѡ���
		onShowItemClickListener.onShowItemClick(item);
	    }
	});
	//����������ѡ��״̬
	holder.cb.setChecked(item.isChecked());
	return convertView;
    }
    
    static class ViewHolder
    {
	ImageView img;
	CheckBox cb;
	TextView title,teacher,time,poeple;
	
    }
    
    public interface OnShowItemClickListener {
	public void onShowItemClick(ItemBean bean);
    }
    
    public void setOnShowItemClickListener(OnShowItemClickListener onShowItemClickListener) {
	this.onShowItemClickListener = onShowItemClickListener;
}
}
