import java.util.*;

public class codsoftTask2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int totalSub=sc.nextInt();
        int marks[]=new int[totalSub];
        int totalMarks=0;
        for(int i=0;i<totalSub;i++){
            System.out.print("Enter marks for your subject : ");
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];
        }
        double avgPer=(totalMarks/(double)(totalSub*100))*100;
        String grade;
        if(avgPer>=90){
            grade="A+";
        }else if(avgPer>=80 && avgPer<90){
            grade="A";
        }else if(avgPer>=70 && avgPer<80){
            grade="B";
        }else if(avgPer>=60 && avgPer<70){
            grade="C";
        }else if(avgPer>=50 && avgPer<60){
            grade="D";
        }else if(avgPer>=40 && avgPer<50){
            grade="E";
        }else{
            grade="F";
        }

        System.out.println("Total marks : "+totalMarks);
        System.out.println("Average percentage : "+avgPer);
        System.out.println("Grade : "+grade);
        sc.close();
    }
}