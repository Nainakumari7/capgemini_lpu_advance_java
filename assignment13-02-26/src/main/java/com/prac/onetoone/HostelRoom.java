package com.prac.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HostelRoom {

    @Id
    private int roomNo;
    private String blockName;

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }
}
