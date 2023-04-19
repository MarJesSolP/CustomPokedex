package net.salesianos.pokemins.legendario;

import net.salesianos.pokemins.general.Pokemon;

public class Legendario extends Pokemon {
    private String location;

    public Legendario(String name, String type, double height, double weight, String description, String location) {
        super(name, type, height, weight, description);
        this.location = location;
    }

    public Legendario(String name, String type, String location) {
        super(name, type);
        this.location = location;
    }
    @Override
    public String toString() {
        if(captured){
            String msg;
            msg = "----------------------------—===" + name + "===—-------------------------\n" +
                    "*" + type + " \n" +
                    "*" + height + "\n" +
                    "*" + weight + "\n" +
                    "*" + location + "\n" +
                    "*" + description + "\n" +
                    "=========================================================================";
            return msg;
        }else {
            String msg;
            msg = "----------------------------—===" + name + "===—-------------------------\n" +
                    "*" + type + " \n" +
                    "*" + location + " \n" +
                    "* ?? " + "\n" +
                    "* ?? " + "\n" +
                    "* ?? "  + "\n" +
                    "=========================================================================";
            return msg;
        }

    }
}
