package com.apple.eawt;

import java.awt.Image;
import java.awt.Point;
import java.awt.PopupMenu;

public class Application {
	
	public Application() {System.err.println("You are using the dummy jar!");}

    public void addAboutMenuItem() {}

    public void addApplicationListener(ApplicationListener listener) {}

    public void addPreferencesMenuItem() {}        

    public static Application getApplication() {
        return null;
    }
    
    public Image getDockIconImage() {
    	return null;
    }
    
    public PopupMenu getDockMenu() {
    	return null;
    }

    public boolean getEnabledAboutMenu() {
        return false;
    }

    public boolean getEnabledPreferencesMenu() {
        return false;
    }

    @Deprecated
    public static Point getMouseLocationOnScreen() {
        return null;
    }

    public boolean isAboutMenuItemPresent() {
        return false;
    }

    public boolean isPreferencesMenuItemPresent() {
        return false;
    }
    
    public void openHelpViewer() {}

    public void removeAboutMenuItem() {}

    public void removeApplicationListener(ApplicationListener listener) {}

    public void removePreferencesMenuItem() {}
    
    public void setDockIconBadge(String badge) {}
    
    public void setDockIconImage(Image image) {}
    
    public void setDockMenu(PopupMenu menu) {}

    public void setEnabledAboutMenu(boolean enable) {}

    public void setEnabledPreferencesMenu(boolean enable) {}
}