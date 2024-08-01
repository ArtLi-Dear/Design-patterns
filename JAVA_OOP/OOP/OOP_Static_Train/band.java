package OOP.OOP_Static_Train;

public class band {

    private int id;
    private String username;
    private String  password;

    public band(){

    };
    public band(int id,String username,String password){
       this.username = username;
       this.password = password;
    };

    @Override
    public String toString() {
        return "band{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void setMinMonnney(double minMonnney) {
        band.minMonnney = minMonnney;
    }

    public static void setRent(String rent) {
        band.rent = rent;
    }

    static double minMonnney;
    static String rent;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
