public class User {
    String name;
    int experience;
    int rate;

    public User(String name, int experience, int rate) {
        this.name = name;
        this.experience = experience;
        this.rate = rate;
    }

    int findTotal(){
        return experience*1000+rate;
    }
}
