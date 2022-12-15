public class Backend extends Employee{
    public Backend(int id, String name, String location, boolean working) {
        super(id, name, location, working);
    }
    private void writeAPI() {
        System.out.println("Write API");
    }

    private void createApplicationDesign() {
        System.out.println("Create Application Designs for APIs");
    }
    @Override
    public void performDuties() {
        writeAPI();
        createApplicationDesign();
    }
}
