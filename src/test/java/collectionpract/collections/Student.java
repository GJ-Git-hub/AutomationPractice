package collectionpract.collections;

public class Student implements Comparable<Student>{

    public String name;

    Student(String name)
    {
        this.name=name;
    }

    public int compareTo(Student person)
    {
        return name.compareTo(person.name);
    }

}
