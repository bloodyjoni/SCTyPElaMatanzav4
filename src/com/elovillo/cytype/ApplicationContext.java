package com.elovillo.cytype;
import android.app.Application;
import android.content.Context;

public class ApplicationContext extends Application {
	 
	    /**
	     * Keeps a reference of the application context
	     */
	    private static Context sContext;
	 
	    @Override
	    public void onCreate() {
	        super.onCreate();
	 
	        sContext = getApplicationContext();
	 
	    }
	 
	    /**
	     * Returns the application context
	     *
	     * @return application context
	     */
	    public static Context getContext() {
	        return sContext;
	    }
	 
	}

