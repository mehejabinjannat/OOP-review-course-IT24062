# 🎵 Music Shop OOP Project (Java)

This is an Object-Oriented Programming (OOP) project in Java that demonstrates the use of:

- Abstract classes
- Interfaces
- Inheritance
- Method overriding
- Polymorphism
- `instanceof` type checking

---

## 📌 Project Overview

The system models a **Music Shop** with different types of instruments such as:

- Guitar
- Piano

Each instrument can:
- Play music
- Be tuned
- Be maintained (cleaned and inspected)

---

## 🧠 OOP Concepts Used

### 1. Abstract Class
- `Instrument` is an abstract class
- It defines common properties and behaviors for all instruments

### 2. Interfaces
- `Tunable` → instruments that can be tuned
- `Maintainable` → instruments that can be cleaned and inspected

### 3. Inheritance
- `StringedInstrument` extends `Instrument`
- `Guitar` and `Piano` extend base classes

### 4. Polymorphism
- Instruments are stored in an `Instrument[]` array
- Methods like `play()` behave differently for each object

---

## 💻 Full Source Code

```java
abstract class Instrument {
    private String name;
    protected int year;
    
    public Instrument(String name, int year) {
        this.name = name;
        this.year = year;
    }
    
    public abstract String play();
    
    public String getInstrumentDetails() {
        return "Instrument: " + name + ", Year: " + year;
    }
    
    public String getName() {
        return name;
    }
}

interface Tunable {
    String tune();
    String adjustPitch(boolean up);
}

interface Maintainable {
    String clean();
    String inspect();
}

class StringedInstrument extends Instrument {
    private int numberOfStrings;
    
    public StringedInstrument(String name, int year, int numberOfStrings) {
        super(name, year);
        this.numberOfStrings = numberOfStrings;
    }
    
    @Override
    public String play() {
        return "Playing the stringed instrument";
    }
    
    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails() + ", Strings: " + numberOfStrings;
    }
    
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}

class Guitar extends StringedInstrument implements Tunable, Maintainable {
    private String guitarType;
    
    public Guitar(String name, int year, int numberOfStrings, String guitarType) {
        super(name, year, numberOfStrings);
        this.guitarType = guitarType;
    }
    
    @Override
    public String play() {
        return "Playing the " + guitarType + " guitar with " + getNumberOfStrings() + " strings";
    }
    
    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails() + ", Type: " + guitarType;
    }
    
    @Override
    public String tune() {
        return "Tuning the " + guitarType + " guitar";
    }
    
    @Override
    public String adjustPitch(boolean up) {
        return up ? "Increasing pitch of the guitar" : "Decreasing pitch of the guitar";
    }
    
    @Override
    public String clean() {
        return "Cleaning the " + guitarType + " guitar";
    }
    
    @Override
    public String inspect() {
        return "Inspecting the " + guitarType + " guitar from " + year;
    }
}

class Piano extends Instrument implements Tunable, Maintainable {
    private boolean isGrand;
    
    public Piano(String name, int year, boolean isGrand) {
        super(name, year);
        this.isGrand = isGrand;
    }
    
    @Override
    public String play() {
        return "Playing the " + (isGrand ? "grand" : "upright") + " piano";
    }
    
    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails() + ", Type: " + (isGrand ? "Grand" : "Upright");
    }
    
    @Override
    public String tune() {
        return "Tuning the piano";
    }
    
    @Override
    public String adjustPitch(boolean up) {
        return up ? "Increasing pitch of the piano" : "Decreasing pitch of the piano";
    }
    
    @Override
    public String clean() {
        return "Cleaning the piano keys and interior";
    }
    
    @Override
    public String inspect() {
        return "Inspecting the " + (isGrand ? "grand" : "upright") + " piano from " + year;
    }
}

public class MusicShop {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar("Fender Stratocaster", 2020, 6, "electric");
        instruments[1] = new Piano("Steinway", 2015, true);
        instruments[2] = new Guitar("Martin", 2018, 12, "acoustic");
        
        System.out.println("===== PLAYING INSTRUMENTS =====");
        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());
            System.out.println(instrument.getInstrumentDetails());
        }
        
        System.out.println("\n===== MAINTAINING INSTRUMENTS =====");
        for (Instrument instrument : instruments) {
            System.out.println("Working with: " + instrument.getName());
            
            if (instrument instanceof Tunable) {
                Tunable tunableInstrument = (Tunable) instrument;
                System.out.println(tunableInstrument.tune());
                System.out.println(tunableInstrument.adjustPitch(true));
            }
            
            if (instrument instanceof Maintainable) {
                Maintainable maintainableInstrument = (Maintainable) instrument;
                System.out.println(maintainableInstrument.clean());
                System.out.println(maintainableInstrument.inspect());
            }
            
            System.out.println("-----");
        }
    }
}
```
## Output of the Code 
~~~
===== PLAYING INSTRUMENTS =====
Playing the electric guitar with 6 strings
Instrument: Fender Stratocaster, Year: 2020, Strings: 6, Type: electric
Playing the grand piano
Instrument: Steinway, Year: 2015, Type: Grand
Playing the acoustic guitar with 12 strings
Instrument: Martin, Year: 2018, Strings: 12, Type: acoustic

===== MAINTAINING INSTRUMENTS =====
Working with: Fender Stratocaster
Tuning the electric guitar
Increasing pitch of the guitar
Cleaning the electric guitar
Inspecting the electric guitar from 2020
-----
Working with: Steinway
Tuning the piano
Increasing pitch of the piano
Cleaning the piano keys and interior
Inspecting the grand piano from 2015
-----
Working with: Martin
Tuning the acoustic guitar
Increasing pitch of the guitar
Cleaning the acoustic guitar
Inspecting the acoustic guitar from 2018
-----
~~~
