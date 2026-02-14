package com.prac.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

    @Id
    private int id;
    private String name;

    @OneToOne
    private AadharCard aadharCard;

    @OneToOne
    private HostelRoom hostelRoom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AadharCard getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(AadharCard aadharCard) {
        this.aadharCard = aadharCard;
    }

    public HostelRoom getHostelRoom() {
        return hostelRoom;
    }

    public void setHostelRoom(HostelRoom hostelRoom) {
        this.hostelRoom = hostelRoom;
    }
}