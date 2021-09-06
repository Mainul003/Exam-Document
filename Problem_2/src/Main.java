import java.util.*;


public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(t >0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            t--;
        }
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s2.getCgpa()>s1.getCgpa()){
                    return 1;
                }else if(s2.getCgpa()<s1.getCgpa()){
                    return -1;
                }
                return s1.getFname().compareTo(s2.getFname());
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}