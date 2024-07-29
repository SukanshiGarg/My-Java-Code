package oopsjava;

public class SumOfArray {
    public static void SumArray(int arr[]){
        // void return type : does not return anything 
        int res=0;
        for(int i : arr){
            res += i;
        }
        System.out.println(res);
        //we can use a return type to return the result 
    }

    public static int Summation(int arr[]){
        //return type:int 
        //function is static no need to create the object of the class to acess this function

        int result =0;
        for(int i :arr){
            result+=i;
        }
        return result;
    }
    private static String upperFun(String str){
          return str.trim().toUpperCase();

    }
    private static int sum(int a,int b){
        return a+b;
    }



    public static void main(String args[]){
        // for void type static function calling
        int arr[]={1,2,3,4,5,5};
        SumArray(arr);

        int arr2[]={3,4,5,6,7};
        //method 1:

        int finalResult=Summation(arr2);
        System.out.println(finalResult);

        //method 2:
        System.out.println(Summation(arr2));

        String result=upperFun("  vipul ");
        System.out.println(result);

        System.out.println(sum(finalResult, finalResult));



    }
}
