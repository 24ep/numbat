import java.util.Objects;

public class setdata {
    private String Tname;
    private String TTell;
    private String TFristname;
    public String getTname() {
        return Tname;
    }
//--------------------------------------------------
    public void setTname(String tname) {

        Tname = tname.substring(0,1).toUpperCase()
                +tname.substring(1).toLowerCase();

        if (Objects.equals(Tname, "Username")) {
            Tname = "Guest";}
    }
//--------------------------------------------------

    public String getTFristname() {
        return TFristname;
    }

    public void setTFristname(String TFristname) {
        int i = TFristname.indexOf(" ");
        String Pnamesub = TFristname.substring(0, i + 2);
        this.TFristname = Pnamesub + ".";

    }
    //--------------------------------------------

    public String getTTell() {
        return TTell;
    }
//---------------------------------
    public void setTTell(String TTell) {

        if (TTell.length() == 10) {
          this.TTell = TTell.substring(0, 1) + " " + TTell.substring(1, 3) + " " + TTell.substring(3, 6) + " " + TTell.substring(6, 9) + " " + TTell.substring(9, 10);
        } else if (TTell.length() == 12) {
            this.TTell = TTell.substring(0, 1) + " " + TTell.substring(1, 3) + " " + TTell.substring(3, 6) + " " + TTell.substring(6, 9) + " " + TTell.substring(9, 10) + " " + TTell.substring(10, 12);

        }
        else{this.TTell=TTell;}

    }
}
