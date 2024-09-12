public class RowColumnGrade {
    public static void main(String[] args) {
        int[][] arr = { {95,81}, {75,46}, {38,78}, {98,78}, {56,46}};

        System.out.println("Grades of all students :");


        int studentnum = 1;
        for(int[] each : arr )
            System.out.println("Student :" + studentnum + "Math:"+ each[0] + ",Science:" + each[1] );
            studentnum++;

        int mathsum = 0;
        int sciencesum = 0;


        for (int[] each : arr) {
            int math = each[0];
            mathsum += math;

            int science = each[1];
            sciencesum += science;
        }
            double mathavg = mathsum / (double) arr.length;
            double scienceavg = sciencesum/(double) arr.length;

            System.out.println("Average Math grade: " + mathavg);
            System.out.println("Average Science grade: " + scienceavg);
        }
}
