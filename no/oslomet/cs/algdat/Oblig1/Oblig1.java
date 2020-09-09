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
        int antall = 0;
            if(!isSorted(a)) {
                throw new IllegalStateException("Usortert tabbel!");
            } else {
                antall = getAntall(a, antall);
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
        int antall = 0;

        antall = getAntall(a, antall);
        return antall;
    }

    private static int getAntall(int[] a, int antall) {
        for (int i = a.length-1; i  >=0; i--) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    antall++;
                }
                if(a[i] == a[j]) {
                    break;
                }
            }
        }
        return antall;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        if(a.length == 0) {
            return;
        }
        partition(a, 0, a.length-1);

    }

    static void partition(int[]a, int begin, int end) {
        int i = begin; int j = end;

        while( i < j) {
            while (a[j] % 2 == 0 && j > 0) {
                j--;
            }
            while (a[i] % 2 != 0 && i < end) {
                i++;
            }
            if((i == end && j== end) || (i==0 && j== 0)) {
                sort(a, 0, a.length);
                break;
            }
            int temp = a[i];
            if(i < j) {
                a[i] = a[j];
                a[j] = temp;
            } else {
                a[i] = a[end];
                a[end] = temp;
                sort(a, 0, i);
                sort(a, i, end+1);
            }

        }
    }

    static void sort(int[] a, int begin, int end) {
        for(int i = begin; i < end; i++) {
            for(int j = i; j < end; j++ ) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if(a.length == 0) {
            return;
        }
        int left = a.length-1;
        char last = a[left];

        for(int i = left-1; i >= 0; i--) {
            char temp = a[i];
            a[i+1] = temp;
            if(i != 0) {
                a[i] = a[i-1];
            }
        }
        a[0] = last;
    }

    /*///// Oppgave 6 //////////////////////////////////////
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
    }*/

}  // Oblig1
