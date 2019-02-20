import model.ZnakController;

public class Znak1 {
    public static void main(String[] args) {
        ZnakController sc = new ZnakController();
        System.out.println("Contains a:" + sc.isCharacter('a'));
        System.out.println("Contains y:" + sc.isCharacter('y'));
        System.out.println("Number of i: " + sc.countAllCharacters('E'));

    }
}
