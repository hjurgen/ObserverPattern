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
public class Subscriptioner implements Observer{
private String subscriptionerName;
public Subscriptioner(String subscriptionerName) {
this.subscriptionerName = subscriptionerName;
}

@Override
public void update(String studioName , String news) {
System.out.println(subscriptionerName + " has received "+ studioName + "'s latest news: "+  news);
}
@Override
public String toString() {
return subscriptionerName;
}
}