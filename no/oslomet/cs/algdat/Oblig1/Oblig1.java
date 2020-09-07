package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if(a.length == 0) {
            throw new NoSuchElementException();
        } else {
            if(a.length == 1) {
                return a[0];
            }
            int begin = 0;
            int end = a.length-1;
            for(int i = begin; i < end; i++) {
                if(a[i] > a[i+1]) {
                    int value = a[i];
                    a[i] = a[i + 1];
                    a[i+1] = value;
                }
            }
        }
        return a[a.length-1];
    }

    //Når blir det flest ombyttinger?
    // - Når arrayet er sortert i omvendt rekkefølge er det flest ombyttinger.

    //Når blir det færrest?
    // - Det færrest når arrayet er sortert.

    //Hvor mange blir det i gjennomsnitt?

    public static int ombyttinger(int[] a) {
        int begin = 0;
        int end = a.length-1;
        int antallOmbyttinger = 0;
        for(int i = begin; i < end; i++) {
            if(a[i] > a[i+1]) {
                int value = a[i];
                a[i] = a[i + 1];
                a[i+1] = value;
                antallOmbyttinger++;
            }
        }
        return antallOmbyttinger;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        int antall = 1;

        //check if array length is 0
        if(a.length == 0) {
            return 0;
        }
        //check if array length is equal to 1
        if(a.length == 1) {
            return 1;
        }

        if(a.length > 1) {
            //check if array is sorted
            if(!isSorted(a)) {
                throw new IllegalStateException("Usortert tabbel!");
            } else {
                for (int i = 1; i < a .length; i++)
                {
                    int j = 0;
                    for (j = 0; j < i; j++)
                        if (a[i] == a[j]) {
                            break;
                        }
                    if (i == j) {
                        antall++;
                    }

                }
                return antall;
            }
        }

        return antall;
    }

    public static boolean isSorted(int[] a) {
        for(int i = 0; i < a.length -1 ; i++) {
            if(a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        int antall = 1;

        //check if array length is 0
        if(a.length == 0) {
            return 0;
        }
        //check if array length is equal to 1
        if(a.length == 1) {
            return 1;
        }

        for (int i = 1; i < a .length; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (a[i] == a[j]) {
                    break;
                }
            if (i == j) {
                antall++;
            }

        }
        return antall;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

    }



    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
