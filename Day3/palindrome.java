class pal {
    public static void main(String[] args) {
        int n=3553,revnum=0,r;
        int orgnum=n;
        while(n!=0)
        {
            r=n%10;
            revnum=revnum*10+r;
            n/=10;
        }
        if(orgnum==revnum)
        {
            System.out.println(orgnum +" is Palidrome.");
        }
        else
        {
            System.out.println(orgnum +" is not Palidrome.");
        }
    }
}
