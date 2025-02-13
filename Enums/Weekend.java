package Data_Structures_Java.Enums;

public enum Weekend {
    FRIDAY, // Seriously should be considered a weekend, HUHHH!
    SATURDAY,
    SUNDAY;

    public static void main(String[] args) {
        // looping through enum
        for (Weekend wk : Weekend.values()) {
            System.out.println(wk + " " + wk.name() + " " + wk.ordinal());
        }
    }
}
