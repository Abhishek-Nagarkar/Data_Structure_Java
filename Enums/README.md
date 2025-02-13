# ***ENUMS IN JAVA***
- Enums are `named constants` in java
- Since they are constants, by naming convention they should be `capital`
- Enums implicitly inherit from *`java.lang.Enum`* class thus ***`Enum Cannot Inherit nor can be Inherited by other Classes`***
- Can be used to represent set of fixed values like Color (RGB), Modes (On|Off), etc.
- Enums like any other class can have 
    1. Instance variable
    2. Methods (including main method)
    3. Constructors
    4. Can implement interfaces
- Have a look at simple [tutorial file](Color.java)
- Enum values are by default `PUBLIC STATIC FINAL`
- Looping through enum is DAMN EASY, just look at [Weekend file](Weekend.java)
- .name() method gives enum value name
- .ordinal() method gives enum value index
- Did you know that learning Constructor, Instance Initializer Block and Static Initializer Block was so easy, if not follow [Menu file](Menu.java) and [MenuItem file](MenuItem.java)