public class Details {
    int getRateOfInterest(){
        return 0;
    }
}
class Saman extends Details{
    @Override
    int getRateOfInterest() {
        return 5;
    }
}
class Amara extends Details{
    int getRateOfInterest(){
        return 60;
    }
}
class Kamal extends Details{
    public void surname(){

        String z = "Dissanayake";
        System.out.println("Kamal's surname is "+z);
    }

    public static void main(String[] args) {
        Saman s = new Saman();
Amara a = new Amara();
        System.out.println("Saman's height "+s.getRateOfInterest()+" ft");
        System.out.println("Amara's weight "+a.getRateOfInterest()+" kg");
        Kamal k = new Kamal();
        k.surname();
    }
}