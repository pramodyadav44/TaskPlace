package com.example.pramod.taskplace.Model;
/**
 * Created by pramod on 11/1/18.
 */
public class TaskDetails {
    private String task_id;
    private String task_title;
    private String lng;
    private String lat;
    private String place;
    private String taskdate;
    private String taskDesc;
    public TaskDetails(){}
    public TaskDetails(String content, String taskDesc, String place, String taskdate,String task_id) {
        this.task_title = content;
        this.place = place;
        this.taskdate = taskdate;
        this.taskDesc = taskDesc;
        this.task_id=task_id;
    }

    public void setTaskid(String taskid){
        this.task_id=taskid;
    }
    public void setTaskTitle(String content){
        this.task_title=content;
    }
    public void setLat(String lat){
        this.lat=lat;
    }
    public void setLng(String lng){
        this.lng=lng;
    }
    public void setPlace(String place){
        this.place=place;
    }
    public String getTaskid(){
        return task_id;
    }
    public String getTaskTitle(){
        return task_title;
    }
    public String getPlace(){
        return place;
    }
    public void setTaskdate(String date){
        this.taskdate=date;
    }
    public String getTaskdate(){
        return taskdate;
    }
    public void setTaskDesc(String taskDesc){
        this.taskDesc=taskDesc;
    }
    public String getTaskDesc(){
        return taskDesc;
    }
    public String getLat(){return lat;}
    public String getLng(){return lng;}


}

