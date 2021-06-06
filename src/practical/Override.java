package practical;

class ParentClass {
    public void getvalue(){
        System.out.println("parent");
    }
}


class BaseClass extends ParentClass{
    @Override
    public void getvalue(){
        System.out.println("base");
    }
    public static void main(String[] args) {
        ParentClass a= new ParentClass();
        a.getvalue();
        ParentClass b = new BaseClass();
        b.getvalue();
    }
}
