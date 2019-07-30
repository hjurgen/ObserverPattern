/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern1;

/**
 *
 * @author User
 */
public class ObserverDesignPattern {
public static void main(String[] args) {
movieStudio marvel = new movieStudio("Marvel");
movieStudio dc = new movieStudio("DC");
Subscriptioner john = new Subscriptioner("John");
Subscriptioner barack = new Subscriptioner("Barack");
Subscriptioner donald = new Subscriptioner("Donald");
marvel.register(john);
marvel.register(barack);
dc.register(john);
dc.register(donald);
marvel.news("Avengers: Endgame crushes Avatar’s all-time box office record");
dc.news("Aqualad Swims Up to DC Universe's Titans");
marvel.unregister(john);
}
}
