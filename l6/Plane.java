public class Plane{
    private int dal_polit;
    private int mistkist;
    private int vantash;

    public Plane(int mistkist, int vantash, int dal_polit) {
        this.dal_polit = dal_polit;
        this.mistkist = mistkist;
        this.vantash = vantash;
    }

    public int getDal_polit() {
        return dal_polit;
    }

    public int getMistkist() {
        return mistkist;
    }

    public int getVantash() {
        return vantash;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "flight_range=" + dal_polit +
                '}';
    }
}