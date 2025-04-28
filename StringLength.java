/*

This Program can be used to find the length of the string
*/
public class StringLength{

    public static void main(String[] args){

        String firstName = "HARSHA";

        if(firstName == null){
            System.out.println("String is null");
        }
        else if(firstName.isEmpty()){
            System.out.println("String is Empty");
        }
        else {
            System.out.println("Length of String: "+ firstName.length());
        }

    }

}