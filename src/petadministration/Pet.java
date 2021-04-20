package petadministration;

public abstract class  Pet {
   private String name;
    private int satiety;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    public Pet() {

    }

    public Pet(String name, int satiety, String breed) {
        this.name = name;
        this.satiety = satiety;
        this.breed = breed;
    }

    public abstract void eat();


}
