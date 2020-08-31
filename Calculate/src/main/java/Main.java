public class Main {
    public static void main(String[] args) {
        User user = new User("Георг", 4, 32000);
        int x = user.findTotal();
        System.out.println(x);
    }
}
