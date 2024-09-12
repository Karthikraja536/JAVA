public class EventNameList {
    public static void main(String[] args) {

        String[] attendees = {"karthik", "deepak", "akash", "yash", "junade"};

        String longest = attendees[0];
        for(String each: attendees)
            if(each.length() > longest.length())
                longest = each;

        String shortest = attendees[0];
        for(String each: attendees)
            if(each.length() < shortest.length())
                shortest = each;

        System.out.print("Names in Reverse Order:");
        for( int i = attendees.length -1;i >= 0; i--)
            System.out.print(attendees[i] + " ");

        System.out.println();
        System.out.println("Longest Name:" + longest);
        System.out.println("Shortest Name:" + shortest);


    }
}
