package com.codingwithmitch.googlemaps2018;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.codingwithmitch.googlemaps2018.models.User;


public class UserClient extends Application {

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
