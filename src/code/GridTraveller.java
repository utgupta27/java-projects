package code;

public class GridTraveller {

    int gridTrav(int m, int n){
        if( m == 1 && n== 1){
            return 1; 
        }
        if(m==0 || n==0){
            return 0;
        }
        return gridTrav(m,  n-1) + gridTrav(m-1, n);
    }

    public static void main(String[] args){
        GridTraveller gt  = new GridTraveller();
        System.out.println(gt.gridTrav(3, 2));
    }
}
