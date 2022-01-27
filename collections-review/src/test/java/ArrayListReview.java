import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class. NOTE: import java.util.List;
        // Define "List" interface and Add "Student" class within genetics
        // Create list of "students"
        List<Student> students = new ArrayList<>();
        // Add Elements to ArrayList by creating new object Student
        // Make sure to create constructor in Student class
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Saved"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));

        // Print list of students
        // Make sure to implement toString() method in Student class
        System.out.println("\nPrinting with System.out.println()...........");
        System.out.println(students);

        // Iteration on ArrayLists
        // 1. Create Legacy For Loop with get(index)
        System.out.println("\nPrinting with Legacy For Loop...........");
        for (int i = 0; i < students.size(); i++) System.out.println(students.get(i));

        // 2. Iterator
        System.out.println("\nPrinting with Forward Iterator...........");
        // Create iterator type
        Iterator iter = students.listIterator();
        // Create while loop
        // Note: if it hasNext(), it will continue iterating
        // Forward Iteration
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("\nPrinting with Backward Iterator...........");
        // Backwards Iteration
        // Note: we should cast hasPrevious() method to the ListIterator
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }

        // 3. For Each loop
        System.out.println("\nPrinting For Each loop...........");
        // for(specifyDataType name : whatToIterate)
        for (Student student : students) System.out.println(student);

        // 4. Lambda
        System.out.println("\nPrinting with Lambda Expression...........");
        /* addNameOfTheArrayListWhichIsStudents.forEach(
           variableNameThatBelongsToStudentsElement addLambdaExpressionSymbol->
           print(allElementsFromTheStudentsArrayList*/
        students.forEach(student -> System.out.println(student));

        // Sorting Elements in List
        System.out.println("\nPrinting with Sorted List in Ascending order by ID...........");
        Collections.sort(students,new sortByIdAscending());
        System.out.println(students);

        System.out.println("\nPrinting with Sorted List in Descending order by ID...........");
        Collections.sort(students,new sortByIdDescending());
        System.out.println(students);

        System.out.println("\nPrinting with Sorted List in Ascending order by Name...........");
        Collections.sort(students,new sortByNameAscending());
        System.out.println(students);

        System.out.println("\nPrinting with Sorted List in Descending order by Name...........");
        Collections.sort(students,new sortByNameDescending());
        System.out.println(students);
    }

    static class sortByIdAscending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            // subtract o1 from o2 to sort the list in ascending order using id
            return o1.id - o2.id;
        }
    }

    static class sortByIdDescending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            // subtract o2 from o1 to sort the list in descending order using id
            return o2.id - o1.id;
        }
    }

    static class sortByNameAscending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            // sort by name in ascending order and ignore case sensitivity
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

    static class sortByNameDescending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            // sort by name in descending order and ignore case sensitivity
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
