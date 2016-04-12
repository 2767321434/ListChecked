package com.example.listchecked;


public class ItemBean {
    private int imgRes;
    private String title,teacher,time;
    private int peopleNum,id;
    private boolean isChecked;
    private boolean isShow;
    
    public boolean isShow() {
        return isShow;
    }
    public void setShow(boolean isShow) {
        this.isShow = isShow;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isChecked() {
        return isChecked;
    }
    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
    public int getImgRes() {
        return imgRes;
    }
    public void setImgRes(int img) {
        this.imgRes = img;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getPeopleNum() {
        return peopleNum;
    }
    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }
    
    
    
}
