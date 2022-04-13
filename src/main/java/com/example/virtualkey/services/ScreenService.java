package com.example.virtualkey.services;

import com.example.virtualkey.screens.FileOptionsScreen;
import com.example.virtualkey.screens.Screen;
import com.example.virtualkey.screens.WelcomeScreen;
import com.example.virtualkey.entities.Directory;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
