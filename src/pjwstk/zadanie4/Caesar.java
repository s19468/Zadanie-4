/*
    Zadanie 4: Szyfr Cezara.
    Autor: Rafał Tęcza
    Index: s19468 
 */
package pjwstk.zadanie4;

/**
 *
 * @author s19468
 */
public class Caesar {
    
    public static String encrypt(String value) {
            String output = "";
            int length = value.length();
            
            for(int x = 0; x < length; x++){
                char c = (char)(value.charAt(x) + 2);
                
                if (c > 'z') {
                    output += (char)(value.charAt(x) - (26 - 2));
                } else {
                    output += (char)(value.charAt(x) + 2);
                }
            }
            
            return output.replace('"', ' '); //Ignorowanie spacji dla lepszego efektu wizualnego.
            //return output; Podstawowy return zwracający wyłącznie wyjściowy string.
    }
}
