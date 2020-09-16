package Domain;

public class Place {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private int checkIns;
    private int type;
    private String country;
    private String city;
    private String address;
    private int placeUpdated;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public int getLatitude() {

        return latitude;
    }

    public void setLatitude(int latitude) {

        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {

        this.longitude = longitude;
    }

    public int getCreated() {

        return created;
    }

    public void setCreated(int created) {

        this.created = created;
    }

    public String getIcon() {

        return icon;
    }

    public void setIcon(String icon) {

        this.icon = icon;
    }

    public int getCheckIns() {

        return checkIns;
    }

    public void setCheckIns(int checkIns) {

        this.checkIns = checkIns;
    }

    public int getPlaceUpdated() {

        return placeUpdated;
    }

    public void setPlaceUpdated(int placeUpdated) {

        this.placeUpdated = placeUpdated;
    }

    public int getType() {

        return type;
    }

    public void setType(int type) {

        this.type = type;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;

    }
}
