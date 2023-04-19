package net.salesianos.pokemins.general;

public class Pokemon {
    protected String name;
    protected String type;
    protected double height;
    protected double weight;
    protected String description;

    protected boolean captured;

    public Pokemon(String name, String type, double height, double weight, String description) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    @Override
    public String toString() {
        if (captured) {
            String msg;
            msg = "----------------------------—===" + name + "===—-------------------------\n" +
                    "*" + type + " \n" +
                    "*" + height + "\n" +
                    "*" + weight + "\n" +
                    "*" + description + "\n" +
                    "=========================================================================";
            return msg;
        } else {
            String msg;
            msg = "----------------------------—===" + name + "===—-------------------------\n" +
                    "*" + type + " \n" +
                    "* ?? " + "\n" +
                    "* ?? " + "\n" +
                    "* ?? " + "\n" +
                    "=========================================================================";
            return msg;
        }

    }
}
