package Hashmap;

public class KarpRabinO1 {
    private static int prime =101;
    private double calculateHash(String str){
        double hash =0;
        for(int i=0;i<str.length();i++){
            hash=hash+str.charAt(i)*Math.pow(prime,i);
        }
        return hash;
    }
    private double updateHash(double prevHash , char oldchar,char newchar,int patternlength){
         double newHash =(prevHash-oldchar)/prime;
        newHash =newHash+newchar* Math.pow(prime,patternlength-1);
        return newHash;
    }
    public void search(String text,String pattern){
        int patternlength =pattern.length();
        double patternhash =calculateHash(pattern);
        double texthash=calculateHash(text.substring(0,patternlength));

        for(int i=0;i<=text.length()-patternlength;i++){
            if(texthash==patternhash){
                if(text.substring(i,i+patternlength).equals(pattern)){
                    System.out.println("Pattern found at index "+i);
                }
            }
            if(i<text.length()-patternlength){
                texthash =updateHash(texthash,text.charAt(i),text.charAt(i+patternlength),patternlength);

            }
        }
    }

    public static void main(String[] args) {
        KarpRabinO1 algo=new KarpRabinO1();
        algo.search("ShreyaRoseBajaj","ose");

    }
}
