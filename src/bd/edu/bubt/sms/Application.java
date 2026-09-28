package bd.edu.bubt.sms;

import java.util.Scanner;
import bd.edu.aiub.sms.Grading_system_Aiub;

public class Application {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student mark:");
        int StudentMark= input.nextInt();
        Grading_system_bubt grading= new Grading_system_bubt();
        String grade = grading.BubtMarking(StudentMark);
        System.out.println("Student grade in BUBT: "+ grade);
        Grading_system_Aiub grading2= new Grading_system_Aiub();
        String newgrade= grading2.AiubMarking(StudentMark);
        System.out.println("Student grade in AIUB: "+newgrade);

    }
}
