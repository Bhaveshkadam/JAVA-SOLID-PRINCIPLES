public class BackendDeveloper implements Developer {

    @Override
    public void develop() {
        this.writeJava();

    }
    public void writeJava() {
        System.out.println("write a java code....");
    }
}
