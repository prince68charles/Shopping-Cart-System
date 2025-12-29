package DataModles;

public class Customer {

    private final String id;
    private final String name;
    private final String email;
    private final MembershipLevel level;



    Customer(String id, String name, String email, MembershipLevel level) {

        this.id= id;
        this.name = name;
        this.email = email;
        this.level = level;


    }


    enum MembershipLevel {BASIC, SILVER, GOLD;}


}
