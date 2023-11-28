public class BP extends Exam{
    private double syst_press;
    private double diast_press;
    private String date;
    private String term;

    public BP(String date){
        super(date);
    }

    public double getDiast_press() {
        return diast_press;
    }

    public void setDiast_press(double diast_press) {
        this.diast_press = diast_press;
    }

    public double getSyst_press() {
        return syst_press;
    }

    public void setSyst_press(double syst_press) {
        this.syst_press = syst_press;
    }

    public void setTerm(String term) {
        this.term = term;
    }
    public String getTerm(){
        return term;
    }

}
