package webaccessibility.shared;

public class NameFieldVerifier {

    public static boolean isValidName(String name) {
        if (name == null) {
            return false;
        }
        return name.length() > 3;
    }

}
