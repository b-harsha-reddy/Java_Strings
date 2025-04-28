public class MatchingString{
    public static void main(String[] args){

        String person_1 = "Harsha";
        String person_2 = "haarsha";
        
        if((person_1 == null || person_2 == null) || (person_1.isEmpty() || person_2.isEmpty())){

            System.out.println("Comparision cannot be done due to null or empty values");        
        }
        else if (person_1.equalsIgnoreCase(person_2)) {
            System.out.println("Matching");

        }
        else {
            System.out.println("Not Matching");
        }

    



    }
}