class op {
    public static void main(String[] args) {
        int a=12,b=12,c=14,d=14;
        int res1,res2,res3,res4;
        System.out.println("value of a: "+a);
        res1=++a;
        System.out.println("After Increment: "+res1);
        System.out.println("value of b: "+b);
        res2=--b;
        System.out.println("After Decrement: "+res2);
        System.out.println("value of c: "+c);
        res3=c++;
        System.out.println("After Increment: "+res3);
        System.out.println("After Increment value of c: "+c);
         System.out.println("value of d: "+d);
        res4=d--;
        System.out.println("After Decrement: "+res4);
        System.out.println("After Decrement value of d: "+d);
    }
}
