public class SubstractMethod {
        public int substract(int a, int b)throws MyException{
            int g;
            if(b > a){
                throw new MyException("Переменная b больше переменной a"+"\n");
            }
            else{
                g = a - b;
            }
            return g;
        }
    }
