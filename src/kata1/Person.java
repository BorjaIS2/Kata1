/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;

/**
 *
 * @author Borja
 */
public class Person {
    private final String name;
    private final LocalDate birthname;
    
    public Person(String name,LocalDate birthname) {
        this.name=name;
        this.birthname=birthname;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthname() {
        return birthname;
    }
    
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - birthname.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365.25);
    }   
}
