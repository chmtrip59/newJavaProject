public class MathRandom {
    
    int roll(){
        return (int) Math.ceil(Math.random() * 6);
        

        
    }
    
    public static void main(String[] args) {
        MathRandom dice = new MathRandom();

        for (int i = 0; i < 100; i++) {
            System.out.println(dice.roll());
        }
    }
}

