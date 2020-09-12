
package com.mizan.pojo;

import com.mizan.view.adminlogin;
import com.mizan.view.splash;


public class VotingManagement {

    public static void main(String[] args) {
        splash Splash = new splash();
        Splash.setVisible(true);
        adminlogin al = new adminlogin();

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                Splash.loadingnum.setText(Integer.toString(i) + "%");
                Splash.loadingbar.setValue(i);
                if (i == 100) {
                    Splash.setVisible(false);
                    al.setVisible(true);
                }

            }
        } catch (Exception e) {
        }

    }

    void setVisible(boolean b) {

    }
}
