import org.example.Main;

public class Test extends Main {


    public Test(String s) {
        super(s);
    }
    public void  test(int a){
      super.add(a);
    }


    public static void main(String[] args) {

       new Test("suahg").add(30);
       new Test("suahg").test(50);


    }
}
