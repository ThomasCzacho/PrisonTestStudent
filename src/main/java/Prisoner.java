
public class Prisoner {

    public String n;
    public double h;
    public int s;

    public Prisoner(String n, double h, int s){
        this.n=n;
        this.h=h;
        this.s=s;
    }

    public void display() {
        System.out.println(n);
        System.out.println(h);
        System.out.println(s);
    }
}