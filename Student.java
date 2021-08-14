import java.util.Scanner;

public class Student {
    String name ;
    String rollNumber ;
    int[] marks ;

    public void AcceptValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        name = scanner.next();
        System.out.print("Enter Roll Number : ");
        rollNumber = scanner.next();
        System.out.print("Enter the Total Subject : ");
        int subject = scanner.nextInt();
        marks = new int[subject];
        for(int i=0 ; i<subject ; i++){
            System.out.print("Subject "+(i+1)+" Marks : ");
            marks[i] = scanner.nextInt();
        }
    }
    public int totalMark(){
        int sum = 0;
        for(int i=0 ; i<marks.length ; i++){
            sum = sum + marks[i];
        }
        return sum;
    }
    public double Average(){
        int avg;
        avg = totalMark()/marks.length;
        return avg;
    }
    public void Display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println(" Obtain Marks "+totalMark());
        System.out.println("Avrage : "+Average());
    }
}