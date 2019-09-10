public class DogBean {
    public String dname;
    public int dage;
    public String dcolor;
    public String dsex;

    public DogBean() {
    }

    public DogBean(String dname) {
        this.dname = dname;
    }

    public DogBean(String dname, int dage, String dcolor, String dsex) {
        this.dname = dname;
        this.dage = dage;
        this.dcolor = dcolor;
        this.dsex = dsex;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDage() {
        return dage;
    }

    public void setDage(int dage) {
        this.dage = dage;
    }

    public String getDcolor() {
        return dcolor;
    }

    public void setDcolor(String dcolor) {
        this.dcolor = dcolor;
    }

    public String getDsex() {
        return dsex;
    }

    public void setDsex(String dsex) {
        this.dsex = dsex;
    }

    public String getsomething(String str){
        return str;
    }
    private String getsome(){
        return "hhh";
    }
}
