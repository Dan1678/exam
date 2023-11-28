import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args){
        Patient pat1 = new Patient("Daphne Von Oram");
        pat1.setAge(62);
        pat1.setURL("https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");

        String pat1name = pat1.getName();
        String pat1pict = pat1.getURL();
        int pat1age = pat1.getAge();

        MRI pat1MRI = new MRI(("14/9/23"));
        pat1MRI.setURL("https://martinh.netfirms.com/BIOE60010/mri1.jpg");
        pat1MRI.setStrength(2);
        pat1.MRI = pat1MRI;

        BP pat1BP = new BP("15/9/23");
        pat1BP.setSyst_press(130);
        pat1BP.setDiast_press(70);
        pat1BP.setTerm("ST");
        pat1.setBP(pat1BP);


        System.out.println("Patient: " + pat1name);
        System.out.println("Age: " + pat1age);
        System.out.println("Picture: " + pat1pict);

        System.out.println("MRI: " + pat1.MRI.getURL());
        System.out.println("Strength: " + pat1.MRI.getStrength() + " Tesla");
        System.out.println("Date: " + pat1.MRI.getDate());


        System.out.println("Systolic BP: " + pat1.BP.getSyst_press() + " mmHG");
        System.out.println("Diastolic BP: " + pat1.BP.getDiast_press() + " mmHG");
        System.out.println("Date: " + pat1.BP.getDate());
        System.out.println("Duration: " + pat1.BP.getTerm());



        Patient pat2 = new Patient("Sebastian Compton");
        pat2.setAge(31);
        pat2.setURL("https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");

        String pat2name = pat2.getName();
        String pat2pict = pat2.getURL();
        int pat2age = pat2.getAge();

        MRI pat2MRI = new MRI(("19/1/23"));
        pat2MRI.setURL("https://martinh.netfirms.com/BIOE60010/mri2.jpg");
        pat2MRI.setStrength(4);
        pat2.MRI = pat2MRI;

        BP pat2BP = new BP("20/11/23");
        pat2BP.setSyst_press(150);
        pat2BP.setDiast_press(80);
        pat2BP.setTerm("VST");
        pat2.setBP(pat2BP);


        System.out.println("Patient: " + pat2name);
        System.out.println("Age: " + pat2age);
        System.out.println("Picture: " + pat2pict);

        System.out.println("MRI: " + pat2.MRI.getURL());
        System.out.println("Strength: " + pat2.MRI.getStrength() + " Tesla");
        System.out.println("Date: " + pat2.MRI.getDate());


        System.out.println("Systolic BP: " + pat2.BP.getSyst_press() + " mmHG");
        System.out.println("Diastolic BP: " + pat2.BP.getDiast_press() + " mmHG");
        System.out.println("Date: " + pat2.BP.getDate());
        System.out.println("Duration: " + pat2.BP.getTerm());


        JFrame frame = new JFrame("Patient Details"); //Create the JFrame and give it a title
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Quit the application when the JFrame is closed

        JPanel pane = new JPanel();

        JLabel label = new JLabel();
        URL imageURL=null;
        try {
            imageURL = new URL(pat1.getURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
        pane.add(label);
        JLabel textLabel = new JLabel("My Text");
        textLabel.setText("<html>Patient: Daphne Von Oram<br>Please find the test results in the console</html>");
        pane.add(textLabel);

        JLabel label1 = new JLabel();
        URL imageURL1=null;
        try {
            imageURL1 = new URL(pat1.MRI.getURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon1 = new ImageIcon(imageURL1);
        label1.setIcon(thisImageIcon1);
        pane.add(label1);
        JLabel textLabel1 = new JLabel("My Text");
        textLabel1.setText("<html>Patient: Daphne Von Oram<br>MRI</html>");
        pane.add(textLabel1);







        JLabel label2 = new JLabel();
        URL imageURL2=null;
        try {
            imageURL2 = new URL(pat2.getURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon2 = new ImageIcon(imageURL2);
        label2.setIcon(thisImageIcon2);
        pane.add(label2);
        JLabel textLabel2 = new JLabel("My Text");
        textLabel2.setText("<html>Patient: Sebastian Compton<br></html>");
        pane.add(textLabel2);


        frame.setContentPane(pane);


        frame.setVisible(true);





    }

    }



