class grade{
    private int grade;

    public void setGrade(int grade){
        if(grade > 0 && grade <=100)
            this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }


}

public class studentgrade {
    public static void main(String[] args) {
        grade Grade = new grade();
        Grade.setGrade(70);
        System.out.println(Grade.getGrade());
    }



}
