import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise8
{
    /*
    Write a method minLength that accepts a set of strings as a parameter and that
    returns the length of the shortest string in the list. If your method is
    passed an empty set, it should return 0.
     */

    public static void main(String[] args)
    {
        // Laver et Set Linked List
        Set<String> set = new HashSet<String>();

        //tilføjer Strings til listen

        set.add("Programmering");
        set.add("Matias");
        set.add("Korteste");
        set.add("1234");
        set.add("Hjemmelavetleverpostej");
        set.add("Real Madrid");

        System.out.println("Alle strings: ");
        System.out.println(set);

        int minimumLength = minLength(set);
        System.out.println("Minimum string længde : " + minimumLength);

    }

    private static int minLength (Set<String> set)
    {
        // Laver atributter og lister

        // laver en iterator som Strings
        Iterator<String> iterator = set.iterator();

        // Laver settet om til iteratorens næste
        String string;
        string = iterator.next();

        // laver integeres og laver min til længden af string
        int howLong, min = string.length();

        // Hvis settes størrelse er 0
        if (set.size() == 0)
        {
            // Hvis settet er 0, altså tomt (Empty)
            return 0;
        }

        // Så længe iteratorerens næste:
        while (iterator.hasNext())
        {
            string = iterator.next();
            howLong = string.length();

            // Her tjekker den
            if (howLong < min)
            {
                min = howLong;
            }
        }
        // returnerer minimum
        return min;
    }
}
