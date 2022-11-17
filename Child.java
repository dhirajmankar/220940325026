 class GrandParent {
    String grandFatherName;
    String grandMotherName;

    GrandParent(String grandFatherName, String grandMotherName) {

        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;
    }
}

 class Parent extends GrandParent{

    Parent(String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);
    }

   String fatherName;
    String motherName;

    Parent(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName);
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

}
class Child extends Parent{

    Child(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName, fatherName, motherName);
    }

    public static void main(String[] dhiraj) {
        Child c = new Child("grafather", "gramother", "father", "mother");
        System.out.println(c);
    }

    // used for printing object of child
    public String toString() {
        return "Child [fatherName=" + fatherName + ", motherName=" + motherName + ", grandFatherName=" + grandFatherName  + ", grandMotherName=" + grandMotherName ;
}
}
	