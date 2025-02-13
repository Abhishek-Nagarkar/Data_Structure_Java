package Data_Structures_Java.Enums;

public enum MenuItem {
    BURGER,
    SANDWICH,
    FRIES;

    static {
        System.out.println("Static Initializer Block called");
    }
    {
        System.out.println("Instance Initializer Block (IIB) called for : " + this.toString());
    }

    MenuItem() {
        System.out.println("Ctor called for : " + this.toString());
    }

    // Try running the empty main method and check the output
    // then shift the IIB Block below the constructor and check what is first called
    public static void main(String[] args) {

    }
    // ANS. Flow of method invocation : IIB -> Constructor -> SIB
}
