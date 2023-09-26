public class studentgrades {
   
   public static String Gradefind(int score) {
      // check score is within 0-100 or not
      if(score < 0 || score > 100)
         return "iThis is an invalid score"; // exception
      
      // switch-case
      switch(score/10) {
        // for >= 90
        case 10:
        case 9:
           return "A";
        // for >= 80 and <90
        case 8:
           return "B";
        // for >= 70 and <80
        case 7:
           return "C";
// for >= 60 and <70
        case 6:
           return "D";
        // for >= 50 and <60
        case 5:
           return "E";
        // for < 50
        default:
           return "F";
      }
   }

   public static void main(String[] args) {
    //   // Creating  Scanner class object to get input value
      // Scanner sc = new Scanner(System.in);
      
      // taking input for score
      //System.out.print("Enter score value: ");
       int score = 70;
      
      // finding the grade a
// finding the grade and displaying the result
      System.out.println("Grade = " + Gradefind(score));
      
      // closeing the Scanner 
    //   sc.close();
   }

}
