import java.util.ArrayList;
import java.util.List;

public class Ork {
   private int attack;
   private String name;
   private int def;


    public Ork(int attack, String name, int def){
        this.attack = attack;
        this.name = name;
        this.def = def;

    }


    public Ork(int attack, int def) {
        this(attack, "Ork", def);
    }

    public int getAttack(){
        return attack;
    }

    public int getDef(){
        return  def;
    }

    public String getName(){
        return  name;
    }


}
