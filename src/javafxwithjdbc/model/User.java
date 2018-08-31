package javafxwithjdbc.model;


public class User {
    
    private int id;
    private String name;
    private String age;
    private String year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

  

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
      @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", age=" + age + ", year=" + year + '}';
    }
}
