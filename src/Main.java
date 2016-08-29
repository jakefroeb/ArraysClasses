public class Main {

    public static void main(String[] args) {

        Dog dog= new Dog();
            dog.age= 14;
            dog.medicines= new String[2];
                dog.medicines[0]= "Flea medicine";
                dog.medicines[1]= "Arthritis medicine";
            dog.name= "Chopper";

        NFL nfl = new NFL();
            nfl.isGood=false;
            nfl.state= "Tennessee";
            nfl.superbowls= 0;
            nfl.teamName= "Titans";

        Painting painting = new Painting();
            painting.artist= "Van Gogh";
            painting.inMuseum= true;
            painting.name= "Starry Night";
            painting.year=1889;

        Shoe shoe = new Shoe();
            shoe.brand= "Nike";
            shoe.isMale= true;
            shoe.size= 10.5;
            shoe.style = "Dunks";

        Food food = new Food();
            food.amount=9;
            food.isHealthy=true;
            food.name= "Peas";
            food.temperature= 14.76;
            food.type= "Vedgatable";

        HotChicken chicken = new HotChicken();
            chicken.coordinates= new double[2][2];
                chicken.coordinates[0][0]=(26.6);
                chicken.coordinates[0][1]=(132.6);
                chicken.coordinates[1][0]=(46.8);
                chicken.coordinates[1][1]=(146.7);
            chicken.isHot=true;
            chicken.name="Princes";
            chicken.sides= new String[6];
                chicken.sides[0]="Butter Beans";
                chicken.sides[1]="Black eyed peas";
                chicken.sides[2]="Mashed potatoes";
                chicken.sides[3]="Fries";
                chicken.sides[4]="Sweet Potatoes";
                chicken.sides[5]="Collard Greens";
            chicken.stores= 2;




    }
}
