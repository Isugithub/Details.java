public class Monkey {
    String a = "Can run";
    String b = "Can jump";

}
class Man extends Monkey{
    String c = "Can't climb";

    public static void main(String[] args) {
        Man man = new Man();
        System.out.println(man.a);
        System.out.println(man.b);
        System.out.println(man.c);
    }
}