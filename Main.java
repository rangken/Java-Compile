import java.io.IOException;

class Main{
    public static void main(String args[]){
      Test t = new Test();
      try {
			t.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
