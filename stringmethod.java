public class stringmethod {
    public static void main(String[] args) {
        String a="Atharv";
        String c="swatii";
        
        
        System.out.println(a.codePointAt(2));
        System.out.println(a.concat(c));
        System.out.println(a.compareTo(c));
        System.out.println(a.toString());
        char [] g=a.toCharArray();
        System.out.println(g);
        System.out.println(a.substring(2,3));
        System.out.println(a.split(a, 2));
    }
}
