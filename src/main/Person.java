package main;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

   private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
   private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
   private  IntegerProperty weight;
   private int _weight = 88;

   public Person(){
       
   }
   public Person(String firstName, String lastName, int weight){
       this.firstName.set(firstName);
       this.lastName.set(lastName);
       this.weight.set(weight);
   }
   
   public StringProperty firstNameProperty(){
       return firstName;
   }

    public String getFirstName(){
        return firstName.get();
    }
    public void setFirstName(String firstName){
        this.firstName.set(firstName);
    }
   
    
    public StringProperty lastNameProperty(){
       return lastName;
   }

    public String geLastName(){
        return lastName.get();
    }
    public void seLastName(String lastName){
        this.lastName.set(lastName);
    }
    
     public IntegerProperty weightProperty(){
       if(weight == null){
           weight = new SimpleIntegerProperty(this, "weight", _weight);
           
       }
       return weight;
   }

    public int getWeight(){
        return (weight == null)?_weight:weight.get();
    }
    public void setWeight(int weight){
        if(this.weight != null || !(_weight == weight))
        {
            weightProperty().set(weight);
        }
    }
}
