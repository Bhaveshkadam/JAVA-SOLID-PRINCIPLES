public class FrontEndDeveloper implements Developer{
    @Override
    public void develop() {
        this.writeJavaScript();
    }
    public void writeJavaScript() {
        System.out.println("write a java script.....");
    }
}
