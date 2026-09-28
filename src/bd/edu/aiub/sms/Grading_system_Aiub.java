package bd.edu.aiub.sms;

public class Grading_system_Aiub {

    public String AiubMarking(int mark) {

        if (mark >= 90) {
            return "A+";
        }
        else if (mark >= 85) {
            return "A";
        }
        else if (mark >= 80) {
            return "B+";
        }
        else if (mark >= 75) {
            return "B";
        }
        else if (mark >= 70) {
            return "C+";
        }
        else if (mark >= 65) {
            return "C";
        }
        else if (mark >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }
}