package subclasses;

public class Employe {

    private String ename;
    private String epass;
    private String equestion;
    private String eanswer;
    private int eIdCard;
    private String ePost;
    private String email;
    private int phone_no;

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public int geteIdCard() {
        return eIdCard;
    }

    public void seteIdCard(int eIdCard) {
        this.eIdCard = eIdCard;
    }

    public String getePost() {
        return ePost;
    }

    public void setePost(String ePost) {
        this.ePost = ePost;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employe() {

    }

    public Employe(String ename, String ePost, int eIdCard, int phone_no, String email) {
        this.ename = ename;
        this.ePost = ePost;
        this.eIdCard = eIdCard;
        this.phone_no = phone_no;
        this.email = email;

    }

    public Employe(String ename, String epass, String equestion, String eanswer) {
        this.ename = ename;
        this.epass = epass;
        this.equestion = equestion;
        this.eanswer = eanswer;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEpass() {
        return epass;
    }

    public void setEpass(String epass) {
        this.epass = epass;
    }

    public String getEquestion() {
        return equestion;
    }

    public void setEquestion(String equestion) {
        this.equestion = equestion;
    }

    public String getEanswer() {
        return eanswer;
    }

    public void setEanswer(String eanswer) {
        this.eanswer = eanswer;
    }

}
