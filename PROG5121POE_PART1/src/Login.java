
public class Login {
    String  UserName;
    String Password;
    
    String  LoginUserName;
    String LoginPassword;
    Boolean LoginStatus;
    
    //constructor
    public Login(String username ,String password )
    {
    UserName = username;
    Password = password;
    
    }
    
    //username
    Boolean checkUserName()
    {
     if(UserName.contains("_") && UserName.length()<=5)
     {
        return true;
     }
     else
     {
        return false;
      }
     
    }
    
    //password
    Boolean checkPasswordComplexity()
    {
    final int NUM_UPPER_LETTERS=1;
        final int NUM_SPECIAL_CHA=1;
        final int NUM_DIGITS=1;
        //String Password = input.nextLine();
        int digitsAvailable=0;
        int upperCaseAvailable=0;
        int specialCharacterAvailable =0;
        
        for(int counter=0;counter<Password.length();counter++ )
        {
            System.out.println();
           char characterAtIndex=Password.charAt(counter);
           
           if (Character.isUpperCase(characterAtIndex) )
           {
              upperCaseAvailable++;
           }
            else if(Character.isDigit(characterAtIndex))
            {
               digitsAvailable++;
            }
           else if(!Character.isLetterOrDigit(characterAtIndex))
            {            
               specialCharacterAvailable++;
            }
            
        }
          
        
        if( upperCaseAvailable>= NUM_UPPER_LETTERS &&digitsAvailable>=NUM_DIGITS&&specialCharacterAvailable>=NUM_SPECIAL_CHA&& Password.length()<=8)
           {
            return true;
           }
        else 
        {
             if(upperCaseAvailable<NUM_UPPER_LETTERS)
             {
             System.out.println("NO capital letter");
             }
             if(digitsAvailable<NUM_DIGITS)
             {
             System.out.println("NO number");
             }
             if(specialCharacterAvailable<NUM_SPECIAL_CHA)
             {
             System.out.println("NO special character");
             }
             if(Password.length()>8)
             {
             System.out.println("TOO LONG");
             }
             return false;
        }
        
      
                 
    }
    
     String registerUser(){
    
      //username 
      Boolean isUserNameCorrect =checkUserName();
      if(isUserNameCorrect == true)
      {
        System.out.println("Username successfully captured");
                            
              Boolean isPasswordCorrect = checkPasswordComplexity();
              if( isPasswordCorrect== true)
              {

               System.out.println("password successfully captured");
               return "user has been registered successfully";
              }
              else
              {
                  
                  return "password is not correctly formatted,"
                       + "please ensure that the password contains at least 8 characters,"
                       + "a capital letter,a number and a special character";
              }
       
       }
        else
      {
      return "Username is not correctly formatted please ensure that your Username "
              + "contains an underscore and is no more than 5 characters in legnth.";
         // System.out.println();
        }
    }
     
    Boolean loginUser()
            
    {
      if(LoginUserName.equals(UserName)&& LoginPassword.equals(Password))
      {
      LoginStatus = true;
      return true;   
     // System.out.println("Welcome"+ FirstName+" "+LastName+"it is great to see you again.");
      
      }
      else
      {
         //System.out.println("username or password incorrect please try again");
           LoginStatus = false;
           return false;
      }
    
    }
    
    String returnLoginStatus()
            
    {
       if( LoginStatus == true)
       {
          return "login successful";
       }
       else
       {
          return " login error";  
       }
    }
          
}
