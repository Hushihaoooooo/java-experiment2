package javaÊµÑé°ü6;

public class My {
    private String s;
    public My(){
        this.s ="Constructor";
    }
    public void go() {
        System.out.println(this.s);
    }
    public static void main(String args[]) {
         My m = new My();
         m.go();
  }
}
