/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern1;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class movieStudio implements Subject{
private String studioName;
private ArrayList<Observer> subscriptioners;
public movieStudio(String studioName) {
this.studioName = studioName;
subscriptioners = new ArrayList<Observer>();
}

@Override
public void register(Observer o) {
subscriptioners.add(o);
System.out.println(o + " has started following " + studioName);
}

@Override
public void unregister(Observer o) {
subscriptioners.remove(o);
System.out.println(o + " has stopped following " + studioName);
}

@Override
public void notifyAllObservers(String news) {
for(Observer subscriptioner : subscriptioners)
{
subscriptioner.update(studioName, news);
}
System.out.println();
}

public void news(String news)
{
System.out.println("\n" + studioName + " latest new is: " + news + "\n");
notifyAllObservers(news);
}
}
