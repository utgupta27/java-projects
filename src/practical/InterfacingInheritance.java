package practical;

interface InnerInterfacingInheritance {
    void interfaceMethod1();
}

interface InnerInterfacingInheritance_1 {
    void interfaceMethod2();
    
}

class InterfacingInheritance implements InnerInterfacingInheritance,InnerInterfacingInheritance_1{
    public void interfaceMethod2() {
        System.out.println("Interface1");
        
    }
    public void interfaceMethod1() {
        System.out.println("Interface2");
        
    }  
    public static void main(String[] args) {
        InterfacingInheritance obj = new InterfacingInheritance();
        obj.interfaceMethod1();
        obj.interfaceMethod2();
    }
}

