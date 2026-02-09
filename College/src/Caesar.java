public class Caesar {
    public static void main(String[] args) {
        String s = "zax";
        String ansE = caesarEncrypt(s);
        String ansD = caeserDecrypt(ansE);
        System.out.println(ansE);
        System.out.println(ansD);
    }

    public static String caesarEncrypt(String s) {
        String newS = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newS.length(); i++) {
            int j = newS.charAt(i) + 3;
            if (j > 122) {
                j = j % 122 + 96;
            }
            sb.append((char) j);
        }
        return sb.toString();
    }

    public static String caeserDecrypt(String s) {
        String newS = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newS.length(); i++) {
            int j = newS.charAt(i) - 3;
            if (j < 97) {
                j = 122 + (j - 96);
            }
            sb.append((char) j);
        }
        return sb.toString();
    }
}
