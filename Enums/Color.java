package Data_Structures_Java.Enums;

// Since public keyword is used enum name should be same as file name
// Try changing enum name without removing public keyword then remove the public keyword

public enum Color {
    RED; // Q. What would happen if enum didn't have any value?
        // ANS. Enum can be empty just insert ; in enum body
        // Try removing RED and just keep ;
    
    // MAIN Method!!! Yes Enums can have methods including main methods
    public static void main(String[] args){
        Color c = Color.RED;
        System.out.println(Color.RED); // DID YOU KNOW : Enum Values are by default PUBLIC STATIC FINAL
        // PUBLIC -> thus values can be accessed outside of enums
        // STATIC -> values can be accessed by using enum_name.enum_value
        // FINAL -> since values are final thus cannot be changed
        System.out.println(c);
    }
}