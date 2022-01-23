package Ch10_OOThinking;

public class StringWrapperTest {
    public static void main(String[] args) {
        StringWrapper str = new StringWrapper("ABcdef1");
        if (!str.isPasswordValid()){
            System.out.println("invalid password");
        }
        else if (!str.containsAtLeastOneUppercase()){
            System.out.println("Should contain at least one uppercase");
        }
    }
}
