package lambda;

public class Sapling {

    private String species;

    private int height;

    public Sapling(String species, int height) {
        this.species = species;
        this.height = height;
    }

    public void cut(int maxHeight) {
        height = Math.min(height, maxHeight);
    }

    public String getSpecies() {
        return species;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
