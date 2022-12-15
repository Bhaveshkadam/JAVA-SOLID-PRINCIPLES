public class Main {
    public static void main(String[] args) {
        CompanyManagement companyManagement = new CompanyManagement();
        Employee nikeeta = new HR(1,"Nikeeta","Delhi",true);
        companyManagement.CallUpon(nikeeta);

        Employee bhavesh = new Backend(1,"Bhavesh", "Pune", true);
        companyManagement.CallUpon(bhavesh);

        Employee ashish = new Frontend(1, "Ashish", "Raipur", true);
        companyManagement.CallUpon(ashish);

    }
}