public class Magpie4
{
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /*
  * Main Method used in MagpieRunner4.java
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.length() == 0)
  {
   response = "Say something, please.";
  }

  else if (findKeyword(statement, "no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (findKeyword(statement, " whats your name") >= 0
             || findKeyword(statement, "what's your name") >= 0
          || findKeyword(statement, "what is your name") >= 0)
  {
    response = "My name is Javax!";
  }
  else if (findKeyword(statement, "mother") >= 0
    || findKeyword(statement, "father") >= 0
    || findKeyword(statement, "sister") >= 0
    || findKeyword(statement, "mom") >= 0
    || findKeyword(statement, "dad") >= 0
    || findKeyword(statement, "brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (findKeyword(statement, "I want to", 0) >= 0)
  {
   response = transformIWantToStatement(statement);
  }
  else if (findKeyword(statement, "I want", 0) >= 0)
  {
    response = transformIWantStatement(statement);
  }
  else if (findKeyword(statement, "i", 0) >= 0 && findKeyword(statement, "you", 0) >= 0)
  {
      response = transformMeYouStatement(statement);
  }
  else if (findKeyword(statement, "hello", 0) >= 0
             || findKeyword(statement, "hey", 0) >= 0
             || findKeyword(statement, "hi", 0) >= 0)
  {
    response = "Hello! How are you today?";
  }
  else if(findKeyword(statement, "how are you", 0) >= 0)
  {
    response = "I'm good, thank you.";
  }
  else if(findKeyword(statement, "I like your", 0) >= 0)
  {
    response = transformILikeYourStatement(statement);
  }

  else
  {
   int psn = findKeyword(statement, "you", 0);

   if (psn >= 0
     && findKeyword(statement, "me", psn) >= 0)
   {
    response = transformYouMeStatement(statement);
   }
   else
   {
    response = getRandomResponse();
   }
  }
  return response;
 }
 
 /*
  * I want to...
  * Method
  */
 private String transformIWantToStatement(String statement)
 {
  statement = statement.trim();
  String lastChar = statement.substring(statement
    .length() - 1);
  if (lastChar.equals("."))
  {
   statement = statement.substring(0, statement
     .length() - 1);
  }
  int psn = findKeyword (statement, "I want to", 0);
  String restOfStatement = statement.substring(psn + 9).trim();
  return "Why do you want to " + restOfStatement + "?";
 }
 
 /*
  * I <something> you...
  * Method
  */
 private String transformMeYouStatement(String statement)
 {
   statement = statement.trim();
   String lastChar = statement.substring(statement.length()-1);
   if(lastChar.equals("."))
   {
     statement = statement.substring(0, statement.length()-1);
   }
   
   int psnOfI = findKeyword(statement, "i", 0);
   int psnOfYou = findKeyword(statement, "you", psnOfI + 1);
   
   String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
   return "Why do you " + restOfStatement + " me?";
 }

/*
 * You <something> me...
 * Method
 */
 private String transformYouMeStatement(String statement)
 {
  statement = statement.trim();
  String lastChar = statement.substring(statement
    .length() - 1);
  if (lastChar.equals("."))
  {
   statement = statement.substring(0, statement
     .length() - 1);
  }
  
  int psnOfYou = findKeyword (statement, "you", 0);
  int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
  
  String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
  return "What makes you think that I " + restOfStatement + " you?";
 }
 
 /* 
  * I want <something> ...
  * Method
  */
 private String transformIWantStatement(String statement)
 {
  statement = statement.trim();
  String lastChar = statement.substring(statement.length() - 1);
  if (lastChar.equals("."))
  {
   statement = statement.substring(0, statement.length() - 1);
  }
  int psn = findKeyword (statement, "I want", 0);
  String restOfStatement = statement.substring(psn + 6).trim();
  
  /* Alter this array
   * to add more food items
   */
  String[] foodArray = {"cookie", "chicken", "donut", "chocolate", "lunch", "dinner", "breakfast", "snack"};
  for (int a = 0; a < foodArray.length; a++)
  {
    if (restOfStatement.equals(foodArray[a]))
    {
      return "I'm not really in the mood for " + restOfStatement + " right now.";
    }
  }
  if (restOfStatement.equalsIgnoreCase("you"))
  {
    return "Why do you want me?";
  }
  return "Why do you want " + restOfStatement + "?";
 }
 private String transformILikeYourStatement(String statement)
 {
   statement = statement.trim();
  String lastChar = statement.substring(statement.length() - 1);
  if (lastChar.equals("."))
  {
   statement = statement.substring(0, statement.length() - 1);
  }
  int psn = findKeyword (statement, "I like your", 0);
  String restOfStatement = statement.substring(psn + 11).trim();
  
  return "Thank you! Why do you like my " + restOfStatement + "?";
 }
 
/* 
 * findKeyword
 * First Method
 */
 private int findKeyword(String statement, String goal, int startPos)
 {
  String phrase = statement.trim();
  //  The only change to incorporate the startPos is in the line below
  int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
  
  //  Refinement--make sure the goal isn't part of a word 
  while (psn >= 0) 
  {
   //  Find the string of length 1 before and after the word
   String before = " ", after = " "; 
   if (psn > 0)
   {
    before = phrase.substring (psn - 1, psn).toLowerCase();
   }
   if (psn + goal.length() < phrase.length())
   {
    after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
   }
   
   //  If before and after aren't letters, we've found the word
   if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
     && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
   {
    return psn;
   }
   
   //  The last position didn't work, so let's find the next, if there is one.
   psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
   
  }
  
  return -1;
 }
 
 /* 
  * findKeyword Search
  * Method
  */
 private int findKeyword(String statement, String goal)
 {
  return findKeyword (statement, goal, 0);
 }
 


 /* 
  * Random Response Generator
  * Method
  * 
  * Alter this method to
  * add more random responses
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 5;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
  {
    response = "Oh.";
  }

  return response;
 }

}
