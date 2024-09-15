public class Student {
    String name;
    int year;
    char house;

    public Student(String name, int year, char house) {
        this.house = house;
        this.name = name;
        this.year = year;
    }


    public char getHouse() {
        return house;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouse(char house) {
        this.house = house;
    }
}
