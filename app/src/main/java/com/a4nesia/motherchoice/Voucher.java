package com.a4nesia.motherchoice;

/**
 * Created by Dhian on 29/04/2017.
 */

public class Voucher {

    private String name;
    private int drawableId;
    private boolean status;

    public Voucher(String name, int drawableId) {
        this.name = name;
        this.drawableId = drawableId;
        status = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }
}
