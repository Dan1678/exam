public class Patient {

    private String name;
    private String URL;
    private int age;

    public MRI MRI;
    public BP BP;

    public Patient(String name){
        this.name =name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL){
        this.URL = URL;
    }

    public void setMRI(MRI MRI) {
        this.MRI = MRI;
    }

    public MRI getMRI() {
        return MRI;
    }

    public void setBP(BP BP) {
        this.BP = BP;
    }

    public BP getBP() {
        return BP;
    }
}
