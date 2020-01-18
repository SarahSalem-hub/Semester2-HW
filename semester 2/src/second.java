/**
 * Created by Sarah Salem on 01/17/2020.
 */
public class second {
    public static void main(String[] args) {


        int []a={1,2,3,4,5};
        int []b={6,7,8,9,10};
        int t=0;
        int t2=0;

        for (int i=0;i<a.length ;i++)
        {
            t+=a[i];
        }
        System.out.println(t);

        for (int i=0;i<b.length ;i++)
        {
            t2+=b[i];
        }
        System.out.println(t2);
        System.out.println(t+t2);
}}
