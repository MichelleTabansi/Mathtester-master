/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author zepingluo
 */
public class Questions {
    
    
    private int difficulty;
    private String stem;
    private String[] choices;
    private String correctAnswer;
    private String userAnswer;
    private int type;
    public String imageFile;
    public static final int MULTIPLECHOICE=0;
    public static final int FREERESPONSE = 1;
   //MC
    public Questions(int type, int difficulty, String stem, String[] choices, String correctAnswer,String imageFile)
    {
       this.difficulty = difficulty;
       this.stem = stem;
       this.choices = choices;
       this.correctAnswer = correctAnswer;
       this.type = type;
       userAnswer = "";
       this.imageFile=imageFile;
    }
    //FRQ
    public Questions(int type, String stem, String correctAnswer,int difficulty)
    {
        this.type =type;
        this.difficulty = difficulty;
       this.stem = stem;
        this.correctAnswer = correctAnswer;
        userAnswer = "";
        this.choices=null;
        
        
            
    }
    public String getCorrectAnswer()
    {
        return correctAnswer;
    }
    public int getDifficulty()
    {
        return difficulty;
    }
    
    public int getType()
    {
        return type;
    }
    public String getStem()
    {
        return stem;
    }
    
    public String getImageFile()
    {
        return imageFile;
    }
    public String[] getchoices()
    {
        return choices;
    }
            
    public void setUserAnswer( String Answer)
    {
        userAnswer = Answer;
    }
    
    public void setImageFile(String file)
    {
        imageFile=file;
    }
    
    public String getUserAnswer()
    {
        return userAnswer;
    }
    
}
