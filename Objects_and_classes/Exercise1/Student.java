public class Student {
    private String firstName;
    private String middleName;
    private String lastName;


    public void setNames(String firstName,String middleName , String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    public String getFullName(){
        String capital = middleName.substring(0,1);
        return this.firstName + " " + capital + "." + " " + this.lastName;
    }

}
