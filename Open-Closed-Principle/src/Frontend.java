public class Frontend extends Employee{
    public Frontend(int id, String name, String location, boolean working) {
        super(id, name, location, working);
    }

    private void createWebDesign() {
        System.out.println("Create Designs base on project");
    }

    private void apiIntegration() {
        System.out.println("Integrate APIs ");
    }
    @Override
    public void performDuties() {
        createWebDesign();
        apiIntegration();
    }

}
