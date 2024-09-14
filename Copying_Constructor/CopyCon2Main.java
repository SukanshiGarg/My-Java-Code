class CopyCon2{
    int a,b;                           //instance variables 

    CopyCon2(int x,int y){ 
        //parametrised constructor 
        a=x;
        b=y;

    }

    CopyCon2(CopyCon2 p){
        a=p.a;
        b=p.b;
    }
}
public class CopyCon2Main {
    public static void main(String[] args) {
        CopyCon2 obj1 = new CopyCon2(5,8);
        CopyCon2 obj2 = new CopyCon2(obj1);


        



        
    }
    
}
