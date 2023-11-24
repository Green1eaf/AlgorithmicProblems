package leetcode;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
    }

    public static boolean checkRecord(String s) {
        var split = s.toCharArray();
        int a = 0;
        int l = 0;
        for (char ch : split) {
            if (ch == 'A') a++;
            if (ch == 'L') l++;
            else l = 0;
            if (a > 1 || l == 3) return false;
        }
        return true;
    }
}
