class Constuctor {

    Constuctor(){
        this("Singly Parametrised Constructor");
        System.out.println("Default Constructor is called .");
    }
    Constuctor(String message){
        this("Doubly parametrised Costructor", 27);
        System.out.println("Message Recieved: "+message);
    }
    Constuctor(String message,int luckyNumber){
        System.out.println("Message Recieved: " + message + " Lucky Number: "+ luckyNumber);
    }
    public static void main(String[] args) {
        new Constuctor();
    }
}
