public class arrayadd {
    public int [] f(int [] numbers, int [] numbers1)
    {
        int [] f = new int [numbers.length];
        for (int i = 0; i<=f.length; i++){
            f[i]= numbers[i] + numbers1[i];
        }
        return f ;
    }
}
