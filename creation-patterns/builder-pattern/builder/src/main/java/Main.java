public class Main {
    public static void main(String[] args) {
        System.out.println("Builder pattern");
         UserBuilder userBuilder = new UserBuilder.Builder().name("Ross").email("alpha-1").build();
        userBuilder.print();
    }
}
