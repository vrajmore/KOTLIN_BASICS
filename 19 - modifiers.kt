fun main() {

}

//  modifier are used to set accessibility of class/variable/method/etc

public class A1{                    // public modifier can be accessible everywhere
    protected var name = "hello"    //  protected modifier can be accessible only in subclasses(classes which are inherited)
}

internal class B1{                  // internal modifier can be accessible with in the module/package/folder
}

private class C1{                   // private modifier can be accessible only inside the class
}
