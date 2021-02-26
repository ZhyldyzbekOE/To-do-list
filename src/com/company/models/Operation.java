package com.company.models;

import com.company.enums.AffairStatus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Operation {

    private double id;
    private Date startDate;
    private Date endDate;
    private AffairStatus status;
    private ArrayList<Affairs> affairs;
    private String idCard;
    private int day;

    public Operation(int day, String idCard) {
        Calendar calendar = Calendar.getInstance();

        this.id = Math.random();
        this.startDate = calendar.getTime();

        calendar.add(Calendar.DAY_OF_YEAR, day);
        this.endDate = calendar.getTime();
        this.status = AffairStatus.OPEN;
        this.idCard = idCard;
        this.affairs = new ArrayList<>();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public AffairStatus getStatus() {
        return status;
    }

    public void setStatus(AffairStatus status) {
        this.status = status;
    }

    public ArrayList<Affairs> getAffairs() {
        return affairs;
    }

    public void addAffairs(Affairs affair){
        affairs.add(affair);
    }

    public int getDay() {
        return day;
    }

    public void setDays(int day) {
        this.day = day;
    }
}
