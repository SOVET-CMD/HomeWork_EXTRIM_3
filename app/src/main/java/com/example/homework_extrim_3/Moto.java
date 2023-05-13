package com.example.homework_extrim_3;

public class Moto {
    private String model;
    private String year;
    private String released;
    private int motoResource;
    public Moto(String model, String year, String released, int motoResource){
        this.model = model;
        this.year = year;
        this.released = released;
        this.motoResource = motoResource;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }

    public String getReleased(){
        return released;
    }
    public void setReleased(String released){
        this.released = released;
    }
    public int getMotoResource(){
        return motoResource;
    }
    public void setMotoResource(int motoResource){
        this.motoResource = motoResource;
    }
}
