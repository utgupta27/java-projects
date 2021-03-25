public class Average {
    private int[] arr;
    Average(){
        this.arr = new int[]{4,6,9,8};
    }

    protected double calcAvg(){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum/arr.length;
    }

    public void display(){
        System.out.println("The Average of the Given Array is: "+ calcAvg());
    }

    public static void main(String[] args) {
        Average obj = new Average();
        obj.display();

    }
}
