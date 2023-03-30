import java.util.*;

public class sort {

    Scanner sc =new Scanner(System.in);
    
    public int []a = new int[5];

    void read_array()
    {
        System.out.println("enter the elements in the array ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
    }

    void print_array()
    {
        System.out.println(" array ");

        for(int x:a)
        {
             System.out.println(x);
        }

    }

    void sort_array()
    {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if (a[i]<a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
    }
    public static void main(String args[])
    {
        sort obj = new sort();

        obj.read_array();
        obj.print_array();
        obj.sort_array();
        obj.print_array();
    }
}
