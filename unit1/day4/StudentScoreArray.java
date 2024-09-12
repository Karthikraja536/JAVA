public class StudentScoreArray {
    public static void main(String[] args) {

        int[] score = {68, 61, 91, 92, 49};
        System.out.print("Scores :");
        for (int each : score)
            System.out.print(each + " ");


        int sum = 0;
        for (int each : score)
            sum += each;
        double avg = sum /(double) score.length;

        int highest = score[0];
        for(int each : score )
            if(each > highest)
               highest = each;


        int lowest = score[0];
        for(int each : score )
            if(each < lowest)
                lowest = each;

        System.out.println();
        System.out.println("Average Score :" + avg);
        System.out.println("Highest Score :" + highest);
        System.out.println("Lowest Score :" + lowest);

        }

}
