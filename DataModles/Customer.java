package DataModles;

public class Customer {

    private final String id;
    private final String name;
    private final String email;
    private final MembershipLevel level;



    public Customer(String id, String name, String email, MembershipLevel level) {

        this.id= id;
        this.name = name;
        this.email = email;
        this.level = level;


    }

    public String getId() {return this.id;}
    public String getName() {return this.name;}
    public String getEmail() {return this.email;}
    public MembershipLevel getLevel() {return this.level;}

    public enum MembershipLevel {

        BASIC,
        SILVER,
        GOLD;

    }
}


