package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

  public static Set<String> createHashSet() {
    Set<String> nuevoHashSet = new HashSet<>();
    //Copio y pego los elementos a añadir en el set directamente del readme.md.
    //Reemplazo los "* " por una cadena vacía y separo cada elemento en un array de Strings con .split()
    String elementsEjercicio = "* ELEMENT KPRBC\n" +
            "* ELEMENT YPBTM\n" +
            "* ELEMENT AADXU\n" +
            "* ELEMENT RXCGJ\n" +
            "* ELEMENT WYMVD\n" +
            "* ELEMENT WFGEJ\n" +
            "* ELEMENT TYGBS\n" +
            "* ELEMENT MAPTK\n" +
            "* ELEMENT GJXVE\n" +
            "* ELEMENT BAFGL";
    String[] arrayElements = elementsEjercicio.replace("* ", "").split("\n");
    //Recorro los elementos del array y los voy añadiendo al set creado.
    for (String str: arrayElements){
      addElementToSet(nuevoHashSet, str);
    }

    return nuevoHashSet;
  }

  public static Set<String> createTreeSet() {
    Set<String> nuevoTreehSet = new TreeSet<>();
    //Copio y pego los elementos a añadir en el set directamente del readme.md.
    //Reemplazo los "* " por una cadena vacía y separo cada elemento en un array de Strings con .split()
    String elementsEjercicio = "* ELEMENT KPRBC\n" +
            "* ELEMENT YPBTM\n" +
            "* ELEMENT AADXU\n" +
            "* ELEMENT RXCGJ\n" +
            "* ELEMENT WYMVD\n" +
            "* ELEMENT WFGEJ\n" +
            "* ELEMENT TYGBS\n" +
            "* ELEMENT MAPTK\n" +
            "* ELEMENT GJXVE\n" +
            "* ELEMENT BAFGL";
    String[] arrayElements = elementsEjercicio.replace("* ", "").split("\n");
    //Recorro los elementos del array y los voy añadiendo al set creado.
    for (String str: arrayElements){
      addElementToSet(nuevoTreehSet, str);
    }

    return nuevoTreehSet;
  }

  private static void printSet(Set<String> customSet) {
    for (String str : customSet) {
      System.out.println(str);
    }
  }


  public static boolean addElementToSet(Set<String> set, String elementToAdd) {
    return set.add(elementToAdd);
  }

  public static void main(String[] args) {
    Set<String> setHash = createHashSet();
    Set<String> setTree = createTreeSet();

    addElementToSet(setHash, "ELEMENT AAA");
    addElementToSet(setTree, "ELEMENT AAA");

    printSet(setHash);
    printSet(setTree);
  }

}
