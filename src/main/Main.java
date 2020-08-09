
package main;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Adams", 75);
        
        //System.out.println("First name: " + person.firstNameProperty().get());
        //System.out.println("Last name: " + person.lastNameProperty().get());
        //System.out.println("Weight: " + person.weightProperty().get());
        
        
       /* person.weightProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("Invalidation");
            }
        });*/
        
        person.weightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                 System.out.println("Change");
            }
        });
        
        person.weightProperty().setValue(33);
        person.weightProperty().setValue(33);
        person.weightProperty().setValue(67);
    }
}
