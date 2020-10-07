/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Borja
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Luis Fernandez", LocalDate.of(1970,Month.MARCH,29));
        System.out.println(person.getName() + " " + person.getAge());
    }
}

