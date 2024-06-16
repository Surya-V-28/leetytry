
import java.util.*;
public class MaximumTotalDamageWithSpell {
    public static void main(String[] args){
        int[] power = {7,1,6,6};
        int damage1 = 0, damage2 = 0, damage3 = 0;

        // Iterate through the power array
        for (int p : power) {
          // Calculate the new damage for each spell value considering the restriction
          int newDamage1 = Math.max(damage2, damage3) + p;
          int newDamage2 = Math.max(damage1, damage3) + p;
          int newDamage3 = damage1 + p;
    
          // Update the damage values with the maximum possible damage
          damage1 = newDamage1;
          damage2 = newDamage2;
          damage3 = newDamage3;
        }
    
        // Return the maximum damage among the three possibilities
        int as = Math.max(damage1, Math.max(damage2, damage3));
        System.out.println(as);
    }
}

