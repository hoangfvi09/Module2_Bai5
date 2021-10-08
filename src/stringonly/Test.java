package stringonly;

public class Test {
    private String name;
    private String classes;

    public Test() {
        this.name = "John";
        this.classes = "C08";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
