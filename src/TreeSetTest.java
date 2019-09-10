import java.util.*;

public class TreeSetTest {

    public static void main(String[] args) {
        /*Set<Student> students = new TreeSet<>();
        students.add(new Student("zhangsan",32));
        students.add(new Student("lisi",22));
        students.add(new Student("wangwu",25));
        students.add(new Student("zhaoliu",33));
        for (Student student:students){
            System.out.println(student);
        }*/

        /*---------分割符---------------*/
        List<Student> students = new ArrayList<>();
        students.add(new Student("zhangsan",32));
        students.add(new Student("lisi",22));
        students.add(new Student("angwu",25));
        students.add(new Student("zhaoliu",33));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student:students){
            System.out.println(student);
        }
    }
}
