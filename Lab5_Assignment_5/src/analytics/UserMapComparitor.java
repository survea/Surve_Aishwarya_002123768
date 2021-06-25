/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

import static com.sun.tools.javac.main.Option.O;
import java.util.Comparator;
import java.util.HashMap;
import model.User;

/**
 *
 * @author dhairyasheel
 */
public class UserMapComparitor implements Comparator<User>{
    
    HashMap<Integer, Integer> postNumbers;
    public UserMapComparitor(HashMap<Integer, Integer> postNumbers) {
        this.postNumbers = postNumbers;
    }

    @Override
    public int compare(User o1, User o2) {
       return Integer.compare(
          ((postNumbers.get(o1.getId()) == null) ? 0 :postNumbers.get(o1.getId())),
          ((postNumbers.get(o2.getId()) == null) ? 0 :postNumbers.get(o2.getId()))
       );
    }
    
}