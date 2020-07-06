public class MyMainClassWithSingletone
{
    public static class MySingleton
    {
        private static MySingleton ms;
        public String s;
        private MySingleton(){
            s="Single through play java";
        }
        public static MySingleton getInstance(){
            if (ms==null)ms= new MySingleton();

            return  ms;

        }
    }
    public static class MyMainClassWithSingletone{
        public static void main(String[] args){
            MySingleton ms1= MySingleton.getInstance();
            MySingleton ms2= MySingleton.getInstance();
            MySingleton ms3= MySingleton.getInstance();

            System.out.println(ms1.s);
            System.out.println(ms2.s);
            System.out.println(ms3.s);
        }

    }

}
