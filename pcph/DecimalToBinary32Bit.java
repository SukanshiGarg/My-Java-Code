public class DecimalToBinary32Bit {
    public static void main(String[] args) {
        int decimal = 10;
        decimalToBinary32Bit(decimal);
    }

    public static void decimalToBinary32Bit(int decimal) {
        int[] binary = new int[32];  
        int index = 31;  

        while (decimal > 0 && index >= 0) {
            binary[index--] = decimal % 2;
            decimal = decimal / 2;
        }

        
        for (int i = 0; i < 32; i++) {
            System.out.print(binary[i]);
        }
        System.out.println();  
    }
}
