public class MRI extends Exam{
    private String URL;
    private String date;
    private double strength;
    public MRI(String date){
        super(date);
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

}
