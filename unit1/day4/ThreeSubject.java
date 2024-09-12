public class ThreeSubject {
        public static void main(String[] args) {

            int[][] scores = {
                    {40, 50, 60, 70},
                    {80, 80, 80, 80},
                    {20, 30, 40, 50}
            };

            for (int i = 0; i < scores.length; i++) {
                int sum = 0;
                for (int j = 0; j < scores[i].length; j++) {
                    sum += scores[i][j];
                }
                double average = sum / 4.0;
                System.out.println("Student " + (i+1) + ": " + average);
            }

            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i][j];
                }
                double average = sum / 3.0;
                System.out.println("Subject " + (j + 1) + ": " + average);
            }
        }
    }

