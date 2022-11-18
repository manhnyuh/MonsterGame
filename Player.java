public class Player {

    private int php = 100;
    private int pmp = 100;
    private int patk = (int)(Math.random()*(15-10+1)+10);

    public int getPhp() {
        return php;
    }

    public void setPhp(int php) {
        this.php = php;
    }

    public int getPmp() {
        return pmp;
    }

    public void setPmp(int pmp) {
        this.pmp = pmp;
    }

    public int getPatk() {
        return patk;
    }

    public void setPatk(int patk) {
        this.patk = patk;
    }
}
