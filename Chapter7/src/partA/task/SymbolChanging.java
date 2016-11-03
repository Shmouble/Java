package partA.task;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SymbolChanging {
    private StringBuffer text = new StringBuffer();

    public SymbolChanging(String text){
        this.text.append(text);
    }

    public void addToText(String text){
        this.text.append(text);
    }

    public void change(int k, String word){
        String string = this.text.toString();
        String[] words = string.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        String newWord;



       for(int i=0; i<words.length; i++){
            if(words[i].length() > k){
                newWord = words[i].substring(0, k-1) + word + words[i].substring(k);
                words[i] = newWord;
            }
       }


       System.out.println("The result");
        for(int i=0; i<words.length; i++){
            System.out.print(words[i] + " ");
        }
    }
}
