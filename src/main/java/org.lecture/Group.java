package org.lecture;

public enum Group {
    ALL("BSWE-2B"),
    SMALL("BSWE-2B2");

    Group(String s) {
    }

    public Group getGroup(String s){
        switch (s){
            case "BSWE-2B" : return Group.ALL;
            case "BSWE-2B2": return Group.SMALL;
            default: return null;
        }
    }

    public static Group convert(String s){
        switch (s.trim()){
            case "BSWE-2B", "BSWE-2-FFROPRO" -> {
                return ALL;
            }
            case "BSWE-2B2" -> {
                return SMALL;
            }
            default -> {
                return null;
            }
        }
    }
}
