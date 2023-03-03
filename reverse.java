import java.util.*;
public class rsunsingrec{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Each_word(s));
    }
    public static String Each_word(String s)
    {
        if(s.isEmpty())
        {
            return s;
        }
        
        int index = s.indexOf(" ");
        if(index==-1)
        {
            return sr(s)+" ";
            
        }
        String word = s.substring(0,index);
        String ls=s.substring(index+1);
        return sr(word)+" "+Each_word(ls);
    }
    public static String sr(String word)
    {
        if(word.isEmpty())
        {
            return word;
        }
        return sr(word.substring(1))+word.charAt(0);
    }
        
    }
