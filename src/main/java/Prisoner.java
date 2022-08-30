
public class Prisoner {

    public String n;
    public double h;
    public int s;
    public Cell cell;

    public Prisoner(String n, double h, int s, Cell cell){
        this.n=n;
        this.h=h;
        this.s=s;
        this.cell=cell;
    }

    public void display() {
        System.out.println(n);
        System.out.println(h);
        System.out.println(s);
        System.out.println(cell.n);
    }

    public void openDoor() {


        if(!cell.d){
            cell.d=true;
            System.out.println("Door: "+cell.d);
        }else{
            cell.d=false;
            System.out.println("Door: "+cell.d);
        }
    }
}