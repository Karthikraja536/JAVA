class animal{
    private String SpeciesName;

    public animal(String SpeciesName){
        this.SpeciesName = SpeciesName;
    }

    public String getSpeciesName(){
        return SpeciesName;
    }

}

class mammal extends animal{
    private Boolean HasFur;

    public mammal (String SpeciesName , Boolean HasFur){
        super(SpeciesName);
        this.HasFur = HasFur;
    }

    public Boolean getHasFur(){
        return HasFur;
    }
}

class dogie extends mammal {
    private String Breed;

    public dogie(String SpeciesName, Boolean HasFur, String Breed) {
        super(SpeciesName, HasFur);
        this.Breed = Breed;
    }

    public String getBreed() {
        return Breed;
    }

    public void display() {
        System.out.println("Species:" + getSpeciesName());
        System.out.println("Has Fur:" + getHasFur());
        System.out.println("Breed:" + getBreed());
    }
}


public class AnimalBehaviour{
    public static void main(String[] args) {
        dogie obj = new dogie("Cannie" ,true,"Beagle");

        obj.display();
    }
}