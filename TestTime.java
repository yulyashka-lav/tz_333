import org.junit.Test;
public class TestTime {
    @Test(timeout = 10000)
    public void loadMax(){
        for (int i = 1; i < 100000; i  = i + 1000){
            int[] s = random_test(i);
            Mainn._max(s);
        }
    }
    @Test(timeout = 10000)
    public void loadMin(){
        for (int i = 1; i < 100000; i  = i + 1000){
            int[] s = random_test(i);
            Mainn._min(s);
        }
    }
    @Test(timeout = 10000)
    public void loadSum(){
        for (int i = 0; i < 100000; i  = i + 1000){
            int[] s = random_test(i);
            Mainn._sum(s);
        }
    }


    @Test(timeout = 10000)
    public void loadMult(){
        for (int i = 0; i < 100000; i  = i + 1000){
            int[] s = random_test(i);
            Mainn._mult(s);
        }
    }

    private int[] random_test(int i) {
        int[] sp = new int[i];
        for (int j = 0; j < i; j++){
            sp[j] = j;
        }
        return sp;
    }
}
