import java.util.Scanner;
public class registrationAndLoginFeature {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the registration and login feature");
      
        //Registration
        
        System.out.println("\nTo create an acoount please enter the following information ");
        System.out.println("\nFirst Name :");
        String FirstName = input.nextLine();
        System.out.println("\nLast Name :");
        String LastName = input.nextLine();
        
       //username
       
       System.out.println("\nUsername :");
       String Username = input.nextLine();
      if(Username.contains("_") && Username.length()<=5)
       {
            System.out.println("Username successfully captured");
        }
        
        else{System.out.println("Username is not correctly formatted please ensure that your Usernam"                + " contains an underscore and is no more than 5 characters in legnth.");
//
        }
////
////        //password
////        
       System.out.println("\nBefore entering your password please ensure that that your"
               + " password contains a digit,special character,the legnth is  more"
               + " than 8 characters and a capital letter.");
        System.out.println("\npassword :");
//        final int NUM_UPPER_LETTERS=1;
//        final int NUM_SPECIAL_CHA=1;
//        final int NUM_DIGITS=1;
       String password = input.nextLine();
//        int digitsAvailable=0;
//        int upperCaseAvailable=0;
//        int specialCharacterAvailable =0;
//        
//        for(int i=0;i<password.length();i++ )
//        {
//            System.out.println();
//           char characterAtIndex=password.charAt(i);
//           
//           if (Character.isUpperCase(characterAtIndex) )
//           {
//           upperCaseAvailable++;
//           }
//            else if(Character.isDigit(characterAtIndex)){
//            digitsAvailable++;
//           }
//           else if(!Character.isLetterOrDigit(characterAtIndex))
//           {          
//               specialCharacterAvailable++;
//           }
//        }
//            
//        }
////          
//        
//        if( upperCaseAvailable>= NUM_UPPER_LETTERS &&digitsAvailable>=NUM_DIGITS&&specialCharacterAvailable>=NUM_SPECIAL_CHA&& password.length()<=8)
//            {
//            System.out.println("password successfully captured");
//            }
//             else {
//             System.out.println("Password is not correctlyformatted include the following:");
//             if(upperCaseAvailable<NUM_UPPER_LETTERS){
//             System.out.println("capital letter");}
//             if(digitsAvailable<NUM_DIGITS){
//             System.out.println("number");}
//             if(specialCharacterAvailable<NUM_SPECIAL_CHA){
//             System.out.println("special character");}
//             if(password.length()>8){
//             System.out.println("passwordlegnth");
//             }
////        }
////        
////             
////        //LOGIN     
////   
//
      // System.out.println("\nto login into your account please enter the following:");
    //   System.out.println("Username:");
  //    String loginUsername = input.nextLine();
    //  System.out.println("password:");
//   String loginPassword=input.nextLine();
//     if(loginUsername.equals(Username)&& loginPassword.equals(password)){
//      System.out.println("Welcome"+ FirstName+" "+LastName+"it is great to see you again.");}
//     else{System.out.println("username or password incorrect please try again");}
//      
     
          
          Login loginObject = new Login(Username,password);//creating an object loginObject
           
      //username 
      
      Boolean isUserNameCorrect = loginObject.checkUserName();
      if(isUserNameCorrect == true)
      {
        System.out.println("Username successfully captured");
       }
        else
        {
          System.out.println("Username is not correctly formatted please ensure"
                  + " that your Username contains an underscore and is no more than 5 characters in legnth.");
        }
      
      //password
      
      Boolean isPasswordCorrect = loginObject.checkPasswordComplexity();
      if( isPasswordCorrect== true)
      {
      
       System.out.println("password successfully captured");
       
      }
      else
      {
        
       System.out.println("password is not correctly formatted,"
               + "please ensure that the password contains at least 8 characters,"
               + "a capital letter,a number and a special character");
          
      }

      //registtration
      
      String registrationOutput = loginObject.registerUser();
      System.out.println(registrationOutput);
      
      //loginuser
      
      System.out.println("\nto login into your account please enter the following:");
       System.out.println("Username:");
      String loginUsername = input.nextLine();
      System.out.println("password:");
      String loginPassword=input.nextLine();
      
      loginObject.LoginUserName = loginUsername;
      loginObject.LoginPassword = loginPassword;
      loginObject.loginUser();
      
   String LoginStatus =  loginObject.returnLoginStatus();
    System.out.println( LoginStatus);
    }  
  
}
  
  
    

