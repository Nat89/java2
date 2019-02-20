package model;

public class ZnakController {

    String content = "Example content: Loren ipsum lorem ipsum";

    public boolean isCharacter(char c) {
        int search = content.indexOf(c);
        return search != -1 ? true : false;
    }
    public int countAllCharacters(char c) {
        int charCounter = 0;
        String text = content.toUpperCase();
        for (int i = 0; i < content.length(); i++) {
            if(text.charAt(i) == c) {
                charCounter++;

            }
    }
        return  charCounter;
}
}