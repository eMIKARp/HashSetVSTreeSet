
package hashsetvstreeset;

import java.util.*;
import java.io.*;

class Element
{
    public Element(int wartosc)
    {
        this.wartosc = wartosc;
    }
    
    @Override
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this.wartosc == ((Element)obj).wartosc)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 14 * hash + this.wartosc;
        return hash;
    }

    int wartosc;
    
}

public class Main 
{
    public static void main(String[] args) 
    {
        long mili = 0;
        long totalMili = 0;
        
        Set<String> set = new HashSet<String>(512);
        set = new TreeSet<String>();
        try
        {
        Scanner reader = new Scanner(new BufferedReader(new FileReader("informatyka.txt")));
            while (reader.hasNext())
            {
            mili = System.currentTimeMillis();
            set.add(reader.next());
            totalMili += (System.currentTimeMillis() - mili);
            }
        reader.close(); 
        }
        catch (Exception ex)
        {
           ex.printStackTrace(); 
        }
        
        Iterator<String> iter = set.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
        
        System.out.println("Czas wykonania: " + totalMili);
        System.out.println("Wielkość zbioru: " + set.size());
    }
}
