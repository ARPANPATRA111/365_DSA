public class isPalindrom {
    public static boolean isPalindrome(int x) {
        int pal=0,m;
        m=x;
        while(x>0){
            int temp=x%10;
            pal=(pal*10)+temp;
            x=x/10;
        }   
        return pal==m;
    }

    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
}
