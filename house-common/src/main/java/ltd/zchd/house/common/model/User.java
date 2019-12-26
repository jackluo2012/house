package ltd.zchd.house.common.model;


public class User {
    private long id;
    private String name;
    private String phone;
    private String email;
    private String abuoutme;
    private String avatar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbuoutme() {
        return abuoutme;
    }

    public void setAbuoutme(String abuoutme) {
        this.abuoutme = abuoutme;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
