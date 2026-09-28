package bd.edu.bubt.sms;

public class Grading_system_bubt {
    String BubtMarking(int mark) {
        if (mark >= 80) {
            return "A+";
        }
        else if (mark >= 75) {
            return "A";
        }
        else if (mark >= 70) {
            return "B+";
        }
        else if (mark >= 65) {
            return "B";
        }
        else if (mark >= 60) {
            return "C";
        }
        else if (mark >= 50) {
            return "D";
        }
        else {
            return "F";
        }
    }
}