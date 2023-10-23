import java.util.*;

public class Demerging implements Comparator<Employee>{
    private final List<Employee> NU;
    private final List<Employee> NAM;
    private List<Employee> TONG;

    public Demerging() {
    NU = new ArrayList<>();
    NAM = new ArrayList<>();
    TONG = new ArrayList<>();
    }

    public void add(Employee e) {
        TONG.add(e);
    }


    public void sortByDateOfBirth(List<Employee> list) {
        int noSwap = 0;
        while(noSwap <list.size() - 1) {
            noSwap = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                Employee o1 = list.get(i);
                Employee o2 = list.get(i + 1);
                if (compare(o1, o2) > 0) {
                    Employee temp = list.get(i);
                    list.set(i, o2);
                    list.set(i + 1, temp);
                } else noSwap++;
            }
        }

    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getYear() > o2.getYear()) return 1;
        else if (o1.getYear() < o2.getYear()) return -1;
        else {
            if (o1.getMonth() > o2.getMonth()) return 1;
            else if (o1.getMonth() < o2.getMonth()) return -1;
            else {
                return Integer.compare(o1.getDay(), o2.getDay());
            }
        }
    }

    public void sortByGender() {
        for (Employee e : TONG) {
            if (e.getGender().equals("nu")) NU.add(e);
            else if (e.getGender().equals("nam")) NAM.add(e);
        }
        TONG.clear();
        TONG.addAll(NU);
        TONG.addAll(NAM);
    }

    public void printList() {
        for (Employee e : TONG) {
            System.out.println(e.getName());
        }
    }

    public int[] sort(int[] arr) {
        int noSwap = 0;
        while(noSwap < arr.length - 1) {
            noSwap = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                } else noSwap++;
            }
        }
        return arr;
    }

    public void sortByGenderAndBirth() {
        for (Employee e : TONG) {
            if (e.getGender().equals("nu")) NU.add(e);
            else if (e.getGender().equals("nam")) NAM.add(e);
        }
        sortByDateOfBirth(NU);
        sortByDateOfBirth(NAM);

        TONG.clear();
        TONG.addAll(NU);
        TONG.addAll(NAM);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("A", "nu", 1, 1, 2020);
        Employee e2 = new Employee("B", "nam", 2, 1, 1999);
        Employee e3 = new Employee("C","nu", 5, 12, 2003);
        Employee e4 = new Employee("D","nu", 10, 12, 1998);
        Employee e5 = new Employee("E","nam", 5, 3, 1999);

        Demerging list = new Demerging();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

//
//        list.sortByGender();
//        list.printList();

        list.sortByDateOfBirth(list.TONG);
        list.printList();

        System.out.println(Arrays.toString(list.sort(new int[]{1, 8, 100, -1, 3, 10, 9, 12, 54, 65, 0, 15, 3, 2, 1, 10, 8,2, 10})));

        list.sortByGenderAndBirth();
        list.printList();

    }
}
