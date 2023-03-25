//Method Overloading - two or more functions have the same name but different parameters(different number of parameters, different types of parameters, or both).

//EXAMPLE:

//    void func() {...}
//    void func(int a) {...}
//    void func(double a) {...}
//    void func(double a, float b) {.....}
   
//Example code:

class HelperService {
    public String formatNumber (int value) {
        return String.format("%d", value);
    }
    
    private String formatNumber (double value){
        return String.format("%.3f", value);
    }
    
    private String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }
    
    public static void main(String[] args) {
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("550"));
    }
}
