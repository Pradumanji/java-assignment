public class question1 {
    public static void main(String args[]) {
        {
            int n = 2;
             n = n<<12;
             System.out.println(n); // 4096*n
             int m = 1>>10;
             m = m<<n;
             System.out.println(m); // (1/1024)*n

        }
        
    }
};
