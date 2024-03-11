package org.lecture;

public enum Subject {

    BS("Betriebssysteme"),
    GST("Gesellschaft und Technik"),
    FOGL("Formale Grundlagen und Datenbanken"),
    OPRO("Objektorientierte Programmierung"),
    E("Kommunikation Englisch II"),
    NWT("Grundlagen der Netzwerktechnologien"),
    SWM("Softwaremanagement I"),
    REP("Freifach: Repetitorium Objektorientierte Programmierung");

    private final String longName;

    Subject(String s) {
        this.longName = s;
    }

    public String getLongName() {
        return longName;
    }

    public static Subject convert(String s){
        return switch (s.trim()) {
            case "Betriebssysteme" -> BS;
            case "Gesellschaft und Technik" -> GST;
            case "Formale Grundlagen und Datenbanken" -> FOGL;
            case "Objektorientierte Programmierung" -> OPRO;
            case "Kommunikation Englisch II" -> E;
            case "Grundlagen der Netzwerktechnologien" -> NWT;
            case "Softwaremanagement I" -> SWM;
            case "Freifach: Repetitorium Objektorientierte Programmierung" -> REP;
            default -> null;
        };
    }
}
