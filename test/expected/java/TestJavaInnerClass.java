public class TestJavaInnerClass {

    public static void main(String[] args) {
        System.out.println("hello world!");
    }

    class InnerClass {
        private String value;

        protected void setValue(String value) {
            this.value = value;
        }
    }

}