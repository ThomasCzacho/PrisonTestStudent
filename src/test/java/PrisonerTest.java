
public class PrisonerTest {
    public static void main(String[] args){

        Cell cellA1 = new Cell("A1",true);
        Prisoner p01 = new Prisoner("Bubba",2.08,4, cellA1);

//        Cell c01 = new Cell("Cell01",true);

//        p01.display();

        p01.display();


       p01.openDoor();
        p01.openDoor();
        p01.openDoor();



    }
}