import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> cisStudents = new ArrayList<>();
        String[] names = {"Abigail","Zeta","Zeta","Andy","Cyrus","Sam","Adam","Theo","Jay","Amby"};
        int[] years = {3,7,8,9,10,2,1,4,5,6};
        char[] houses = {'B','Y','R','G','P','R','G','P','B','Y'};
        for (int i = 0; i < names.length; i++){
            Student temp = new Student(names[i],years[i],houses[i]);
            cisStudents.add(i,temp);
        }
        System.out.println("Finished initialisation! ");
        bubbleSortNames(cisStudents);
        System.out.println("Finished sorting!");
        print(cisStudents);
    }
    public static void bubbleSortNames(ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i).getName().compareToIgnoreCase(list.get(j).getName())>0){
                    //if the name of i has greater value then the name of j
                    Student temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
    public static void print (ArrayList<Student> list){
        System.out.println("Starting to print!");
        for (int i = 0; i < list.size(); i++){
            System.out.println("Name " + i + ": " + list.get(i).getName());
        }
    }
}