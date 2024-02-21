package Exceptions;

import Human.Person;
import enums.Location;

public class InvalidHeightExeption extends RuntimeException{
    public InvalidHeightExeption(Person person){
        super(generateMessage(person));
    }
    public static  String generateMessage(Person person){
        StringBuilder message = new StringBuilder("It is error");
        if (person.getHeight()<0 && (person.getLocation()==Location.FOREST || person.getLocation()==Location.PATH || person.getLocation()== Location.STATION))
        {
            message.append(" You cant be lower than the ground if you are alive");
        }
        return  message.toString().trim();
}
}
