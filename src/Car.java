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

    //setter-------------------------------------------------------------------
    public void setSeats( int seats ){

        if(seats > 8)
            this.seats = 8;
        else
            this.seats = seats;
    }

    public void setDoors( int doors ){
        this.doors = Math.clamp(doors, 2, 5);
    }

    //getter--------------------------------------------------------

    /**
     * Gibt die Anzahl der Türen des Fahrzeugs zurück
     * @return int - Anzahl der Türen
     */
    public int getDoors(){
        System.out.println("Wert der Türanzahl abgefragt");
        return this.doors;
    }

    public String getName(){
        return this.name;
    }

    //functions---------------------------------------------------

    /**
     * Weist das Fahren des Autos an
     */
    public void drive(){
        System.out.println("Das Auto "+name + "fährt");
    }

    /**
     * Weist das Anhalten des Autos an
     */
    public void stop(){
        System.out.println("Das Auto "+name +"hält an");
    }







}
