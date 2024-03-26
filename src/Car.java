public class Car{

    //Variablen außerhalb von Methoden in Klassen heißen Felder
    //Felder von Klassen sollen nicht von außerhalb einfach so
    //geändert werden können, der Zugriff sollte private sein
   private String name;
   private int seats;
   private int hp;
   private  int doors;


   //Konstruktoren können Werte annehmen, wenn ein Objekt der Klasse
    //erzeugt wird und diese verwenden/zuweisen
    //Konstruktoren sin Methoden, die bei der
    //Erzeugung des Objekts ausgeführt werden
    public Car( String name, int hp ){
        this.name = name;
        this.hp = hp;
        this.seats = 5;
        this.doors = 3;
    }



}
