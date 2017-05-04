package com.a4nesia.motherchoice;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Dhian on 02/05/2017.
 */

public class MotherChoice extends Application {

    public static ArrayList<Resep> listNotification = new ArrayList<>();
    public static double progress = 0;
    public static double minggu1 = 0;
    public static double minggu2 = 0;
    public static double minggu3 = 0;
    public static double minggu4 = 0;

    public static void addNotif(Resep resep){
        boolean exist = false;
        for(Resep r : listNotification){
            if(r.getName().equals(resep.getName()))
                exist = true;
        }
        if(!exist) listNotification.add(resep);
    }
}
